package com.timetracker.service;

import com.timetracker.dao.User;
import com.timetracker.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    public User findById(Long id){
        return userRepository.findById(id).orElse(null);
    }
}
