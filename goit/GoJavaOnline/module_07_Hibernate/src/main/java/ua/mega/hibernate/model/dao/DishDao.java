package ua.mega.hibernate.model.dao;

import ua.mega.hibernate.model.Dish;

import java.util.List;

public interface DishDao {

    void save(Dish dish);

    List<Dish> findAll();

}
