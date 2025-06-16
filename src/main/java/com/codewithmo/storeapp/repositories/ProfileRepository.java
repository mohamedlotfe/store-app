package com.codewithmo.storeapp.repositories;

import com.codewithmo.storeapp.entities.Profile;
import org.springframework.data.repository.CrudRepository;

public interface ProfileRepository extends CrudRepository<Profile, Long> {
}