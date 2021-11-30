package com.example.sinabroproject.controller.email;

import com.example.sinabroproject.service.mail.MailService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@ResponseBody
@RestController
public class MailController {

    private final MailService mailService;

    public MailController(MailService mailService) {
        this.mailService = mailService;
    }

    @GetMapping("email")
    @ResponseBody
    public String SendMail(@RequestParam String email) {
        return mailService.SendMail(email);
    }
}
