package com.thebmakes.notificationsms.service;

import com.thebmakes.notificationsms.entity.Notification;
import com.thebmakes.notificationsms.repository.NotificationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationsService {
    @Autowired
    private NotificationsRepository notificationsRepository;

    public List<Notification> findAll() {
        return notificationsRepository.findAll();
    }
}
