package com.example.java_koddenemesi.repository;

import com.example.java_koddenemesi.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsersRepository extends JpaRepository<Users,Long> {
    static long countById(Long İd);
}
