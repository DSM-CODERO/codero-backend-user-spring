package com.example.sinabroproject.entity.user.entity;

import com.example.sinabroproject.entity.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
