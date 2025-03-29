package com.example.demo1.controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.*;

@Controller
public class SampleController1 {
  @GetMapping("/test1")
  public ModelAndView test1() {
    return new ModelAndView("test1").addObject("message", "Hello World!");
  }

  @GetMapping("/test2")
  public ModelAndView test2() {
    return new ModelAndView("test2").addObject("username", "spring");
  }

  @GetMapping("/test3")
  public ModelAndView test3() {
    int val1 = 10;
    int val2 = 20;
    int result = val1 + val2;
    return new ModelAndView("test3").addObject("val1", val1).addObject("val2", val2);
  }
}
