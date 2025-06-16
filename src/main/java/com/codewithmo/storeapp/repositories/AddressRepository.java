package com.codewithmo.storeapp.repositories;

import com.codewithmo.storeapp.entities.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address, Long> {
}