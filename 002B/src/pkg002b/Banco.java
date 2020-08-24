package pkg002b;

public class Banco {
    ContaCorrente contaCorrente;
    Movimentacoes movimentacoes;
    
    Banco(ContaCorrente contaCorrente) {
        this.contaCorrente = contaCorrente;
    }
    
    void criarConta() {
        ContaCorrente contaCorrente = new ContaCorrente();
    }
    
}
