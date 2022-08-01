package BancoDigital;

public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Silvio", "Gomes",
                new Contato("(11) 8685-6197", "(11) 98685-6197", "silviogj@outlook.com"),
                new Endereco(11111111, "Rua Sem Saida", "20B", "Apto 20B", "Novo Mundo", "São Paulo", "SP"));
        Conta cc = new ContaCorrente(c1);
        cc.depositar(100);
        Conta cp = new ContaPoupanca(c1);
        cc.transferir(49, cp);
        Banco banco = new Banco();
        banco.setNome("Santander");
        banco.addConta(cc);
        banco.addConta(cp);
        banco.infosContas();
        System.out.println("*******************************");
        banco.infosClientes();
    }
}
