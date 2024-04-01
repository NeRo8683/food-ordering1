package com.nero.fiore.service;

import com.nero.fiore.model.Category;
import com.nero.fiore.model.Food;
import com.nero.fiore.model.Restaurant;
import com.nero.fiore.request.CreateFoodRequest;

import java.util.List;

public interface FoodService {

    public Food createFood(CreateFoodRequest req, Category category, Restaurant restaurant);

    void deleteFood(Long foodId)throws Exception;

    public List<Food>getRestaurantFood(Long restaurantId,
                                       boolean isVegetarian,
                                       boolean isNonVeg,
                                       boolean isSeasonal,
                                       String foodCategory
    );

    public List<Food>searchFood(String keyword);
    public Food findFoodById(Long foodId)throws Exception;
    public Food updateAvailabilityStatus(Long foodId)throws Exception;
}
