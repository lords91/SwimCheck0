package com.claudiocavallaro.swimcheck.model;

import android.util.TimeUtils;

import java.io.Serializable;
import java.util.StringTokenizer;
import java.util.concurrent.TimeUnit;

/**
 * Created by claudiocavallaro on 04/01/18.
 */

public class Gara implements Serializable{

    private String data;
    private String tipo;
    private String tempo;
    private String vasca;
    private String federazione;
    private String categoria;

    private Atleta atleta;

    public Atleta getAtleta() {
        return atleta;
    }

    public void setAtleta(Atleta atleta) {
        this.atleta = atleta;
    }

    private long time;

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    private String citta;

    public String getCitta() {
        return citta;
    }

    public void setCitta(String citta) {
        this.citta = citta;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTempo() {
        return tempo;
    }

    public void setTempo(String tempo) {
        this.tempo = tempo;
    }

    public String getVasca() {
        return vasca;
    }

    public void setVasca(String vasca) {
        this.vasca = vasca;
    }

    public String getFederazione() {
        return federazione;
    }

    public void setFederazione(String federazione) {
        this.federazione = federazione;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String toString(){
        return "Gara : " + this.citta + "\nData: " + this.data + "\nTipo: " + this.tipo + "\ntempo: " + this.tempo + "\nVasca: " + this.vasca + "\nfederazione: " + this.federazione + "\n";
    }

    public long toTime(String prova){
        long tot;

        StringTokenizer st = new StringTokenizer(prova, "'");
        long min = 0;
        long sec = 0;
        long milli = 0;
        while(st.hasMoreElements()) {
            /*min = Integer.parseInt(st.nextElement().toString());
            sec = Integer.parseInt(st.nextElement().toString());
            milli = Integer.parseInt(st.nextElement().toString());*/

            min = Long.parseLong(st.nextElement().toString());
            sec = Long.parseLong(st.nextElement().toString());
            milli = Long.parseLong(st.nextElement().toString());

            //System.out.println("min " + min + " sec " + sec + " milli " + milli);
        }

        long minL = TimeUnit.MINUTES.toMillis(min);
        long secL = TimeUnit.SECONDS.toMillis(sec);
        long milliL = TimeUnit.MILLISECONDS.toMillis(milli);

        long totL = minL+ secL + milliL;

        return totL;
    }
}
