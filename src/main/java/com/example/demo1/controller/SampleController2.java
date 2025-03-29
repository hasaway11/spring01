package com.example.demo1.controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.*;

@Controller
public class SampleController2 {
  @GetMapping("/exam2/test21")
  public ModelAndView test1() {
    return new ModelAndView("exam2/test21").addObject("message", "잘못된 작업입니다!");
  }

  @GetMapping("/exam2/test22")
  public ModelAndView test2() {
    return new ModelAndView("exam2/test22").addObject("message", "잘못된 작업입니다!");
  }

}
