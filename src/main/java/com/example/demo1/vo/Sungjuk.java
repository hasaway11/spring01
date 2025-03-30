package com.example.demo1.vo;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class Sungjuk {
  private String username;
  private int kor;
  private int eng;
  private int tot;
  private boolean pass;

  public Sungjuk(String username, int kor, int eng) {
    this.username = username;
    this.kor = kor;
    this.eng = eng;
    this.tot = kor + eng;
    this.pass = this.kor>=70 && this.eng>=70;
  }
}
