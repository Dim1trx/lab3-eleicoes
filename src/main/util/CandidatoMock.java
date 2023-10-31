package main.util;

import main.entities.Candidato;

import java.util.ArrayList;
import java.util.List;

public class CandidatoMock {
    public static List<Candidato> createCandidatos() {
        List<Candidato> candidatos = new ArrayList<>();

        candidatos.add(new Candidato(1L, "João Silva", "Partido A", 45, 5000));
        candidatos.add(new Candidato(2L, "Maria Santos", "Partido B", 35, 7000));
        candidatos.add(new Candidato(3L, "Pedro Mendes", "Partido C", 50, 3000));
        candidatos.add(new Candidato(4L, "Ana Oliveira", "Partido A", 40, 6000));
        candidatos.add(new Candidato(5L, "Carlos Pereira", "Partido B", 38, 5500));
        candidatos.add(new Candidato(6L, "Sara Costa", "Partido C", 47, 4500));
        candidatos.add(new Candidato(7L, "Paulo Rodrigues", "Partido A", 42, 6500));
        candidatos.add(new Candidato(8L, "Laura Ferreira", "Partido B", 55, 8000));
        candidatos.add(new Candidato(9L, "Fernando Sousa", "Partido C", 33, 4800));
        candidatos.add(new Candidato(10L, "Marta Lopes", "Partido A", 48, 7500));

        return candidatos;
    }
}
