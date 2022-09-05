package com.alkemy.ong.controller;

import com.alkemy.ong.dto.slide.SlideRequestDTO;
import com.alkemy.ong.dto.slide.SlideResponseDTO;
import com.alkemy.ong.model.Organization;
import com.alkemy.ong.service.impl.SlideServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/slides")
@RequiredArgsConstructor
public class SlideController {

    private final SlideServiceImpl slideService;

    @PostMapping
    public ResponseEntity<SlideResponseDTO> createNewSlide(@Valid @RequestBody SlideRequestDTO dto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(slideService.create(dto));
    }
}
