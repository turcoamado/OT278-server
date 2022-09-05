package com.alkemy.ong.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ContactResponseDto {

    private Long id;
    private String name;
    private String phone;
    private String email;
    private String message;
}
