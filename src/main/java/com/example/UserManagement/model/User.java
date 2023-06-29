package com.example.UserManagement.model;

import jakarta.validation.constraints.*;
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
    @Email
    private String emailId;
    private String password;
    @Pattern(regexp = "^\\d{12}$")
    private String phoneNumber;
    private Integer age;
   // @Pattern(regexp = "^\\d{2}-\\d{2}-\\d{4}$\n")
    private LocalDate userDOB;
    private Type userType;

}
