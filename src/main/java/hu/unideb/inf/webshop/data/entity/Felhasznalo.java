package hu.unideb.inf.webshop.data.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "felhasznalo")
public class Felhasznalo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

}
