package com.addressBook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.addressBook.dto.AddressBookDTO;
import com.addressBook.dto.ResponseDTO;
import com.addressBook.entity.AddressBookEntity;

import com.addressBook.service.IAddressBookService;

@RestController
public class AddressBookController {
	@Autowired
	private IAddressBookService service; 
	@PostMapping("/entity")
	public ResponseEntity<ResponseDTO> saveAddressBook(@RequestBody AddressBookDTO dto){
		
		AddressBookEntity entity = service.saveAddressBook(dto);
		ResponseDTO responseDTO = new ResponseDTO("AddressBook Entity saved ", entity);
		
		 return new ResponseEntity<>(responseDTO , HttpStatus.CREATED );
		
	}
	@GetMapping("/getdetails")
	public ResponseEntity<ResponseDTO> getAddressBook(){
		List<AddressBookEntity> entityList = service.getAddressBook();
		ResponseDTO responseDTO = new ResponseDTO(" Retrived all data from address book ", entityList);
		return new ResponseEntity<>(responseDTO,HttpStatus.OK);
	}
	
}
