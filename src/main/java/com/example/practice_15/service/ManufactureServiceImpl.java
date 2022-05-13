package com.example.practice_15.service;

import com.example.practice_15.model.Manufacture;
import com.example.practice_15.repository.ManufactureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManufactureServiceImpl implements ManufactureService {

    private final ManufactureRepository manufactureRepository;

    @Autowired
    public ManufactureServiceImpl(ManufactureRepository manufactureRepository) {
        this.manufactureRepository = manufactureRepository;
    }

    @Override
    public List<Manufacture> getAllManufactures() {
        return manufactureRepository.findAll();
    }

    @Override
    public Manufacture getManufacture(int id) {
        return manufactureRepository.getOne(id);
    }

    @Override
    public Manufacture createManufacture(Manufacture manufacture) {
        return manufactureRepository.save(manufacture);
    }

    @Override
    public void deleteManufacture(int id) {
        manufactureRepository.deleteById(id);
    }
}
