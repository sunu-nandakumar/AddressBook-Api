package com.addressBook.service;

import java.util.List;

import com.addressBook.dto.AddressBookDTO;
import com.addressBook.entity.AddressBookEntity;

public interface IAddressBookService {

	AddressBookEntity saveAddressBook(AddressBookDTO dto);

	List<AddressBookEntity> getAddressBook();

	

}
