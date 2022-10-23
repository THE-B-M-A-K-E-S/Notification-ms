package com.thebmakes.notificationsms.service;

import com.thebmakes.notificationsms.repository.NotificationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotificationsService {
    @Autowired
    public NotificationsRepository notificationsRepository;
}
