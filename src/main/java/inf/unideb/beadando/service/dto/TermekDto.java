package inf.unideb.beadando.service.dto;

import java.util.Objects;

public class TermekDto {

    private Long id;
    private String nev;
    private Integer ar;
    private Integer mennyiseg;

    public TermekDto() {

    }

    public TermekDto(Long id, String nev, Integer ar, Integer mennyiseg) {
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
        TermekDto termekDto = (TermekDto) o;
        return Objects.equals(id, termekDto.id) && Objects.equals(nev, termekDto.nev) && Objects.equals(ar, termekDto.ar) && Objects.equals(mennyiseg, termekDto.mennyiseg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nev, ar, mennyiseg);
    }
}
