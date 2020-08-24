package pkg002b2;

public class Bicicleta {
    float velocidade;
    int marcha;
    
    Bicicleta() {
        marcha = 0;
        velocidade = 0;
    }
    
    void acelerar(){
        velocidade++;
        marcha++;
    }
    
    void frear() {
        velocidade = 0;
        marcha = 1;
    }
    
    void imprimirEstados() {
        System.out.println("Velocidade atual:" + velocidade);
        System.out.println("Marcha atual:" + marcha);
    }
}
