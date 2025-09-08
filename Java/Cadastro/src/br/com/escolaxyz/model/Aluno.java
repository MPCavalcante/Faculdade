package br.com.escolaxyz.model;

import java.util.Objects;

public class Aluno {
    private String nome;
    private String enderecoResidencial;
    private String telefoneContato;
    private String email;
    private String matricula;

    public Aluno() {}

    public Aluno(String nome, String enderecoResidencial, String telefoneContato, String email, String matricula) {
        this.nome = nome;
        this.enderecoResidencial = enderecoResidencial;
        this.telefoneContato = telefoneContato;
        this.email = email;
        this.matricula = matricula;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getEnderecoResidencial() { return enderecoResidencial; }
    public void setEnderecoResidencial(String enderecoResidencial) { this.enderecoResidencial = enderecoResidencial; }

    public String getTelefoneContato() { return telefoneContato; }
    public void setTelefoneContato(String telefoneContato) { this.telefoneContato = telefoneContato; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", enderecoResidencial='" + enderecoResidencial + '\'' +
                ", telefoneContato='" + telefoneContato + '\'' +
                ", email='" + email + '\'' +
                ", matricula='" + matricula + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(matricula, aluno.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricula);
    }
}
