package com.example.demo1.controller;

import com.example.demo1.vo.*;
import jakarta.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Controller
public class SampleController3 {
  private List<Sungjuk> list = new ArrayList<>();

  @PostConstruct
  public void init() {
    list.add(new Sungjuk("kim", 90, 90));
    list.add(new Sungjuk("spring", 70, 90));
    list.add(new Sungjuk("lee", 60, 80));
    list.add(new Sungjuk("song", 80, 60));
    list.add(new Sungjuk("summer", 90, 90));
    list.add(new Sungjuk("jung", 90, 70));
    list.add(new Sungjuk("winter", 90, 90));
    list.add(new Sungjuk("fall", 80, 90));
  }

  @GetMapping("/exam3/test31")
  public String test1(Model model) {
    model.addAttribute("list", list);
    return "exam3/test31";
  }
}
