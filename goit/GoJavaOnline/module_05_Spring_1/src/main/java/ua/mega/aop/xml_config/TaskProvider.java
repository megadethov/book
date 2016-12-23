package ua.mega.aop.xml_config;

import java.util.List;

public interface TaskProvider<T> {
    List<Task<T>> getAllTasks();
}
