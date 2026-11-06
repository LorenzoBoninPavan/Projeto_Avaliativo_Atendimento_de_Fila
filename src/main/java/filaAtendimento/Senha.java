/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package filaAtendimento;

import java.util.LinkedList;

/**
 *
 * @author Costa e Silva
 */
public class Senha {
    //Atributos senha

    private boolean naVez; // Atributo que vai mexer nas senhas
    private String senha; // Qual a senha que usuáio vai receber

    //Lista
    private LinkedList<String> scomum; // Lista das senhas comums
    private LinkedList<String> sprioritaria;//Lista das senhas prioritárias

    //Inicia as listas
    public Senha() {
        scomum = new LinkedList<>();
        sprioritaria = new LinkedList<>();
    }
    // Método para verificar se a scomum está vazia

    public boolean scomumVazia() {
        if (scomum.size() == 0) {
            return true;
        }

        return false;
    }
    // Método para verificar se a sprioritaria está vazia

    public boolean spriorutaruaVazia() {
        if (sprioritaria.size() == 0) {
            return true;
        }

        return false;
    }
    //Metodo que gera senha Comum na unha

    public void gerasenhaComum() {
        if (scomum.isEmpty()) {
            System.out.println("Não temos mais senhas");
        }
    }
        public void gerasenhaPrioritaria() {
        if (sprioritaria.isEmpty()) {
            System.out.println("Não temos mais senhas");
        }
    }
}
