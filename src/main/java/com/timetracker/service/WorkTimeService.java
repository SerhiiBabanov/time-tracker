package com.timetracker.service;

import com.timetracker.dao.WorkTime;
import com.timetracker.repository.WorkTimeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WorkTimeService {
    private final WorkTimeRepository workTimeRepository;

    public WorkTime findById(Long id){
        return workTimeRepository.findById(id).orElse(null);
    }

}
