package com.example.demo.repository;

import com.example.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
@Repository
public interface iUserRepository extends JpaRepository<User, Long> {
    public abstract ArrayList<User> findByName(Long iduser); // podemos agregar mas
}
