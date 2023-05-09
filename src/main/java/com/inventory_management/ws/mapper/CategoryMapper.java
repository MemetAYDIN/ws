package com.inventory_management.ws.mapper;


import com.inventory_management.ws.dto.CategoryDTO;
import com.inventory_management.ws.model.Category;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface CategoryMapper extends BaseMapper<Category, CategoryDTO>{
}
