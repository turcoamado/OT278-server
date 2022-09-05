package com.alkemy.ong.mapper;

import com.alkemy.ong.dto.request.ContactRequestDto;
import com.alkemy.ong.model.Contact;
import org.springframework.stereotype.Component;

@Component
public class ContactMapper {

    public Contact contactDto2ContactEntity(ContactRequestDto dto) {
        Contact entity = new Contact();
        entity.setName(dto.getName());
        entity.setPhone(dto.getPhone());
        entity.setEmail(dto.getEmail());
        entity.setMessage(dto.getMessage());
        return entity;
    }

    public ContactRequestDto contactEntity2ContactDto(Contact entity) {
        ContactRequestDto dto = new ContactRequestDto();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setPhone(entity.getPhone());
        dto.setEmail(entity.getEmail());
        dto.setMessage(entity.getMessage());
        return dto;
    }

}
