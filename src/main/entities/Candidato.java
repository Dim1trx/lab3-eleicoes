package main.entities;

import java.util.Objects;

public class Candidato {
    private Long Id;
    private String nome;
    private String partidoPolitico;
    private Integer idade;
    private Integer numeroDeVotos;

    public Candidato(Long id, String nome, String partidoPolitico, Integer idade, Integer numeroDeVotos) {
        Id = id;
        this.nome = nome;
        this.partidoPolitico = partidoPolitico;
        this.idade = idade;
        this.numeroDeVotos = numeroDeVotos;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPartidoPolitico() {
        return partidoPolitico;
    }

    public void setPartidoPolitico(String partidoPolitico) {
        this.partidoPolitico = partidoPolitico;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Integer getNumeroDeVotos() {
        return numeroDeVotos;
    }

    public void setNumeroDeVotos(Integer numeroDeVotos) {
        this.numeroDeVotos = numeroDeVotos;
    }

    @Override
    public String toString() {
        return "Candidato -> " +
                "Id: " + Id +
                ", nome: " + nome +
                ", partidoPolitico: " + partidoPolitico +
                ", idade: " + idade +
                ", numeroDeVotos: " + numeroDeVotos +
                '.';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Candidato candidato = (Candidato) o;
        return Objects.equals(Id, candidato.Id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id);
    }
}
