package main.repository;

import main.entities.Candidato;
import main.util.CandidatoMock;

import java.util.List;


public class RepositorioCandidatos implements Repositorio{
    private final List<Candidato> candidatos = CandidatoMock.createCandidatos();

    public List<Candidato> getCandidatos() {
        return candidatos;
    }

    public Candidato candidatoMaisJovem() {
        int idade = 100;
        Candidato candidato = null;
        for (Candidato c : candidatos) {
            if (c.getIdade() < idade) {
                idade = c.getIdade();
                candidato = c;
            }
        }
        return candidato;
    }

    public Candidato candidatoMaisVelho() {
        int idade = 0;
        Candidato candidato = null;
        for (Candidato c : candidatos) {
            if (c.getIdade() > idade) {
                idade = c.getIdade();
                candidato = c;
            }
        }
        return candidato;
    }


    public Candidato candidatoMaisVotado() {
        int votos = 0;
        Candidato candidato = null;
        for (Candidato c : candidatos) {
            if (c.getNumeroDeVotos() > votos) {
                votos = c.getNumeroDeVotos();
                candidato = c;
            }
        }
        return candidato;
    }

    public Candidato candidatoMenosVotado() {
        int votos = 10000;
        Candidato candidato = null;
        for (Candidato c : candidatos) {
            if (c.getNumeroDeVotos() < votos) {
                votos = c.getNumeroDeVotos();
                candidato = c;
            }
        }
        return candidato;
    }

    public double totalDeVotos() {
        double total = 0;
        for (Candidato c : candidatos) {
            total += c.getNumeroDeVotos();
        }
        return total;
    }

    public double mediaDeVotos() {
        return (totalDeVotos() / candidatos.size());
    }

    @Override
    public void imprimeCandidatos() {
        for (Candidato c : candidatos) {
            System.out.println(c);
        }
    }
}

