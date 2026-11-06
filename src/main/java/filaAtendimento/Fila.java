/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package filaAtendimento;

import java.util.LinkedList;

/**
 *
 * @author Costa e Silva
 */
public class Fila {

    //Atributos cliente
    private String lugar; // Define o lugar na fila
    private int contador = 0;
    private int tamanho = 20;
    //private boolean prioritario; // Boolean se for True o cliente é prioritario
    //private boolean atendido; // Boolean se foi atendido já entra na fila fatendido
    //private Senha senha; // Senha com tipo senha como chave estrangeira

    //Listas
    private LinkedList<String> scomum; // Lista onde será colocado senhas da fila comum
    private LinkedList<String> fcomum; // Lista onde será colocado pessoas que não são prioritárias
    //private LinkedList<String> fprioritaria; // Lista onde será colocado pessoas que são prioritárias
    private LinkedList<String> fatendido; //Lista onde será colocado aqueles que já foram atendidos

    //Inicia as Listas
    public Fila() {
        scomum = new LinkedList<String>();
        //fprioritaria = new LinkedList<>();
        fatendido = new LinkedList<>();
        fcomum = new LinkedList<>();
    }

    public void gerarSenhas() {
        String nNumero;
        for (int i = 1; i < 20; i++) {
                if (contador < 10) {
                    nNumero = "N00" + contador;
                } else {
                    nNumero = "N0" + contador;
                }
                scomum.addLast(nNumero);
                contador++;
            }
    }

    // Método para verificar se a Fila está vazia
    public boolean empty() {
        if (fcomum.size() == 0) {
            System.out.println("A fila comum está vazia");
            return true;
        }

        return false;
    }
    // Método para inserir um item na Fila

    public void inserir() {
        String x;
        if (fcomum.size() <= tamanho) {
            x = scomum.pollFirst();
            fcomum.addLast(x);
            System.out.println("Senha: " + x);
        } else {
            System.out.println("A fila está cheia, volte outra hora");

        }
    }

    public String remover(String x) {
        if (this.empty()) { // Pré-condição
            System.out.println("Underflow na Fila!");
            System.exit(1);
        } else { // Pós-condição
            x = fcomum.removeFirst();
        }
        return x;

    }

    public void mostrarFila() {
        System.out.println("Estado atual da fila: ");
        for (String x : fcomum) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    //private boolean ClientePrioritario(int x, String cliente){
    //if(x == 0){
    //fprioritaria.addLast(cliente);
    //return this.prioritario = true;
    //}
    //else
    //fcomum.addLast(cliente);
    //return this.prioritario = false;
    //}
    // Método para verificar se a fcomum está vazia
    //public boolean fcomumVazia() {
    //if (fcomum.size() == 0) {
    //return true;
    //}
    //return false;
    //}
    // Método para verificar se a fprioritaria está vazia
    //public boolean lprioritariaVazia() {
    //if (fprioritaria.size() == 0) {
    //return true;
    //}
    //return false;
    //}
}
