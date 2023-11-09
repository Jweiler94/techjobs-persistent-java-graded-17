package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.lang.reflect.Array;
import java.util.ArrayList;

@Entity
public class Skill extends AbstractEntity {

    @Size(max = 500, message = "Description must be under 500 characters.")
    public String description;

    public Skill() {}

    public Skill(String description) {
        super();
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
