package com.poc.springSecurity.repository;

import com.poc.springSecurity.domain.Users;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<Users, Long> {

    Optional<Users> findByUsername(String username);
}
