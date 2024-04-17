package com.example.RemomaxBE.DemoAdmin.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "product_test")
public class SearchTestModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;

    public SearchTestModel() {
    }

    public SearchTestModel(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
