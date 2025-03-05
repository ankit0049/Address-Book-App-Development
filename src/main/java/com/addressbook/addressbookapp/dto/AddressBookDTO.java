package com.addressbook.addressbookapp.dto;
import lombok.Data;
@Data
public class AddressBookDTO {
    private String name;
    private String address;

    public AddressBookDTO() {}

    public AddressBookDTO(String name, String address) {
        this.name = name;
        this.address = address;
    }
}
