package com.example.faacassessmenttest.dto;

import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Data;

@XmlRootElement(name = "User", namespace = "https://localhost:8080/users")
@Data
public class UserDto {
    private String username;
}
