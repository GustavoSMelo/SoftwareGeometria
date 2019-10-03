
package classes;

public class Quadrado extends Ponto implements Interface.Quadrado {

    private float lado;

    
    //método construtor sem parametro
    public Quadrado() {
    }
    //fim do metodo construtor sem parametro
    
    //metodo construtor com parametros
    public Quadrado(float lado) {
        this.lado = lado;
    }
     //fim do metodo construtor com parametro
    
    
    //Criando os  metodos get e set da classe
    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
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
                "\n Perímetro do quadrado = " + this.retornaPerimetroQuadrado() + " cm²");
                
    }
    
    //fim
    
    
}
