package main.util;

import main.entities.Candidato;
import main.repository.Repositorio;

import java.util.Scanner;

public class Menu {
    public static void imprimeMenu() {
        System.out.println("Menu:");
        System.out.println("1 - Candidato mais jovem");
        System.out.println("2 - Candidato mais velho");
        System.out.println("3 - Candidato mais votado");
        System.out.println("4 - Candidato menos votado");
        System.out.println("5 - Total de votos e média de votos");
        System.out.println("6 - Imprimir todos os candidatos");
        System.out.println("7 - Sair");
        System.out.print("Digite uma opção: ");
    }

    public static void imprimeOpcao(int opcao, Repositorio repo) {
        switch (opcao) {
            case 1:
                Candidato maisJovem = repo.candidatoMaisJovem();
                System.out.printf("Candidato mais jovem: %s, %d anos. %n", maisJovem.getNome(), maisJovem.getIdade());
                break;
            case 2:
                Candidato maisVelho = repo.candidatoMaisVelho();
                System.out.printf("Candidato mais velho: %s, %d anos. %n", maisVelho.getNome(), maisVelho.getIdade());
                break;
            case 3:
                Candidato maisVotado = repo.candidatoMaisVotado();
                System.out.printf("Candidato mais votado: %s, %d votos. %n", maisVotado.getNome(), maisVotado.getNumeroDeVotos());
                break;
            case 4:
                Candidato menosVotado = repo.candidatoMenosVotado();
                System.out.printf("Candidato menos votado: %s, %d votos. %n", menosVotado.getNome(), menosVotado.getNumeroDeVotos());
                break;
            case 5:
                System.out.println("Total de votos: " + repo.totalDeVotos());
                System.out.println("Média de votos: " + repo.mediaDeVotos());
                break;
            case 6:
                repo.imprimeCandidatos();
                break;
            case 7:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }
}
