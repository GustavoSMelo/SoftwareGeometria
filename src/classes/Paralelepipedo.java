package classes;

import java.io.Serializable;

public final class Paralelepipedo extends Ponto implements Interface.Paralelepipedo, Serializable{
    private float comprimento, altura, largura;
    private float posX, posY;
    public Paralelepipedo(){};
    
    public Paralelepipedo(float comprimento, float altura, float largura, float posX, float posY){
        this.comprimento = comprimento;
        this.altura = altura;
        this.largura = largura;
        this.posX = posX;
        this.posY = posY;
    }

    public float getComprimento() {
        return this.comprimento;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    public float getAltura() {
        return this.altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getLargura() {
        return this.largura;
    }

    public float getPosX() {
        return this.posX;
    }

    public void setPosX(float posX) {
        this.posX = posX;
    }

    public float getPosY() {
        return this.posY;
    }

    public void setPosY(float posY) {
        this.posY = posY;
    }
    

    public void setLargura(float largura) {
        this.largura = largura;
    }

    
    
    @Override
    public float retornaAreaTotal(){
        return 2 * (this.getAltura() * this.getComprimento()
                + this.getAltura() * this.getLargura()
                + this.getComprimento() * this.getLargura());
    }
    
    @Override
    public float retornaVolume(){
        return (getAltura() * getComprimento() * getLargura());
    }
    
    @Override
    public String toString(){
        return ("Paralelepipedo: [ Comprimento: "+ this.getComprimento()+
                "\nLargura: " + this.getLargura()+ "m²" + 
                "\nAltura: "+ this.getLargura()+ "m²"+
                "\nVolume: "+ this.retornaVolume()+ "m³"+
                "\nArea total: "+this.retornaAreaTotal()+"m²"+
              "\nPosição X do Paralelepipedo =  "+ this.getPosX()+
                "\nPosição Y do Paralelepipedo = "+ this.getPosY()+" ] "); 
    }
}
