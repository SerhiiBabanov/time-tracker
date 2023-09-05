package com.timetracker.repository;

import com.timetracker.dao.Team;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

public interface TeamRepository extends ListCrudRepository<Team, Long> {
    List<Team> findAllByUser_Id(Long id);
}
