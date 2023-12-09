package org.example.ind11bot.repository;

import org.example.ind11bot.model.NotificationTask;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface NotificationRepository extends JpaRepository<NotificationTask, Long> {

    List<NotificationTask> findAllByDateTime(LocalDateTime dateTime);
}
