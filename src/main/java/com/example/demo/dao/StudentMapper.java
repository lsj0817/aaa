package com.example.demo.dao;

import com.example.demo.entity.Student;


import java.util.List;

public interface StudentMapper {
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
    public void deleteBatch(List<Integer> idList);
}
