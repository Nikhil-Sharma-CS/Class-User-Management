package org.example.ClassUser.Management.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;

    @NotBlank(message = "name cannot be blank")
    private String userName;

    @Email(message = "Given email id is invalid")
    private String userEmail;

    private String password;

    @Size(min = 7,max = 10)
    @Pattern(regexp = "^[0-9]+$")
    private String userContact;

    @Min(value = 18)
    @Max(value = 30)
    private Integer userAge;

    private LocalDate userDOB;//EX : 2007-12-03.
}
