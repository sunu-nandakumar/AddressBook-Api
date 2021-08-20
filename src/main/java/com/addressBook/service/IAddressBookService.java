package com.addressBook.service;

import java.util.List;

import com.addressBook.dto.AddressBookDTO;
import com.addressBook.entity.AddressBookEntity;

public interface IAddressBookService {

	public AddressBookEntity saveAddressBook(AddressBookDTO dto);

	public List<AddressBookEntity> getAddressBook();

	public AddressBookEntity getAddressBookById(int id);

	public AddressBookEntity updateAddressBookByID(int id, AddressBookDTO dto);

	public AddressBookEntity deleteAddressbookByID(int id);

	
	

}
