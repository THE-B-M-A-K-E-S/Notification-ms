package com.thebmakes.notificationsms.repository;

import com.thebmakes.notificationsms.entity.Notification;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NotificationsRepository extends MongoRepository<Notification, String> {
    List<Notification> findByUser(String user);
}
