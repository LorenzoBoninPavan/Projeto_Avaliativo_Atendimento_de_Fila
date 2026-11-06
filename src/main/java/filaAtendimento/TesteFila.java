/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package filaAtendimento;

import java.util.Scanner;

/**
 *
 * @author Costa e Silva
 */
public class TesteFila {
        public static void main(String[] args) {
        Fila fila = new Fila();
        int opcao;
        String x;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            mostrarMenu();
            opcao = scanner.nextInt();

            switch (opcao) {

                case 1:
                    fila.gerarSenhas();
                    fila.inserir();
                    break;

                case 2:
                    x = "banana";
                    if(!fila.empty()) {
                        x = fila.remover(x);
                        System.out.println("Processo retirado da fila: " + x);
                    }
                    else{
                    System.out.println("Fila de processos está vazia.");
                    }
                    break;
                    
                case 3:
                    fila.mostrarFila();
                    break;
            }
        }
    }

    public static void mostrarMenu() {
        System.out.println("----MENU----");
        System.out.println("1 - para incluir novo processo.");
        System.out.println("2 - para retirar com maior tempo de processo.");
        System.out.println("3 - para mostrar o estado da fila.");
        System.out.println("4 - para sair.");
        System.out.println("Digite sua opção: ");
    }
}
