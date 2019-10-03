
package classes;


public class Cilindro extends Ponto implements Interface.Cilindro {
    float raio, altura;

    
    //metodo construtor sem parametro
    public Cilindro() {
    }
    //fim do metodo construtor sem parametro
    
    //metodo construtor com parametros
    public Cilindro(float raio, float altura) {
        this.raio = raio;
        this.altura = altura;
    }
    //fim do metodo construtor com parametros
    
    //criando os metodos get e set da classe
    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    //fim da chamada
     //chamada da interface do cilindro     
    @Override
    public float retornaAreaBase() {
        return (float) ((float) Math.PI * Math.pow(this.getRaio(), 2));
    }

    @Override
    public float retornaAreaLateral() {
        return (float) ((float) 2*Math.PI*this.getRaio()*this.getAltura());
    }

    @Override
    public float retornaAreaTotal() {
        return (float) 2*this.retornaAreaBase()+this.retornaAreaLateral();
    }

    @Override
    public float retornaVolume() {
        return this.retornaAreaBase()*this.getAltura();
    }
    //fim da chamada
    
    //Iniciando toString
    @Override
    public String toString() {
        return ("Cilindro:[  raio= " + this.getRaio() + 
                "\naltura= " + this.getAltura() + 
                "\nArea da Base = " + this.retornaAreaBase()+ " cm²" + 
                "\nArea Lateral = " + this.retornaAreaLateral()+ " cm²" +  
                "\nArea Total = " + this.retornaAreaTotal() + " cm²" +
                "\nVolume = " + this.retornaVolume()+ " cm³");
    }
    //fim
    
    
}
