package com.chae.dreamhomerun.Repository;

import com.chae.dreamhomerun.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findMemberByUsername(String username);
}
