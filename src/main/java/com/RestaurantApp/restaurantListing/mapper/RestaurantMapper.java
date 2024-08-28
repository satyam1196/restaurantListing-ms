package com.RestaurantApp.restaurantListing.mapper;

import com.RestaurantApp.restaurantListing.dto.RestaurantDTO;
import com.RestaurantApp.restaurantListing.entity.Restaurant;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RestaurantMapper {

    RestaurantMapper INSTANCE= Mappers.getMapper(RestaurantMapper.class);

    RestaurantDTO mapRestaurantDTOToRestaurant(Restaurant restaurant);
    Restaurant mapRestaurantToRestaurantDTO(RestaurantDTO restaurantDTO);
}
