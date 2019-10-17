package classes;

public class Ponto {
    protected float posicionamento_x;
    protected float posicionamento_y;
    
    public Ponto(){};
    
    public Ponto(float posicionamento_x, float posicionamento_y){
        this.posicionamento_x = posicionamento_x;
        this.posicionamento_y = posicionamento_y;
    }

    public float getPosicionamentoX() {
        return this.posicionamento_x;
    }

    public void setPosicionamentoX(float posicionamento_x) {
        this.posicionamento_x = posicionamento_x;
    }

    public float getPosicionamentoY() {
        return this.posicionamento_y;
    }

    public void setPosicionamentoY(float posicionamento_y) {
        this.posicionamento_y = posicionamento_y;
    }
    
    @Override
    public String toString(){
        return ("Ponto: [ Posição X: "+ this.getPosicionamentoX() +
                ", \nPosição Y: "+ this.getPosicionamentoY() +"\n]");
    }
}
