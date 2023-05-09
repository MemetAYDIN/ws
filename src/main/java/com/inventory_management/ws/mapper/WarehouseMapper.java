package com.inventory_management.ws.mapper;


import com.inventory_management.ws.dto.WarehouseDTO;
import com.inventory_management.ws.model.Warehouse;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface WarehouseMapper extends BaseMapper<Warehouse, WarehouseDTO>{
}
