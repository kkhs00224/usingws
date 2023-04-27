package com.example.usingws.repository;

import com.example.usingws.dto.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
    Optional<User> getByUserIdAndUserPw(String userId, String userPw);
    Optional<User> findByUserIdAndUserPw(String userId, String userPw);

}
