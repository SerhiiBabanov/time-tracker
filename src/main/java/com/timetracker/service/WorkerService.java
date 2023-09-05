package com.timetracker.service;

import com.timetracker.dao.Worker;
import com.timetracker.repository.WorkerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WorkerService {
    private final WorkerRepository workerRepository;

    public Worker findById(Long id){
        return workerRepository.findById(id).orElse(null);
    }
}
