package pessoa;

public class Pessoa {
    private String nome;
    private int idade;
    private String cpf;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public String imprimirDadosPessoa() {
        return "O nome da pessoa é " + nome + ", a idade é " + idade + "e o documento é " + cpf;
    }
}