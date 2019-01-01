package com.study.dao.daoImpl;

import com.study.dao.StudentDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Component("sdao2")
@Repository("sdao2")
public class StudentDaoImpl2 implements StudentDao {
    @Override
    public List getAll() {
        System.out.println("sdao2---");
        return null;
    }
}
