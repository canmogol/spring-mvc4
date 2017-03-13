package com.fererlab.controller;

import com.fererlab.model.Event;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("event") // now @ModelAttribute("event") is session scoped
public class EventController {

    @RequestMapping(value = "/event", method = RequestMethod.GET)
    public String displayEventPage(Model model) {
        Event event = new Event();
        event.setName("Java user group");
        model.addAttribute("event", event);
        return "event";
    }

    @RequestMapping(value = "/event", method = RequestMethod.POST)
    public String handlePost(@ModelAttribute("event")/*request scoped*/ Event event) {
        System.out.println("event = " + event);
        return "redirect:index.html";
    }

}
