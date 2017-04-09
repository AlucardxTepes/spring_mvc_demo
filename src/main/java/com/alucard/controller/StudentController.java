package com.alucard.controller;

import com.alucard.model.Student;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Alucard on 4/9/2017.
 */
@Controller
@RequestMapping("/student")
public class StudentController {
  
  @RequestMapping("/showForm")
  public String showForm(Model m) {
    
    // Create student obj
    Student student = new Student();
    
    // add student obj to the model
    m.addAttribute("student", student);
    
    return "student-form";
  }
  
  @RequestMapping("/processForm")
  public String processForm(@ModelAttribute("student") Student student) {
    
    // log the input data
    System.out.println("Student: " + student.getFirstName() + " " + student.getLastName());
    return "student-confirmation";
  }
  
  
}
