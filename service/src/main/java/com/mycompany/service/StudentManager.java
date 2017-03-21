/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.service;

import com.mycompany.dao.StudentDaoManager;
import com.mycompany.domain.Student;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentManager implements StudentManagerInterface {

    @Override
    public void displayStudent(Student student) {
        StudentDaoManager daoManager = new StudentDaoManager();
        daoManager.displayStudent(student);
    }
    
    public static void main(String args[]) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("student-config.xml");
       
        Student student = (Student) context.getBean("student");
        StudentManager manager = new StudentManager();
        manager.displayStudent(student);
        
        context.close();
 
    }
}
