package com.inventory_management.ws.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "inventory")
@Data
@EqualsAndHashCode(callSuper = true)
public class Inventory extends BaseEntity implements Serializable {
    @Column(name ="category_name", nullable = false)
    private String categoryName;
    @Column(name ="product_count")
    private Long productCount;
}
