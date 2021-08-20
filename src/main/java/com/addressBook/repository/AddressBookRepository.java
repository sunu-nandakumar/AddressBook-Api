package com.addressBook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.addressBook.entity.AddressBookEntity;

@Repository
public interface AddressBookRepository extends JpaRepository<AddressBookEntity, Integer> {

}
