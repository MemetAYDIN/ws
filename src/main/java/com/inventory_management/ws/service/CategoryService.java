package com.inventory_management.ws.service;

import com.inventory_management.ws.dto.CategoryDTO;
import com.inventory_management.ws.exception.GenericServiceException;
import com.inventory_management.ws.mapper.CategoryMapper;
import com.inventory_management.ws.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class CategoryService {
    private final CategoryRepository categoryRepository;
    private final CategoryMapper categoryMapper;
    public List<CategoryDTO> getAllList() {
        return categoryMapper.toDTOList(categoryRepository.findAll());
    }

    @Transactional
    public CategoryDTO create(CategoryDTO categoryDTO) {
        return categoryMapper.toDTO(categoryRepository.save(categoryMapper.toEntity(categoryDTO)));
    }

    @Transactional
    public CategoryDTO update(CategoryDTO categoryDTO) {
        getById(categoryDTO.getId());
        return categoryMapper.toDTO(categoryRepository.save(categoryMapper.toEntity(categoryDTO)));
    }

    public CategoryDTO getById(Long id){
        return categoryMapper.toDTO(categoryRepository.findById(id).orElseThrow(() -> new GenericServiceException(GenericServiceException.NOT_FOUND,"Category not found")));
    }
}
