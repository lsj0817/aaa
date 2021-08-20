package com.example.demo.service;
import com.example.demo.entity.Student;
import java.util.List;


public interface StudentService {
    //查询所有
    List<Student> selectStudent(Student student);
    //添加
    int addStudent(Student student);
    //删除
    int deleteStudent(Integer sid);
    //单查
    Student getStudentById(int sid);
    //修改
    int updateStudent(Student student);
    //总条数  用来模糊查询
    public int getPageCount(Student student);
    public void deleteBatch(String ids);
}
