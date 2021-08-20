package com.example.demo.controller;

import com.example.demo.entity.Clazz;
import com.example.demo.entity.Student;
import com.example.demo.service.ClazzService;
import com.example.demo.service.StudentService;
import com.example.demo.until.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
public class StudentController {
@Autowired
    private StudentService studentservice;
@Autowired
    private ClazzService clazzService;
//查询全部
@RequestMapping("/selectStudent")
    public ModelAndView selectStudent(Student student, Page page){
    //获取总条数   //后面传的参是为了模糊查询
    int TotalCount = studentservice.getPageCount(student);
    // 把总条数赋给Page
    page.setTotalCount(TotalCount);
    //计算所有的参数
    page.calculatePage();
    student.setStartPos(page.getStartPos());
    //分页列表
    List<Student> students = studentservice.selectStudent(student);
    List<Clazz> clazzes = clazzService.selectClazz();
    ModelAndView mav = new ModelAndView();
    mav.addObject("page", page);
    mav.addObject("students",students);
    mav.addObject("clazzes",clazzes);
    //这里是如果页面不点击下一页 不调用ajax函数则 int类型的flag默认为0 判断 为1则局部刷新其余2/3页面 page_list
    if (page.getFlag() == 1) {
        mav.setViewName("page_list");

    } else {
        mav.setViewName("student_list");

    }
    return mav;
}
//删除
@RequestMapping("/deleteStudent")
    public String deleteStudent(Integer sid){
    studentservice.deleteStudent(sid);
    return "redirect:/selectStudent";
}
//单查
@RequestMapping("/getStudentById")
    public ModelAndView getStudentById(int sid){
        Student student = studentservice.getStudentById(sid);
        List<Clazz> clazzes = clazzService.selectClazz();
        ModelAndView mav = new ModelAndView();
        mav.addObject("student",student);
        mav.addObject("clazzes",clazzes);
        mav.setViewName("update_student");

        return mav;
}
    //去添加页面
    @RequestMapping("/studentadd")
    public String addStudent(){
        return "add_student";
    }
    //添加
    @RequestMapping("/addStudent")
    public String addStudent(Student student){
    studentservice.addStudent(student);
        return "redirect:/selectStudent";
}
    @RequestMapping("/updateStudent")
    public String updateStudent(Student student){
        studentservice.updateStudent(student);
        return "redirect:/selectStudent";

    }
    @RequestMapping("/deleteBatch")
    public void deleteBatch(String ids, HttpServletResponse resp) throws IOException {
        resp.setCharacterEncoding("utf-8");
        studentservice.deleteBatch(ids);
        //前台用的ajax等回调函数 重定向 这句话是专门和ajax做交互的 发生消息  此处写count几条mapper需要写返回值void改成int

        resp.getWriter().write("成功删除 ");
    }
}
