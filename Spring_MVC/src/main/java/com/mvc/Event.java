package com.mvc;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// Model은 전달하고싶은 객체로 Application에서 다루는 POJO 객체이다.

// lombok annotation을 사용하여 Compile 시점에 자동으로 필요한 것들을 추가되도록 한다.
@Getter @Setter
@Builder @NoArgsConstructor @AllArgsConstructor
public class Event {
  
  private String name;
  
  private int limitOfEnrollment;
  
  private LocalDateTime startDateTime;
  
  private LocalDateTime endDateTime;
}