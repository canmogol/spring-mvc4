package com.fererlab.controller;

import com.fererlab.model.Event;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EventsReportController {

    @RequestMapping(value = "/events")
    public List<Event> getEvents() {
        List<Event> events = new ArrayList<>();

        Event event1 = new Event();
        event1.setName("Java User Group");
        events.add(event1);

        Event event2 = new Event();
        event2.setName("Angular User Group");
        events.add(event2);

        return events;
    }

}
