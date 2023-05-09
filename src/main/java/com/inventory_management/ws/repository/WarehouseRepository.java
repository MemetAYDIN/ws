package com.inventory_management.ws.repository;


import com.inventory_management.ws.model.Inventory;
import com.inventory_management.ws.model.Warehouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface WarehouseRepository extends JpaRepository<Warehouse,Long> {
    Optional<Warehouse>  findById(Long warehouseNo);

}
