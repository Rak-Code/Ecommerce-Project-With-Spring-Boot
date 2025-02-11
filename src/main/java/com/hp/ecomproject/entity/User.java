package com.hp.ecomproject.entity;

import java.util.List;
import java.util.UUID;

import com.hp.ecomproject.validation.ConfirmPassword;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
@ConfirmPassword
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID userID;

    @NotBlank
    @NotNull
    private String name;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "userID")
//    @JoinColumn(name = "fk_user_id", referencedColumnName = "userID")
    private List<Address> addresses;

    private String password;
    private String confirmPassword;
}
