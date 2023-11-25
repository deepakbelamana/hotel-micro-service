package com.dpkProjects.hotel.services.impl;

import com.dpkProjects.hotel.exceptions.ResourceNotFoundException;
import com.dpkProjects.hotel.models.Hotel;
import com.dpkProjects.hotel.repositories.HotelRepository;
import com.dpkProjects.hotel.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    HotelRepository hotelRepository;


    /**
     * @param hotel
     * @return
     */
    @Override
    public Hotel createHotel(Hotel hotel) {
        String hotelId = UUID.randomUUID().toString();
        hotel.setId(hotelId);
        return hotelRepository.save(hotel);
    }

    /**
     * @return
     */
    @Override
    public List<Hotel> getAllHotel() {
        return hotelRepository.findAll();
    }


    /**
     * @param id
     * @return
     */
    @Override
    public Hotel getHotelById(String id)  {
        return hotelRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Hotel with given id " + id+ " not found"));
    }
}
