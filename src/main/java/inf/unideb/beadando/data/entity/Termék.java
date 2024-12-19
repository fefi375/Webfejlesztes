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
    @Column(name = "mennyiseg")
    private Integer mennyiseg;

    public Termék() {

    }

    public Termék(Long id, String nev, Integer ar) {
        this.id = id;
        this.nev = nev;
        this.ar = ar;
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
}
