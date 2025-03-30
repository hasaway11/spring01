package com.example.demo1.controller;

import com.example.demo1.vo.*;
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

  @GetMapping("/exam2/test23")
  public ModelAndView test3() {
    Sungjuk sungjuk = Sungjuk.builder().username("spring").kor(75).eng(80).build();
    sungjuk.setTot(sungjuk.getKor() + sungjuk.getEng());
    sungjuk.setPass(sungjuk.getKor()>=70 && sungjuk.getEng()>=70);
    return new ModelAndView("exam2/test23").addObject("sungjuk", sungjuk);
  }

  @GetMapping("/exam2/test24")
  public ModelAndView test4() {
    Sungjuk sungjuk = new Sungjuk("spring", 75, 80);
    return new ModelAndView("exam2/test24").addObject("sungjuk", sungjuk);
  }
}
