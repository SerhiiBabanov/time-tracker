package com.timetracker.repository;

import com.timetracker.dao.WorkTime;
import org.springframework.data.repository.ListCrudRepository;

public interface WorkTimeRepository extends ListCrudRepository<WorkTime, Long> {
}
