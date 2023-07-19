package com.blog.gallery.service.notification;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SenderNotificationService implements NotificationService {

    private final EmailService emailService;

    @Override
    public void sendNotification(CommentNotification commentNotification) {
        String recipientEmail = commentNotification.getComment().getAuthor().getEmail();
        String subject = "New Comment Notification";
        String body = "Hi " + recipientEmail + ",\n\n"
                + "You have a new comment on your blog post.\n\n"
                + "Comment: " + commentNotification.getComment().getText() + "\n\n"
                + "Best regards,\n";

        emailService.sendEmail(recipientEmail, subject, body);
    }

    @Override
    public void sendNotification(FriendshipNotification friendshipNotification) {
        String recipientEmail = friendshipNotification.getFriend().getEmail();
        String subject = "Friendship Notification";
        String body = "Hi " + recipientEmail + ",\n\n"
                + "You have been added as a friend by "
                + friendshipNotification.getUser().getEmail() + ".\n"
                + "Start connecting and sharing!\n\n"
                + "Best regards,\n";

        emailService.sendEmail(recipientEmail, subject, body);
    }

    @Override
    public void sendNotification(LikeNotification likeNotification) {
        String recipientEmail = likeNotification.getLiker().getEmail();
        String subject = "New Like Notification";
        String body = "Hi " + recipientEmail + ",\n\n"
                + "Your blog post has received a new like.\n\n"
                + "Best regards,\n";
        emailService.sendEmail(recipientEmail, subject, body);
    }
}
