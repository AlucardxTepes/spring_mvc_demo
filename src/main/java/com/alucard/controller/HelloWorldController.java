package com.alucard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Alucard on 4/9/2017.
 */
@Controller
public class HelloWorldController {
  
  @RequestMapping("/showform")
  public String showForm() {
    return "helloworld-form";
  }
  
  @RequestMapping("/processForm")
  public String processForm(@RequestParam("studentName") String name, Model m) {
    m.addAttribute("newName", name.toUpperCase());
    return "helloworld";
  }
}
