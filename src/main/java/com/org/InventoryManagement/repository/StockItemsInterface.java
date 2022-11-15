package com.org.InventoryManagement.repository;


import com.org.InventoryManagement.entity.StockItemsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockItemsInterface extends JpaRepository<StockItemsEntity, String> {
}
