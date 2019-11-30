package models;


import play.data.validation.Constraints;

import javax.persistence.Entity;
import javax.validation.Constraint;

public class Login {
    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    String Email;

    @Constraints.Email;

    }


