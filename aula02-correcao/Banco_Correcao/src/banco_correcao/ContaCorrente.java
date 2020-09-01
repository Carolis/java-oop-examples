package banco_correcao;
import java.util.ArrayList;
import java.util.Iterator;

public class ContaCorrente {
    int numero;
    float saldo;
    String status;
    float limite;
    ArrayList<Movimentacao> atividades; 
    
    ContaCorrente(int numero) {
        this.numero = numero;
        this.limite = 0;
        this.status = "Simples";
        atividades = new ArrayList();
    }
    
    void mostra_estado() {
        System.out.println("Numero: " + this.numero);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Status: " + this.status);
        System.out.println("Limite: " + this.limite);
    }
    
    void altera_saldo(float valor) {
        this.saldo = valor;
    }
    
    void altera_status(String status) {
        this.status = status;
    }
    
    void altera_limite(float limite) {
        this.limite = limite;
    }
    
    void movimenta(float valor, String tipo) {
        Movimentacao m = new Movimentacao();
        if(tipo.equals("Saque")){
            if (this.saldo < valor) {
                System.out.println("Saldo Insuficiente");
            }
            else {
                m.saque(valor);
                this.saldo = this.saldo - valor;
                atividades.add(m);
            }
        } else {
            if(tipo.equals("Deposito")) {
                m.deposito(valor);
                this.saldo = this.saldo + valor;
                atividades.add(m);
            }
        }
    }
    
    void mostra_saldo(){
        System.out.println("Saldo: " + this.saldo);
    }
    
    void extrato(){
        Iterator<Movimentacao> it = atividades.iterator();
        Movimentacao m;
        while(it.hasNext()) {
            m = it.next();
            System.out.println(m.descricao);
            System.out.println(m.cred_deb);
            System.out.println(m.valor);
        }
        System.out.println(this.saldo);
    }
}
