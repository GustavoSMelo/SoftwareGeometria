package classes;

import java.io.Serializable;

public final class Triangulo extends Ponto implements Interface.Triangulo, Serializable{
    private float base;
    private float altura;
    private float posX;
    private float posY;
    
    public Triangulo(){};
    
    public Triangulo(float base, float altura, float posX, float posY){
        this.base = base;
        this.altura = altura;
        this.posX = posX;
        this.posY = posY;
    }

    public float getBase() {
        return this.base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return this.altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
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

    
    @Override
    public float retornaAreaTotal(){
        return (this.getBase() * this.getAltura()) / 2;
    }
    
    @Override
    public float retornaPerimetro(){
        return this.getBase() * 3;
    }
    
    @Override
    public String toString(){
        return ("Triangulo: [ base: "+ this.getBase() 
                +" \nAltura: "+this.getAltura()
                +"\n Area Total: "+this.retornaAreaTotal()+
                "\nPerimetro: "+ this.retornaPerimetro()+
                "\nPosição X(vindo do ponto): "+this.getPosX()+
                "\nPosição Y(vindo do ponto): "+this.getPosY()+" ] ");
    }
}
