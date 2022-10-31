package com.example.testing.service;

import com.example.testing.dto.VehicleDTO;
import com.example.testing.entity.Vehicle;
import com.example.testing.repo.VehicleRepo;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional

public class VehicleService {
    @Autowired
    private VehicleRepo vehicleRepo;
    @Autowired
    private ModelMapper modelMapper;

    public VehicleDTO saveUser(VehicleDTO vehicleDTO){
        vehicleRepo.save(modelMapper.map(vehicleDTO, Vehicle.class));
        return vehicleDTO;
    }
    public List<VehicleDTO> getAllUsers(){
        List<Vehicle> vehicleList = vehicleRepo.findAll();
        return modelMapper.map(vehicleList,new TypeToken<List<VehicleDTO>>(){}.getType());
    }
    public VehicleDTO updateUser(VehicleDTO vehicleDTO){
        vehicleRepo.save(modelMapper.map(vehicleDTO, Vehicle.class));
        return vehicleDTO;
    }
    public boolean deleteUser(VehicleDTO vehicleDTO){
        vehicleRepo.delete(modelMapper.map(vehicleDTO, Vehicle.class));
        return true;
    }
}
