package com.cydeo.controller;

import com.cydeo.enums.Gender;
import com.cydeo.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MentorController {

    @RequestMapping("/table")
    public String tablePage(Model model){
        Mentor mentor1 = new Mentor("Mike", "Smith", Gender.MALE);
        Mentor mentor2 = new Mentor("Tom", "Hanks", Gender.MALE);
        Mentor mentor3 = new Mentor("Ammy", "Bryan", Gender.FEMALE);

        model.addAttribute("mentor1", mentor1);
        model.addAttribute("mentor2", mentor2);
        model.addAttribute("mentor3", mentor3);

        return "mentor/table";
    }

}
