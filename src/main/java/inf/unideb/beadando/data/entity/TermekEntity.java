package inf.unideb.beadando.data.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "termék")
public class TermekEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "nev")
    private String nev;
    @Column(name = "ar")
    private Integer ar;
    @Column(name = "mennyiseg")
    private Integer mennyiseg;

    @ManyToOne
    @JoinColumn(name = "felhasznalo_id", referencedColumnName = "id")
    private FelhasznaloEntity felhasznalo;

    public TermekEntity() {

    }

    public TermekEntity(Long id, String nev, Integer ar, Integer mennyiseg) {
        this.id = id;
        this.nev = nev;
        this.ar = ar;
        this.mennyiseg = mennyiseg;
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

    public Integer getAr() {
        return ar;
    }

    public void setAr(Integer ar) {
        this.ar = ar;
    }

    public Integer getMennyiseg() {
        return mennyiseg;
    }

    public void setMennyiseg(Integer mennyiseg) {
        this.mennyiseg = mennyiseg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TermekEntity entity = (TermekEntity) o;
        return Objects.equals(id, entity.id) && Objects.equals(nev, entity.nev) && Objects.equals(ar, entity.ar) && Objects.equals(mennyiseg, entity.mennyiseg) && Objects.equals(felhasznalo, entity.felhasznalo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nev, ar, mennyiseg, felhasznalo);
    }
}
