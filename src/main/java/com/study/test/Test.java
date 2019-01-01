package com.study.test;

import com.study.service.StudentService;
import com.study.service.serviceimpl.StudentServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
    springioc注解流程:
    springioc的注解只需要在配置文件里面配置扫描包即可，
    其他都交由注解来处理
*/
public class Test {
    public static void main(String[] args) {
        ApplicationContext app= new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentService sservice = (StudentService)app.getBean("sservice");
        sservice.getitAll();
    }
}
