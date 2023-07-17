package com.jpa.course.JPA.course.dao;

import com.jpa.course.JPA.course.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO{



    private EntityManager entityManager;

    @Autowired
    public EmployeeDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }





    @Override
    @Transactional
    public void save(Employee employee){

        entityManager.persist(employee);

    }
}
