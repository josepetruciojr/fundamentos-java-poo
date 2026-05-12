package aula06_relacionamentoEntreClasses;

import java.util.Scanner;

public class ProgramLutas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Lutador[] lutadores = new Lutador[1];

        for(int i = 0; i < lutadores.length; i++){
            System.out.print("Digite o nome: ");
            String nome = sc.nextLine();
            System.out.print("Nacionalidade: ");
            String nacionalidade = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            System.out.print("Peso: ");
            double peso = sc.nextDouble();
            System.out.print("Vitorias: ");
            int vitorias = sc.nextInt();
            System.out.print("Derrotas: ");
            int derrotas = sc.nextInt();
            System.out.print("Derrotas: ");
            int empates = sc.nextInt();

            lutadores[i] = new Lutador(nome, nacionalidade, idade, altura, peso, vitorias, derrotas, empates);
        }

        for(Lutador lut : lutadores){
            System.out.println(lut.apresentar());
        }
        for(Lutador lut : lutadores){
            lut.ganharLuta();
            lut.status();
        }
    sc.close();
    }
}