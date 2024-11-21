package hu.unideb.inf.webshop.data.entity;

import jakarta.persistence.*;

@Entity
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nev")
    private String nev;

    @Column(name = "mennyiseg")
    private int mennyiseg;



}
