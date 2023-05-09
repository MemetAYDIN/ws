package com.inventory_management.ws.service;

import com.inventory_management.ws.dto.InventoryDTO;
import com.inventory_management.ws.exception.GenericServiceException;
import com.inventory_management.ws.mapper.InventoryMapper;
import com.inventory_management.ws.repository.InventoryRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class InventoryService {
    private final InventoryRepository inventoryRepository;
    private final InventoryMapper inventoryMapper;
    public List<InventoryDTO> getAllList() {
        return inventoryMapper.toDTOList(inventoryRepository.findAll());
    }

    @Transactional
    public InventoryDTO create(InventoryDTO inventoryDTO) {
        return inventoryMapper.toDTO(inventoryRepository.save(inventoryMapper.toEntity(inventoryDTO)));
    }

    @Transactional
    public InventoryDTO update(InventoryDTO inventoryDTO) {
        getById(inventoryDTO.getId());
        return inventoryMapper.toDTO(inventoryRepository.save(inventoryMapper.toEntity(inventoryDTO)));
    }

    public InventoryDTO getById(Long id){
        return inventoryMapper.toDTO(inventoryRepository.findById(id).orElseThrow(() -> new GenericServiceException(GenericServiceException.NOT_FOUND,"Category not found")));
    }
}
