package com.example.spiringsecurity.payload.response;

import com.example.spiringsecurity.model.Role;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Builder;
import lombok.Data;

@Data
public class LoginResponse {

    private Long id;
    private String name;
    private String userName;
    private String email;
    private String designation;
    private String deptMstCode;
    private Role role;
    private String token;
}
