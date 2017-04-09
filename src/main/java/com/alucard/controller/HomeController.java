package com.alucard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Alucard on 4/9/2017.
 */

@Controller
public class HomeController {
  
  @RequestMapping("/")
  public String home() {
    return "main-menu";
  }
}
