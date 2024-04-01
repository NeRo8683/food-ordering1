package com.nero.fiore.request;

import com.nero.fiore.model.Category;
import com.nero.fiore.model.IngredientsItem;
import lombok.Data;

import java.util.List;

@Data
public class CreateFoodRequest {

    private String name;
    private String description;
    private Long price;

    private Category category;
    private List<String> images;

    private Long restaurantId;
    private boolean vegetarian;//
    private boolean seasonal;//seasional
    private List<IngredientsItem> ingredients;
}
