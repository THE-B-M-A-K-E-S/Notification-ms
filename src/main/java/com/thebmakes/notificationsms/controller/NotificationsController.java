package com.thebmakes.notificationsms.controller;

import com.thebmakes.notificationsms.entity.Notification;
import com.thebmakes.notificationsms.repository.NotificationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/notifications")
public class NotificationsController {
    @Autowired
    private NotificationsRepository repository;

    @GetMapping("")
    public List<Notification> findAll() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Notification findById(@PathVariable String id){
        return repository.findById(id).get();
    }

    @GetMapping("/user/{user}")
    public List<Notification> findByUser(@PathVariable String user){
        return (List<Notification>) repository.findByUser(user);
    }

    @PostMapping("")
    public Notification add(@RequestBody Notification notification){
        return repository.save(notification);
    }

    @PutMapping("")
    @ResponseBody
    public ResponseEntity<String> update(@RequestBody Notification notification){
        if(repository.existsById(notification.getId())) {
            repository.save(notification);
            return ResponseEntity.status(HttpStatus.ACCEPTED).body("Resource updated.");
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Resource not found.");
    }

    @PutMapping("/see/{id}")
    @ResponseBody
    public ResponseEntity<String> see(@PathVariable String id){
        if(repository.existsById(id)) {
            Notification notification = repository.findById(id).get();
            notification.setViewed(true);
            repository.save(notification);
            return ResponseEntity.status(HttpStatus.ACCEPTED).body("Resource updated.");
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Resource not found.");
    }

    @DeleteMapping("/{id}")
    @ResponseBody
    public ResponseEntity<String> delete(@PathVariable String id){
        if(repository.existsById(id)) {
            repository.deleteById(id);
            return ResponseEntity.status(HttpStatus.ACCEPTED).body("Resource deleted.");
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Resource not found.");
    }
}
