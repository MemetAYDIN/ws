package com.inventory_management.ws.controller;


import com.inventory_management.ws.dto.InventoryDTO;
import com.inventory_management.ws.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
@RequiredArgsConstructor
public class InventoryController {
    private final InventoryService inventoryService;

    @GetMapping
    ResponseEntity<List<InventoryDTO>> getAllList(){
        return ResponseEntity.ok(inventoryService.getAllList());
    }

    @PostMapping
    ResponseEntity<InventoryDTO> create(@RequestBody InventoryDTO inventoryDTO){
        return ResponseEntity.ok(inventoryService.create(inventoryDTO));
    }

    @PutMapping
    ResponseEntity<InventoryDTO> update(@RequestBody InventoryDTO inventoryDTO){
        return ResponseEntity.ok(inventoryService.update(inventoryDTO));
    }

    @GetMapping("/{id}")
    ResponseEntity<InventoryDTO> getById(@PathVariable Long id){
        return ResponseEntity.ok(inventoryService.getById(id));
    }
}
