package com.addressBook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
	@GetMapping("/getByID/{id}")
	public ResponseEntity<ResponseDTO> getAddressBookByID(@PathVariable("id") int id){
		AddressBookEntity entity = (AddressBookEntity)service.getAddressBookById(id);
		ResponseDTO responseDTO = new ResponseDTO(" Retrived the data from address book ", entity);
		return new ResponseEntity<>(responseDTO,HttpStatus.OK);
	}
	@PutMapping("/updatingByID/{id}")
	public ResponseEntity<ResponseDTO> updateAddressBookByID(@PathVariable("id")int id, @RequestBody AddressBookDTO dto){
		AddressBookEntity entity = (AddressBookEntity) service.updateAddressBookByID(id,dto);
		ResponseDTO responseDTO = new ResponseDTO(" Updated the data from address book ", entity);
		return new ResponseEntity<>(responseDTO,HttpStatus.OK);
		
	}
	@DeleteMapping("/deletebyid/{id}")
	public ResponseEntity<ResponseDTO> deleteAddressbookByID(@PathVariable("id") int id){
		AddressBookEntity entity = (AddressBookEntity) service. deleteAddressbookByID(id);
		ResponseDTO responseDTO = new ResponseDTO(" Deleted the data from address book ", entity);
		return new ResponseEntity<>(responseDTO,HttpStatus.OK);
	}
	
}
