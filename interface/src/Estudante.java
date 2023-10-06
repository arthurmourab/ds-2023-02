public class Estudante implements Comparable<Estudante> {
    private String nome;
    private String sobrenome;
    private int idade;
    private double nota1;
    private double nota2;
    private double media;
    private String professor;
    private String turma;

    // Métodos getters
    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public double getMedia() {
        return media;
    }

    public String getProfessor() {
        return professor;
    }

    public String getTurma() {
        return turma;
    }

    // Métodos setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    // Método principal de ordenação
    @Override
    public int compareTo(Estudante o) {
        return this.nome.compareTo(o.nome);
    }
}
