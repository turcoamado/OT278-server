package com.alkemy.ong.controller;

import com.alkemy.ong.dto.request.ContactRequestDto;
import com.alkemy.ong.service.IContactService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/contacts")
@RequiredArgsConstructor
public class ContactController {

    private final IContactService service;

    @PostMapping
    public ResponseEntity<ContactRequestDto> save(@Valid @RequestBody ContactRequestDto contact) {
        ContactRequestDto savedContact = service.save(contact);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedContact);
    }

}
