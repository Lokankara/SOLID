package com.blog.gallery.service.notification;

public interface EmailService {
    void sendEmail(String recipient, String subject, String message);
}
