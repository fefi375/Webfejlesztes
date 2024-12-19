package inf.unideb.beadando.data.entity;

import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;

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
    private List<TermekEntity> termekek;


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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FelhasznaloEntity that = (FelhasznaloEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(nev, that.nev) && Objects.equals(jelszo, that.jelszo) && Objects.equals(email, that.email) && Objects.equals(termekek, that.termekek);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nev, jelszo, email, termekek);
    }
}
