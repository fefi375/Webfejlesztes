package hu.unideb.inf.webshop.data.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "felhasznalo")
public class FelhasznaloEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "email")
    private String email;

    @Column(name = "nev")
    private String nev;

    @Column(name = "jelszo")
    private String jelszo;

    @Column(name = "szuletesi_datum")
    private Date szuletesi_datum;

}
