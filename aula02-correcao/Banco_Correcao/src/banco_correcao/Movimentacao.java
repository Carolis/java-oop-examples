package banco_correcao;

public class Movimentacao {
    String descricao;
    float valor;
    char cred_deb;
    void saque(float valor){
        this.cred_deb = 'D';
        this.valor = valor;
        this.descricao = "Débito em conta corrente";
    }
    
    void deposito(float valor){
        this.cred_deb = 'C';
        this.valor = valor;
        this.descricao = "Crédito em conta corrente";
    }
}
