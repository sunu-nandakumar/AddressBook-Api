package com.addressBook.service;

import java.util.List;

import com.addressBook.Error.AddressBookNotFound;
import com.addressBook.dto.AddressBookDTO;
import com.addressBook.entity.AddressBookEntity;

public interface IAddressBookService {

	public AddressBookEntity saveAddressBook(AddressBookDTO dto);

	public List<AddressBookEntity> getAddressBook();

	public AddressBookEntity getAddressBookById(int id) throws AddressBookNotFound;

	public AddressBookEntity updateAddressBookByID(int id, AddressBookDTO dto);

	public AddressBookEntity deleteAddressbookByID(int id);

	
	

}
