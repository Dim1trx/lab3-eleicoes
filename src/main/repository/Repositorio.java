package main.repository;

import main.entities.Candidato;


public interface Repositorio {
    public Candidato candidatoMaisJovem();
    public Candidato candidatoMaisVelho();
    public Candidato candidatoMaisVotado();
    public Candidato candidatoMenosVotado();
    public double totalDeVotos();
    public double mediaDeVotos();
    public void imprimeCandidatos();
}
