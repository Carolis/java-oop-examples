package pkg002b3;

public class NovaBicicleta {
    float velocidade;
    int marcha;
    float velocidadeMaxima;
    
    NovaBicicleta(float velocidadeMaxima) {
        marcha = 0;
        velocidade = 0;
        this.velocidadeMaxima = velocidadeMaxima;
    }
    
    void acelerar(){
        if (velocidade >= velocidadeMaxima) {
            System.out.println("Limite máximo de velocidade atingido");
        } else {
            velocidade++;
            marcha++;
        }
    }
    
    void frear() {
        velocidade = 0;
        marcha = 1;
    }
    
    void imprimirEstados() {
        System.out.println("Velocidade atual:" + velocidade);
        System.out.println("Marcha atual:" + marcha);
        System.out.println("Velocidade máxima dessa bike:" + velocidadeMaxima);
    }
}
