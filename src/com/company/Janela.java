package com.company;

public class Janela {

    private boolean aberta;
    private String cor;
    private  int dimensaoX;
    private  int dimensaoY;
    private  int dimensaoZ;

    public Janela(){

    }
    public Janela(String cor, int dimensaoX, int dimensaoY, int dimensaoZ){
        this.cor = cor;
        this.dimensaoX = dimensaoX;
        this.dimensaoY = dimensaoY;
        this.dimensaoZ = dimensaoZ;
    }


    public void abre(){
        aberta=true;
        System.out.println(aberta);
    }
    public void fecha(){
        aberta=false;
        System.out.println(aberta);

    }

    public void imprimir(){
        System.out.println("Cor: " + getCor());
        System.out.println("Dimensao x: " + getDimensaoX());
        System.out.println("Dimensao Y: " + getDimensaoY());
        System.out.println("Dimensao Z: " + getDimensaoZ());
        fecha();

    }


    public String pinta(String cor){
        return getCor();

    }
    public void estaAberta(){
        abre();

    }

    public boolean isAberta() {
        return aberta;
    }

    public void setAberta(boolean aberta) {
        this.aberta = aberta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String pinta) {
        this.cor = cor;
    }

    public int getDimensaoX() {
        return dimensaoX;
    }

    public void setDimensaoX(int dimensaoX) {
        this.dimensaoX = dimensaoX;
    }

    public int getDimensaoY() {
        return dimensaoY;
    }

    public void setDimensaoY(int dimensaoY) {
        this.dimensaoY = dimensaoY;
    }

    public int getDimensaoZ() {
        return dimensaoZ;
    }

    public void setDimensaoZ(int dimensaoZ) {
        this.dimensaoZ = dimensaoZ;
    }
}
