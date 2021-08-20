package com.addressBook.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.addressBook.dto.AddressBookDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class AddressBookEntity {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String email;
    private String phoneNo;
    private LocalDate createdDate;
    private LocalDate updatedDate;
    
    public AddressBookEntity(AddressBookDTO dto) {
    	this.name =dto.getName();
        this.address=dto.getAddress();
        this.city=dto.getCity();
        this.state=dto.getState();
        this.zip=dto.getZip();
        this.email=dto.getEmail();
        this.phoneNo=dto.getPhoneNo();
        this.createdDate=LocalDate.now();
        this.updatedDate=LocalDate.now();
	}
   

}
