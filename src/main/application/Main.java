package main.application;

import main.repository.RepositorioCandidatos;
import main.entities.Candidato;
import main.util.Menu;


import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RepositorioCandidatos repo = new RepositorioCandidatos();
        List<Candidato> list = repo.getCandidatos();
        Scanner sc = new Scanner(System.in);

        int opcao = 0;
        while (opcao != 7) {
            Menu.imprimeMenu();

            try {
                opcao = sc.nextInt();
            } catch (InputMismatchException e) {
                opcao = 0;
            }

            sc.nextLine();

            Menu.imprimeOpcao(opcao, repo);
            System.out.println("--------");
            System.out.print("Pressione enter para continuar...");
            sc.nextLine();
        }
    }
}