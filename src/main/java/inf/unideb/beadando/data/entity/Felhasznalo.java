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

    @Column(name = "email")
    private String email;


    public Felhasznalo() {

    }

    public Felhasznalo(Long id, String nev, String jelszo) {
        this.id = id;
        this.nev = nev;
        this.jelszo = jelszo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public String getJelszo() {
        return jelszo;
    }

    public void setJelszo(String jelszo) {
        this.jelszo = jelszo;
    }
}
