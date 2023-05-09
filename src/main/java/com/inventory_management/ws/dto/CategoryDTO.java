package com.inventory_management.ws.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
public class CategoryDTO extends BaseEntityDTO implements Serializable {
    private String name;
    public List<WarehouseDTO> warehouses;


}
