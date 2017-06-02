package ua.mega.hibernate.aop;

import java.util.List;

public interface TaskProvider<T> {
    List<Task<T>> getAllTasks();
}
