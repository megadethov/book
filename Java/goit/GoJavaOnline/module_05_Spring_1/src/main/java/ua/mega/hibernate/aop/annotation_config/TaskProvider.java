package ua.mega.hibernate.aop.annotation_config;

import java.util.List;

public interface TaskProvider<T> {
    List<Task<T>> getAllTasks();
}
