package inf.unideb.beadando.data.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "felhasznalo")
public class FelhasznaloEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "nev")
    private String nev;
    @Column(name = "jelszo")
    private String jelszo;

    @Column(name = "email")
    private String email;

    @OneToMany(mappedBy = "felhasznalo")
    private List<TermékEntity> termekek;


    public FelhasznaloEntity() {

    }

    public FelhasznaloEntity(Long id, String nev, String jelszo) {
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
