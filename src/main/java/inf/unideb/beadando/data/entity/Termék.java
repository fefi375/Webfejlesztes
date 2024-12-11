package inf.unideb.beadando.data.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "termék")
public class Termék {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "nev")
    private String nev;
    @Column(name = "ar")
    private Integer ar;
}
