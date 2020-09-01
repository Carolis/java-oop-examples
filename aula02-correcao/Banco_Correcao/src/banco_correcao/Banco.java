package banco_correcao;

import java.util.ArrayList;

public class Banco {
    int numero;
    String nome;
    ArrayList<ContaCorrente> contas;
    
    Banco() {
        contas = new ArrayList();
    }
    
    void cria_conta(int numero) {
        ContaCorrente cc = new ContaCorrente(numero);
        contas.add(cc);
    }
    
    void exclui_conta(int index) {
       contas.remove(index);
    }
}
