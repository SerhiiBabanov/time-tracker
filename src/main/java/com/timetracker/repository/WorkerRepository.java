package com.timetracker.repository;

import com.timetracker.dao.Worker;
import org.springframework.data.repository.ListCrudRepository;

public interface WorkerRepository extends ListCrudRepository<Worker, Long> {
}
