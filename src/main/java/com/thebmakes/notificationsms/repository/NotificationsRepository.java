package com.thebmakes.notificationsms.repository;

import com.thebmakes.notificationsms.entity.Notification;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationsRepository extends MongoRepository<Notification, String> {
}
