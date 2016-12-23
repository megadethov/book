package ua.mega.aop.annotation_config;

import java.util.List;

public interface TaskProvider<T> {
    List<Task<T>> getAllTasks();
}
