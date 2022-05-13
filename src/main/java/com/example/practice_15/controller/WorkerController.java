package com.example.practice_15.controller;

import com.example.practice_15.model.Worker;
import com.example.practice_15.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/workers")
public class WorkerController {

    private final WorkerService workerService;

    @Autowired
    public WorkerController(WorkerService workerService) {
        this.workerService = workerService;
    }

    @GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Worker> getAllWorkers() {
        return workerService.getAllWorkers();
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Worker createWorker(@PathVariable("id") int id) {
        return workerService.getWorker(id);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Worker createWorker(@RequestBody Worker worker) {
        return workerService.createWorker(worker);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteWorker(@PathVariable int id) {
        workerService.deleteWorker(id);
    }
}

