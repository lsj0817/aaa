package com.example.demo.service;

import com.example.demo.dao.StudentMapper;
import com.example.demo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Student> selectStudent(Student student) {
        return studentMapper.selectStudent(student);
    }

    @Override
    public int addStudent(Student student) {
        return studentMapper.addStudent(student);
    }

    @Override
    public int  deleteStudent(Integer sid) {
        return studentMapper.deleteStudent(sid);

    }

    @Override
    public Student getStudentById(int sid) {
        return studentMapper.getStudentById(sid);
    }

    @Override
    public int updateStudent(Student student) {
        return studentMapper.updateStudent(student);
    }
    @Override
    public int getPageCount(Student student) {
        return studentMapper.getPageCount(student);
    }

    @Override
    public void deleteBatch(String ids) {
        List<Integer> idList = new ArrayList<Integer>();
        String[] idArr = ids.split(",");//用中间的都好把数组隔开放在数组里
        for (String id : idArr) {
            idList.add(Integer.parseInt(id));
        }
        studentMapper.deleteBatch(idList);
    }
}
