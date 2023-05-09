package com.inventory_management.ws.controller;


import com.inventory_management.ws.dto.WarehouseDTO;
import com.inventory_management.ws.service.WarehouseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
@RequiredArgsConstructor
public class WarehouseController {
    private final WarehouseService warehouseService;

    @GetMapping
    ResponseEntity<List<WarehouseDTO>> getAllList(){
        return ResponseEntity.ok(warehouseService.getAllList());
    }

    @PostMapping
    ResponseEntity<WarehouseDTO> create(@RequestBody WarehouseDTO warehouseDTO){
        return ResponseEntity.ok(warehouseService.create(warehouseDTO));
    }

    @PutMapping
    ResponseEntity<WarehouseDTO> update(@RequestBody WarehouseDTO warehouseDTO){
        return ResponseEntity.ok(warehouseService.update(warehouseDTO));
    }

    @GetMapping("/{id}")
    ResponseEntity<WarehouseDTO> getById(@PathVariable Long id){
        return ResponseEntity.ok(warehouseService.getById(id));
    }
}
