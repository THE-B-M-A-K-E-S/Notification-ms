package com.thebmakes.notificationsms.controller;

import com.thebmakes.notificationsms.entity.Notification;
import com.thebmakes.notificationsms.service.NotificationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/notifications")
public class NotificationsController {

    @Autowired
    private NotificationsService notificationsService;

    @GetMapping("")
    public List<Notification> findAll() {
        return notificationsService.findAll();
    }
}
