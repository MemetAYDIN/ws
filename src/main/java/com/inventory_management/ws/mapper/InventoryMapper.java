package com.inventory_management.ws.mapper;


import com.inventory_management.ws.dto.InventoryDTO;
import com.inventory_management.ws.model.Inventory;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface InventoryMapper extends BaseMapper<Inventory, InventoryDTO>{
}
