package com.dpkProjects.hotel.repositories;

import com.dpkProjects.hotel.models.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel,String> {
}
