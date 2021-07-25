package com.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EventController {
  
  @Autowired
  EventService eventService;
  
  // events라는 GET 요청이 들어오는 경우
  // Spring 4.3부터 @GetMapping("events")으로도 GET요청을 처리할 수 있다.
  @RequestMapping(value = "/events", method = RequestMethod.GET)
  public String events(Model model) {
    // Model은 Java의 Map이라고 생각하면 된다.
    
    model.addAttribute("events", eventService.getEvents());
    
    // Spring에서 동적인 View는 resources/templates에서 찾는다.
    return "events";
  }
}
