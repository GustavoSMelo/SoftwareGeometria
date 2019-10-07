package classes;

import java.math.BigInteger;

public final class Cone extends Ponto implements Interface.Cone {

    private float raio, altura, geratriz;
    
    public Cone(){};
    
    public Cone(float raio, float altura, float geratriz){
        this.raio = raio;
        this.altura = altura;
        this.geratriz = geratriz;
    }

    public float getRaio() {
        return this.raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }

    public float getAltura() {
        return this.altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getGeratriz() {
        return this.geratriz;
    }

    public void setGeratriz(float geratriz) {
        this.geratriz = geratriz;
    }
    
    @Override
    public float retornaVolume() {
        return (float)(this.retornaAreaBase() * this.getAltura()) / 3;
    }

    @Override
    public float retornaAreaTotal() {
        return this.retornaAreaBase() + this.retornaAreaLateral();
    }
    
    @Override
    public float retornaAreaLateral(){
        return (float)(Math.PI * this.getRaio() * this.getGeratriz());
    }
    
    @Override
    public float retornaAreaBase(){
        return (float)(Math.PI * (this.getRaio() * this.getRaio()));
    }
    
    @Override
    public String toString(){
        return ("Cone:  Raio: "+this.getRaio()+
                "\nGeratriz: "+this.getGeratriz()+
                "\nAltura: "+this.getAltura()+
                "\nVolume: "+this.retornaVolume()+
                "\nArea total:"+this.retornaAreaTotal());
    }
}
