package com.example.Online.Food.Delivery.Backend.System.resporitory;

import com.example.Online.Food.Delivery.Backend.System.models.Menu;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepo extends JpaRepository<Menu, Integer> {
}