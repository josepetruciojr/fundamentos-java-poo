package aula05_encapsulamento.pratica01;

import java.time.LocalDateTime;
import java.util.Scanner;

public class ProgramPatrica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ServidorCameras sc = new ServidorCameras();
        System.out.println("Quer ligar o servidor? Sim ou Não");
        String resp = sc.resposta(scanner.nextLine());//armazena na variavel resp a chamada do metodo resposta, passando o scanner como argumento
        sc.online();


    }
}
