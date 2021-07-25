package com.mvc;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class EventService {

	public List<Event> getEvents() {

		List<Event> list = new LinkedList<>();
		
		Event event1 = Event.builder().name("스프링 웹 MVC 스터디 1차").limitOfEnrollment(5)
				.startDateTime(LocalDateTime.of(2019, 1, 10, 10, 0)).startDateTime(LocalDateTime.of(2019, 1, 10, 17, 0))
				.build();

		Event event2 = Event.builder().name("스프링 웹 MVC 스터디 2차").limitOfEnrollment(5)
				.startDateTime(LocalDateTime.of(2019, 1, 17, 10, 0)).startDateTime(LocalDateTime.of(2019, 1, 17, 12, 0))
				.build();

		list.add(event1);
		list.add(event2);
		return list;
	}
}