package com.chae.dreamhomerun.repository;

import com.chae.dreamhomerun.Repository.UserRepository;
import com.chae.dreamhomerun.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

@DataJpaTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testSaveAndFinduser(){
        User member = User.builder()
                .username("chae")
                .email("chae@naver.com")
                .password("testtest")
                .build();

        userRepository.save(member);

        List<User> users = userRepository.findAll();

        assertThat(users).extracting(User::getUsername).contains("chae");

    }
}
