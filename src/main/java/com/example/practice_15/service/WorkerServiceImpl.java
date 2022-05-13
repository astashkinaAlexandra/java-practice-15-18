package com.example.practice_15.service;

import com.example.practice_15.model.Worker;
import com.example.practice_15.repository.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkerServiceImpl implements WorkerService {

    private final WorkerRepository workerRepository;

    @Autowired
    public WorkerServiceImpl(WorkerRepository workerRepository) {
        this.workerRepository = workerRepository;
    }

    @Override
    public List<Worker> getAllWorkers() {
        return workerRepository.findAll();
    }

    @Override
    public Worker getWorker(int id) {
        return workerRepository.getOne(id);
    }

    @Override
    public Worker createWorker(Worker worker) {
        return workerRepository.save(worker);
    }

    @Override
    public void deleteWorker(int id) {
        if (workerRepository.existsById(id)) {
            workerRepository.deleteById(id);
        }
    }
}
