package com.claudiocavallaro.swimcheck.model;

/**
 * Created by claudiocavallaro on 03/01/18.
 */

public class Atleta {

    private String nome;
    private String anno;
    private String soc;
    private String sesso;

    public String getSesso() {
        return sesso;
    }

    public void setSesso(String sesso) {
        this.sesso = sesso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAnno() {
        return anno;
    }

    public void setAnno(String anno) {
        this.anno = anno;
    }

    public String getSoc() {
        return soc;
    }

    public void setSoc(String soc) {
        this.soc = soc;
    }

    public String toString(){
        return "Atleta : \nNome " + nome + "\nAnno di nascita: " + anno + "\nSocietà: " + soc + "\nSesso: " + sesso + "\n";
    }
}
