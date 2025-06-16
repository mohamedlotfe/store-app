package com.codewithmo.storeapp.repositories;

import com.codewithmo.storeapp.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
