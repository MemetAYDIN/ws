package com.inventory_management.ws.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "categories")
@Data
@EqualsAndHashCode(callSuper = true)
public class Category extends BaseEntity implements Serializable {
/*    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="category-id",updatable = false, nullable = false)
    private Long categoryId;*/

    @Column(name = "category_name",nullable = false)
    private String name;

    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.ALL}, mappedBy = "category")
    public List<Warehouse> warehouses;


}
