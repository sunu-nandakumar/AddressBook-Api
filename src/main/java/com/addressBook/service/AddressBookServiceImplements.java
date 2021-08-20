package com.addressBook.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.addressBook.dto.AddressBookDTO;
import com.addressBook.entity.AddressBookEntity;
import com.addressBook.repository.AddressBookRepository;

@Service
public class AddressBookServiceImplements implements IAddressBookService {
	@Autowired
	private AddressBookRepository repository;

	@Override
	public AddressBookEntity saveAddressBook(AddressBookDTO dto) {
		AddressBookEntity entity = new AddressBookEntity(dto);
		return repository.save(entity);
	}

	@Override
	public List<AddressBookEntity> getAddressBook() {
	
		return repository.findAll();
	}

	
	

}
