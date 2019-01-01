package com.study.dao.daoImpl;

import com.study.dao.StudentDao;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Component("sdao")
@Repository("sdao")
@Scope(scopeName = "singleton")
public class StudentDaoImpl implements StudentDao {
    @Override
    public List getAll() {
        System.out.println("userdao---");
        return null;
    }
}
