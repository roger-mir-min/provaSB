package com.provaTardana.demoTardana;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class User {

    @NotEmpty(message = "El nom és obligatori")
    @Size(min = 2, max = 30, message = "El nom ha de tenir entre 2 i 30 caràcters")
    private String name;

    @NotEmpty(message = "L'email és obligatori")
    @Email(message = "El format de l'email és incorrecte")
    private String email;

    public
    String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
