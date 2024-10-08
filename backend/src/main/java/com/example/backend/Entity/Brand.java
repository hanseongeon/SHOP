package com.example.backend.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Setter
@Getter
public class Brand {
    @Id
    private String brandName;

    @OneToMany(mappedBy = "brand")
    private List<Item> itemList;
}
