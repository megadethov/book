package ua.mega.hibernate.model.controllers;

import org.springframework.transaction.annotation.Transactional;
import ua.mega.hibernate.model.Dish;
import ua.mega.hibernate.model.DishCategory;
import ua.mega.hibernate.model.dao.DishDao;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DishController {

    private DishDao dishDao;

    @Transactional
    public void createDish() {

        Dish plov = new Dish();
        plov.setName("Plov");
        plov.setCategory(DishCategory.MAIN);
        plov.setPrice(5.00F);
        plov.setWeight(300.00F);

        Dish salad = new Dish();
        salad.setName("Salad");
        salad.setCategory(DishCategory.SALAD);
        salad.setPrice(2.00F);
        salad.setWeight(200.00F);

        Dish potato = new Dish();
        potato.setName("Potato");
        potato.setCategory(DishCategory.SALAD);
        potato.setPrice(2.00F);
        potato.setWeight(100.00F);

        Set<Dish> dishes = new HashSet<>(dishDao.findAll());
        if (!dishes.contains(plov)) {
            dishDao.save(plov);
        }
        if (!dishes.contains(salad)) {
            dishDao.save(salad);
        }
        if (!dishes.contains(potato)) {
            dishDao.save(potato);
        }
    }

    @Transactional
    public List<Dish> getAllDishes() {
        return dishDao.findAll();
    }

    @Transactional
    public Dish getDishByName(String name) {
        return dishDao.findByName(name);
    }


    public void setDishDao(DishDao dishDao) {
        this.dishDao = dishDao;
    }
}
