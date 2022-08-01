package BancoDigital;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    public String nome;
    private List<Conta> contas = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void addConta(Conta conta) {
        this.contas.add(conta);
    }

    public void infosContas() {
        System.out.printf("Banco: %s\n", getNome());
        for (Conta conta : this.contas) {
            System.out.println("------------------------------------------------------------------");
            System.out.println(conta.getClass().getSimpleName());
            conta.infosDetalhes();
        }
    }

    public void infosClientes() {
        System.out.printf("Banco: %s\n", getNome());
        for (Conta conta : this.contas) {
            System.out.println("------------------------------------------------------------------");
            System.out.println(conta.getClass().getSimpleName());
            conta.infosClientes();
        }
    }
}
