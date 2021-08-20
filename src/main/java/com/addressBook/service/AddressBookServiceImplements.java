package com.addressBook.service;

import java.util.List;
import java.util.Objects;

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

	@Override
	public AddressBookEntity getAddressBookById(int id) {
		
		return repository.findById(id).get();
	}

	@Override
	public AddressBookEntity updateAddressBookByID(int id, AddressBookDTO dto) {
		AddressBookEntity entity = repository.findById(id).get();
		
		if (Objects.nonNull(dto.getName()) &&
                !"".equalsIgnoreCase(dto.getName())) {
            entity.setName(dto.getName());
        }

        if (Objects.nonNull(dto.getAddress()) &&
                !"".equalsIgnoreCase(dto.getAddress())) {
            entity.setAddress(dto.getAddress());
        }

        if (Objects.nonNull(dto.getCity()) &&
                !"".equalsIgnoreCase(dto.getCity())) {
            entity.setCity(dto.getCity());
        }

        if (Objects.nonNull(dto.getState()) &&
             !"".equalsIgnoreCase(dto.getState())) {
            entity.setState(dto.getState());
        }

        if (Objects.nonNull(dto.getZip()) &&
                !"".equalsIgnoreCase(dto.getZip()))
            entity.setZip(dto.getZip());

        if (Objects.nonNull(dto.getEmail()) &&
                !"".equalsIgnoreCase(dto.getEmail()))
        entity.setEmail(dto.getEmail());


        if (Objects.nonNull(dto.getPhoneNo()) &&
                !"".equalsIgnoreCase(dto.getPhoneNo()))
        entity.setPhoneNo(dto.getPhoneNo());

        return repository.save(entity);
    }

	@Override
	public AddressBookEntity deleteAddressbookByID(int id) {
		
				repository.deleteById(id);
				return null;
				
	}
	}

	
	


