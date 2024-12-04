package hu.unideb.inf.webshop.service.dto;

public class ProductDto {


    private Long id;
    private String nev;
    private Integer mennyiseg;

    public ProductDto(Long id, String nev, Integer mennyiseg) {
        this.id = id;
        this.nev = nev;
        this.mennyiseg = mennyiseg;
    }
}
