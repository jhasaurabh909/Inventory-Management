package com.org.InventoryManagement.service;

import com.org.InventoryManagement.models.HardwareModel;
import com.org.InventoryManagement.repository.HardwareDetailsRepository;
import com.org.InventoryManagement.repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HardwareDetailsService {

    @Autowired
    InventoryRepository inventoryRepository;

    public List<HardwareModel> fetchHardwareAndQuantity(){
       List<String> hardwareList = inventoryRepository.fetchAllHardwares();
       List<HardwareModel> hardwareModelList = new ArrayList<>();
       for(String hardware: hardwareList){
           HardwareModel hardwareModel = new HardwareModel();
           int assingedQuantity = inventoryRepository.fetchhardwareAssignedQuantity(hardware);
          int stockQuantity =  inventoryRepository.fetchhardwareStockQuantity(hardware);
           hardwareModel.setHardwareName(hardware);
           hardwareModel.setAssignedQuantity(assingedQuantity);
           hardwareModel.setStockQuantity(stockQuantity);
           hardwareModel.setTotalQuantity(assingedQuantity+stockQuantity);
           hardwareModelList.add(hardwareModel);
       }
       return hardwareModelList;

    }
}
