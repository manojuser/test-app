package com.test;

import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

@org.springframework.stereotype.Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    void delete(User user);

    List<User> findAll();


    User save(User user);
}
