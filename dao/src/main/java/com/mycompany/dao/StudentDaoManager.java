/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dao;

import com.mycompany.domain.Student;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author W207777797
 */
public class StudentDaoManager {
    public void displayStudent(Student student) {
        System.out.println("Student Details : " + student);
    }
    
    public static void main(String args[]) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("student-config.xml");
       
        Student student = (Student) context.getBean("student");
        
        StudentDaoManager daoManager = new StudentDaoManager();
        daoManager.displayStudent(student);
        
        context.close();
 
    }
}
