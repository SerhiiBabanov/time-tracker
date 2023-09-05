package com.timetracker.service;

import com.timetracker.dao.Team;
import com.timetracker.repository.TeamRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TeamService {

    private final TeamRepository teamRepository;
    public Team findById(Long id){
        return teamRepository.findById(id).orElse(null);
    }
    public List<Team> findByUserId(Long id){
        return teamRepository.findAllByUser_Id(id);
    }

}
