package test;

import main.entities.Candidato;
import main.repository.RepositorioCandidatos;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RepositorioCandidatosTest {
    @Test
    public void candidatoMaisJovem() {
        RepositorioCandidatos repositorioCandidatos = new RepositorioCandidatos();
        Candidato candidato = repositorioCandidatos.candidatoMaisJovem();
        assertEquals("Fernando Sousa", candidato.getNome());
    }

    @Test
    public void candidatoMaisVelho() {
        RepositorioCandidatos repositorioCandidatos = new RepositorioCandidatos();
        Candidato candidato = repositorioCandidatos.candidatoMaisVelho();
        assertEquals("Laura Ferreira", candidato.getNome());
    }

    @Test
    public void candidatoMaisVotado() {
        RepositorioCandidatos repositorioCandidatos = new RepositorioCandidatos();
        Candidato candidato = repositorioCandidatos.candidatoMaisVotado();
        assertEquals("Laura Ferreira", candidato.getNome());
    }

    @Test
    public void candidatoMenosVotado() {
        RepositorioCandidatos repositorioCandidatos = new RepositorioCandidatos();
        Candidato candidato = repositorioCandidatos.candidatoMenosVotado();
        assertEquals("Pedro Mendes", candidato.getNome());
    }

    @Test
    public void totalDeVotos() {
        RepositorioCandidatos repositorioCandidatos = new RepositorioCandidatos();
        assertEquals(57800.0, repositorioCandidatos.totalDeVotos(), 0.005);
    }

    @Test
    public void mediaDeVotos() {
        RepositorioCandidatos repositorioCandidatos = new RepositorioCandidatos();
        assertEquals(5780.0, repositorioCandidatos.mediaDeVotos(), 0.005);
    }
}
