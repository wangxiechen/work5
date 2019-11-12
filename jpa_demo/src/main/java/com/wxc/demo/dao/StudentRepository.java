package com.wxc.demo.dao;


import com.wxc.demo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Integer> {

    //JPA 查询接口的命名规范
    Student findByName(String name);

    //自定义的注解
    List<Student> findByBirthdayIsLessThan(Date date);


}
