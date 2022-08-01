package BancoDigital;

public class Cliente {
    private String nome;
    private String sobrenome;
    protected Contato contato;
    protected Endereco endereco;

    public Cliente(String nome, String sobrenome, Contato contato, Endereco endereco) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.contato = contato;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    @Override
    public String toString() {
        return "Titular: " + nome +
                " " + sobrenome;
    }
}
