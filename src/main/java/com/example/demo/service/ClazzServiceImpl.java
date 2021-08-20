package com.example.demo.service;

import com.example.demo.dao.ClazzMapper;
import com.example.demo.entity.Clazz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClazzServiceImpl implements ClazzService{
    @Autowired
    private ClazzMapper clazzMapper;


    @Override
    public List<Clazz> selectClazz() {
        return clazzMapper.selectClazz();
    }
}
