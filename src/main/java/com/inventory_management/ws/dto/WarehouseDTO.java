package com.inventory_management.ws.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = true)
public class WarehouseDTO extends BaseEntityDTO implements Serializable {
    private String name;
    private Long count;
    private String address;
    private String area;
    private String city;
    private CategoryDTO category;
}
