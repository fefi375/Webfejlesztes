package inf.unideb.beadando.data.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "felhasznalo")
public class Felhasznalo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "nev")
    private String nev;
    @Column(name = "jelszo")
    private String jelszo;

}
