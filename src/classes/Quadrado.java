
package classes;

public class Quadrado extends Ponto implements Interface.Quadrado {

    private float lado;
    private float posx;
    private float posy;
    
    
    //método construtor sem parametro
    public Quadrado() {
        super();
    }
    //fim do metodo construtor sem parametro
    
    //metodo construtor com parametros
    public Quadrado( float lado, float posx, float posy) {
        super();
        this.lado = lado;
        this.posx = posx;
        this.posy = posy;
    }
     //fim do metodo construtor com parametro
    
    //Criando os  metodos get e set da classe
    public float getLado() {
        return lado;
    }
    
    public void setLado(float lado){
        this.lado = lado;
    }

    public float getPosx() {
        return posx;
    }

    public void setPosx(float posx) {
        this.posx = posx;
    }

    public float getPosy() {
        return posy;
    }

    public void setPosy(float posy) {
        this.posy = posy;
    }

    //fim da criação
    //chamada da interface quadrado
    @Override
    public float retornaAreaQuadrado() {
        return (float) Math.pow(this.getLado(), 2);
    }

    @Override
    public float retornaPerimetroQuadrado() {
        return (float) this.getLado() + this.getLado() + this.getLado() + this.getLado();
    }
    //fim da chamada 
    
    //Iniciando o toString

    @Override
    public String toString() {
        return ("Quadrado: [Lado = " + this.getLado() +
                "\n Area do quadrado = " + this.retornaAreaQuadrado() + " cm²" +
                "\n Perímetro do quadrado = " + this.retornaPerimetroQuadrado() + " cm²"+
                "\nPosição X do quadrado =  "+ this.getPosx()+
                "\nPosição Y do quadrado = "+ this.getPosy()+" ] "); 
    }
    //fim   
}
