package org.example;

public class Case {

    private CaseCouleurs couleur;
    private int numero;

    public Case(CaseCouleurs couleur, int numero) {
        this.couleur = couleur;
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

}
