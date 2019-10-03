package classes;

public final class Paralelepipedo extends Ponto implements Interface.Paralelepipedo{
    private float comprimento, altura, largura;
    
    public Paralelepipedo(){};
    
    public Paralelepipedo(float comprimento, float altura, float largura){
        this.comprimento = comprimento;
        this.altura = altura;
        this.largura = largura;
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
                "\nLargura: " + this.getLargura() + 
                "\nAltura: "+ this.getLargura()+
                "\nVolume: "+ this.retornaVolume()+
                "\nArea total: "+this.retornaAreaTotal()+
                "\n ] ");
    }
}
