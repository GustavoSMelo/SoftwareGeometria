package classes;

public final class Triangulo extends Ponto implements Interface.Triangulo{
    private float base;
    private float altura;
    
    public Triangulo(){};
    
    public Triangulo(float base, float altura){
        this.base = base;
        this.altura = altura;
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
                "\nPerimetro: "+ this.retornaPerimetro());
    }
}
