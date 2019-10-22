
package classes;

import java.io.Serializable;

public final class EquacaoSegundoGrau implements Interface.EquacaoSegundoGrau, Serializable {
    private int valorA, valorB, valorC;

    //Criando metodo construtor sem parâmetro
    public EquacaoSegundoGrau() {
    }
    //fim da construção sem parametros
    //Criando o metodo construtor com parâmetro
    public EquacaoSegundoGrau(int valorA, int valorB, int valorC) {
        this.valorA = valorA;
        this.valorB = valorB;
        this.valorC = valorC;
    }
    //fim da construção com parametros
    
    //Criando os metodos get e set da classe
    public int getValorA() {
        return valorA;
    }

    public void setValorA(int valorA) {
        this.valorA = valorA;
    }

    public int getValorB() {
        return valorB;
    }

    public void setValorB(int valorB) {
        this.valorB = valorB;
    }

    public int getValorC() {
        return valorC;
    }

    public void setValorC(int valorC) {
        this.valorC = valorC;
    }
    //fim da criação
    
    //chamando a Interface Equação Segundo Grau
    @Override
    public float retornaCalcbhaskara() {
        return (float) Math.pow(this.getValorB(), 2) - 4 * this.getValorA() * this.getValorC();
    }
    
    @Override
    public float retornaCalcXum() {
        return (float)(double)(-(this.getValorB()) + Math.sqrt(this.retornaCalcbhaskara())) /(2*this.getValorA());
    }

    @Override
    public float retornaCalcXdois() {
        return (float)(double)(-(this.getValorB()) - Math.sqrt(this.retornaCalcbhaskara())) /(2*this.getValorA());
    }
   //fim da chamada
    
   //Iniciando o toString

    @Override
    public String toString() {
        return ("EquacaoSegundoGrau  valor de A= " + this.getValorA() +
                 "\n valor de B= " + this.getValorB() + 
                "\n valor de C= " + this.getValorC() + 
                "\n Valor do delta = " + this.retornaCalcbhaskara() +
                "\n Valor do x' = " + this.retornaCalcXum() + 
                "\n Valor do x'' = "+ this.retornaCalcXdois());
    }
    //fim
}
