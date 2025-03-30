package com.example.demo1.controller;

import com.example.demo1.vo.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.*;

import java.util.*;

@Controller
public class TodoController {
  private List<Todo> todos = new ArrayList<>();
  private int nextTno = 1;

  @GetMapping("/todo/list")
  public ModelAndView list() {
    return new ModelAndView("/todo/list").addObject("todos", todos);
  }

  @GetMapping("/todo/write")
  public void write() { }

  @PostMapping("/todo/write")
  public String write(Todo todo) {
    todo.setTno(nextTno++);
    todos.add(todo);
    return "redirect:/todo/list";
  }

  @PostMapping("/todo/update")
  public String update(int tno, String title, String content) {
    for (Todo todo : todos) {
      if (todo.getTno() == tno) {
        todo.update(title, content);
      }
    }
    return "redirect:/todo/list";
  }

  @PostMapping("/todo/delete")
  public String delete(int tno) {
    for(Todo todo:todos) {
      if(todo.getTno() == tno) {
        todos.remove(todo);
      }
    }
    return "redirect:/todo/list";
  }
}
