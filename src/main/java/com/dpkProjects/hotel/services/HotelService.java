package com.dpkProjects.hotel.services;

import com.dpkProjects.hotel.exceptions.ResourceNotFoundException;
import com.dpkProjects.hotel.models.Hotel;
import org.springframework.stereotype.Service;

import java.util.List;


public interface HotelService {

    Hotel createHotel(Hotel hotel);

    List<Hotel> getAllHotel();

    Hotel getHotelById(String id) throws ResourceNotFoundException;
}
