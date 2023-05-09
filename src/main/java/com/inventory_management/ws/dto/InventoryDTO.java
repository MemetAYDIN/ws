package com.inventory_management.ws.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = true)
public class InventoryDTO extends BaseEntityDTO implements Serializable {
    private String categoryName;
    private Long productCount;
}
