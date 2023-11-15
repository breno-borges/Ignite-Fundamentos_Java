package pessoa;

public class TesteDePessoa {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.setNome("Breno");
        professor.setIdade(21);
        professor.setCpf("123456789-10");
        professor.setSalario(2500);

        System.out.println(professor.imprimirDadosPessoa());

        Aluno aluno = new Aluno();
        aluno.setNome("Aluno");
        aluno.setIdade(18);
        aluno.setCpf("123456789-11");
        aluno.setMatricula("45789");

        System.out.println(aluno.imprimirDadosPessoa());
    }
}
