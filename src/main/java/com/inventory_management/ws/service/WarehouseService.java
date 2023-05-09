package com.inventory_management.ws.service;

import com.inventory_management.ws.dto.WarehouseDTO;
import com.inventory_management.ws.exception.GenericServiceException;
import com.inventory_management.ws.mapper.WarehouseMapper;
import com.inventory_management.ws.repository.WarehouseRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class WarehouseService {
    private final WarehouseRepository warehouseRepository;
    private final WarehouseMapper warehouseMapper;
    public List<WarehouseDTO> getAllList() {
        return warehouseMapper.toDTOList(warehouseRepository.findAll());
    }

    @Transactional
    public WarehouseDTO create(WarehouseDTO warehouseDTO) {
        return warehouseMapper.toDTO(warehouseRepository.save(warehouseMapper.toEntity(warehouseDTO)));
    }

    @Transactional
    public WarehouseDTO update(WarehouseDTO warehouseDTO) {
        getById(warehouseDTO.getId());
        return warehouseMapper.toDTO(warehouseRepository.save(warehouseMapper.toEntity(warehouseDTO)));
    }

    public WarehouseDTO getById(Long id){
        return warehouseMapper.toDTO(warehouseRepository.findById(id).orElseThrow(() -> new GenericServiceException(GenericServiceException.NOT_FOUND,"Category not found")));
    }
}
