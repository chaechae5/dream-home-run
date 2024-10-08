package com.chae.dreamhomerun.service;

import com.chae.dreamhomerun.Repository.UserRepository;
import com.chae.dreamhomerun.domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public User saveMember(User user){
        return userRepository.save(user);
    }

    public List<User> getAllMembers(){
        return userRepository.findAll();
    }

    public User getMemberByUsername(String username){
        return userRepository.findMemberByUsername(username);
    }
}
