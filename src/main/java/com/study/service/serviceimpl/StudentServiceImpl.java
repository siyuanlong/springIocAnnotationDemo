package com.study.service.serviceimpl;

import com.study.dao.daoImpl.StudentDaoImpl;
import com.study.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

//@Component("sservice")
@Service("sservice")
//没有括号时，默认是首字母小写后的类名
public class StudentServiceImpl implements StudentService {
    @Autowired     //自动注入（byType）
    @Qualifier("sdao2")//当有多个类时，使用该注解指定
    //@Resource(name="sdao2")=@Autowired+@Qualifier("sdao2")
    private StudentDaoImpl studentDao;
    @Override
    public List getitAll() {
        System.out.println("service---");
        studentDao.getAll();
        return null;
    }
}
