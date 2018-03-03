package com.kodilla.hibernate.invoice;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table (name="PRODUCTS")
public class Product {
    private int id;
    private String name;


    public Product(String name) {
        this.name = name;
    }

    public Product() {
    }

    @Id
    @Column (name="PRODUCT_ID", unique = true)
    @GeneratedValue
    @NotNull
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column (name="NAME")
    @NotNull
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

