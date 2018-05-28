package com.mas.spring.repositories;

import com.mas.spring.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
 * MAS - CRUD - Spring / JPA / AngularJS / Hibernate
 * 
 */

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByName(String name);

}
