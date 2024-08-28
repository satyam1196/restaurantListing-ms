package com.RestaurantApp.restaurantListing.service;

import com.RestaurantApp.restaurantListing.dto.RestaurantDTO;
import com.RestaurantApp.restaurantListing.entity.Restaurant;
import com.RestaurantApp.restaurantListing.mapper.RestaurantMapper;
import com.RestaurantApp.restaurantListing.repo.RestaurantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantService {

    @Autowired
    RestaurantRepo restaurantRepo;

    public List<RestaurantDTO> findAllRestaurants() {
       List<Restaurant> restaurants = restaurantRepo.findAll();

        return restaurants.stream().map(
               RestaurantMapper.INSTANCE::mapRestaurantDTOToRestaurant
       ).toList();
    }
}
