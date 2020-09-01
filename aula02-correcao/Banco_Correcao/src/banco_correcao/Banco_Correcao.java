package banco_correcao;

public class Banco_Correcao {

    public static void main(String[] args) {
        Banco itau = new Banco();
        itau.numero = 123;
        itau.nome = "Banco Itaú";
        itau.cria_conta(1);
        itau.cria_conta(2);
        
        ContaCorrente cc = itau.contas.get(0);
        cc.mostra_estado();
    }
    
}
