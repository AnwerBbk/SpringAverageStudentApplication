package com.Anwar.Spring.Boot.Application.Repository;


import com.Anwar.Spring.Boot.Application.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositry extends JpaRepository<User, Long> {
}
