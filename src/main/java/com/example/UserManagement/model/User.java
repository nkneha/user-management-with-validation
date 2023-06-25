package com.example.UserManagement.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String userId;
    @NotEmpty
    private String userName;
    private String emailId;
    private String password;
    private String phoneNumber;
    private Integer age;
    private LocalDate userDOB;
    private Type userType;

}
