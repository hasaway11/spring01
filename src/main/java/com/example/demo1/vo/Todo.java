package com.example.demo1.vo;

import lombok.*;
import org.springframework.format.annotation.*;

import java.time.*;

@Getter
public class Todo {
  @Setter
  private int tno;
  private String title;
  private String content;
  private LocalDate regdate = LocalDate.now();
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  private LocalDate deadline;
  private boolean finish = false;

  public Todo(int tno, String title, String content, String deadline) {
    this.tno = tno;
    this.title = title;
    this.content = content;
    this.deadline = LocalDate.parse(deadline);
  }

  public void update(String title, String content)  {
    this.title = title;
    this.content = content;
  }

  public void finish() {
    this.finish = true;
  }
}
