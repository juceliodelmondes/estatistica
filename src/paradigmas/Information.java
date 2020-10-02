/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paradigmas;

/**
 *
 * @author Jucelio
 */
public class Information {
    private float menorNumero;
    private float maiorNumero;
    private float soma;
    private float media;
    private float mediana;
    private int moda;
    
    public float getMenorNumero() {
        return this.menorNumero;
    }
    
    public void setMenorNumero(float menorNumero) {
        this.menorNumero = menorNumero;
    }
    
    public float getMaiorNumero() {
        return this.maiorNumero;
    }
    
    public void setMaiorNumero(float maiorNumero) {
        this.maiorNumero = maiorNumero;
    }
    
    public float getSoma() {
        return this.soma;
    }
    
    public void setSoma(float soma) {
        this.soma = soma;
    }
    
    public float getMedia() {
        return this.media;
    }
    
    public void setMedia(float media) {
        this.media = media;
    }
    
    public float getMediana() {
        return this.mediana;
    }
    
    public void setMediana(float mediana) {
        this.mediana = mediana;
    }
    
    public int getModa() {
        return this.moda;
    }
    
    public void setModa(int moda) {
        this.moda = moda;
    }

    @Override
    public String toString() {
        return "Information{" + "menorNumero=" + menorNumero + ", maiorNumero=" + maiorNumero + ", soma=" + soma + ", media=" + media + ", mediana=" + mediana + ", moda=" + moda + '}';
    }
}
