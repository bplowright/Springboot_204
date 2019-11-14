package com.example.demo;

import org.springframework.stereotype.Controller;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
@Controller
public class Tvshow {
    @NotNull
    @Min(1)
    private long id;
    @NotNull
    @Size(min=3, max=20)
    private String name;
    @NotNull
    @Size(min=3, max=10)
    private String description;
    @NotNull
    @Size(min=3, max=10)
    private String type;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
