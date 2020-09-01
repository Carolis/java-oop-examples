package banco_correcao;

public class Banco_Correcao {

    public static void main(String[] args) {
        Banco itau = new Banco();
        itau.numero = 123;
        itau.nome = "Banco Itaú";
        itau.cria_conta(1);
        itau.cria_conta(2);
        
        ContaCorrente cc = itau.contas.get(0);
        cc.altera_saldo(10000);
        cc.movimenta(100, "Saque");
        cc.movimenta(1000, "Deposito");
        cc.mostra_estado();
    }
}
