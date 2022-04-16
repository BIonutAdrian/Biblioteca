package com.example.biblioteca;

/**
 * Clasa cu variabile pentru fiecare carte
 * si functiile get si set
 */
public class carte {
    private String titlu;
    private String coperta;
    private String autor;
    private String editura;
    private String pret;
    private String anDePublicatie;

    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public String getCoperta() {
        return coperta;
    }

    public void setCoperta(String coperta) {
        this.coperta = coperta;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditura() {
        return editura;
    }

    public void setEditura(String editura) {
        this.editura = editura;
    }

    public String getAnDePublicatie() {
        return anDePublicatie;
    }

    public void setAnDePublicatie(String anDePublicatie) {
        this.anDePublicatie = anDePublicatie;
    }

    public String getPret() {
        return pret;
    }

    public void setPret(String pret) {
        this.pret = pret;
    }
}
