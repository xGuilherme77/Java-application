import java.util.ArrayList;

public class Alunos {
    public static void main(String[] args) {
        
        Aluno a1 = new Aluno("Guilherme");
        Aluno a2 = new Aluno("Ana");

        Turma t1 = new Turma("3º Ano");

        t1.adicionarAluno(a1);
        t1.adicionarAluno(a2);

        t1.exibirAlunos();
    }
}
/* 
=========================
       Classe Aluno
=========================
*/ 
class Aluno {
    private String nome;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

// =========================
// Classe Turma (Agregação)
// =========================
class Turma {
    private String nomeTurma;
    private ArrayList<Aluno> alunos;

    public Turma(String nomeTurma) {
        this.nomeTurma = nomeTurma;
        this.alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void exibirAlunos() {
        System.out.println("Alunos da " + nomeTurma + ":");
        for (Aluno a : alunos) {
            System.out.println("- " + a.getNome());
        }
    }
}
