package com.inventory_management.ws.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "warehouse")
@Data
@EqualsAndHashCode(callSuper = true)
public class Warehouse extends BaseEntity implements Serializable {
    @Column(name = "warehouse_name",nullable = false)
    private String name;
    @Column(name = "count")
    private Long count;
    @Column(name = "address",nullable = false)
    private String address;
    @Column(name = "area",nullable = false)
    private String area;
    @Column(name = "city",nullable = false)
    private String city;
    @ManyToOne(fetch = FetchType.LAZY,cascade = {CascadeType.ALL},optional=false)
    @JoinColumn(name="id",referencedColumnName="id",insertable=false, updatable=false,nullable = false)
    private Category category;
}
