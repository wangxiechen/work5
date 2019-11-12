package com.wxc.demo;

import com.wxc.demo.dao.StudentRepository;
import com.wxc.demo.entity.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentTest {
    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void test1(){//查询姓名
//        Student stu = studentRepository.findByName("小美");
//        System.out.println(stu);

        //返回小宇11.11号的日期
        Calendar instance = Calendar.getInstance();
        instance.set(2019,10,11);//月份减1
        Date date = instance.getTime();
        List<Student> students = studentRepository.findByBirthdayIsLessThan(date);
        System.out.println(students);
    }

    @Test
    public void test2(){//添加
        Student stu = new Student();
        stu.setId(1);//根据id修改
        stu.setName("哈哈");
        stu.setBirthday(new Date());
        studentRepository.save(stu);
    }

    @Test
    public void test3(){//删除
       studentRepository.deleteById(4);
    }

    @Test
    public void test4(){//Optional 是JDK8的特性   get 、isPresent
        Optional<Student> byId = studentRepository.findById(1);
        System.out.println(byId.isPresent());//true 是否存在

    }

}
