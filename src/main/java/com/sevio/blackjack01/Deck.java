/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sevio.blackjack01;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author sevio
 */
public class Deck {
    
    private ArrayList<Carta> cartas; // Instância - var
    
    public Deck() { // Construtor        
        this.cartas = new ArrayList<Carta>();        
    }
    
    public void criarDeckCompleto() {
        // Gerando Cartas
        for(Naipe naipeCarta : Naipe.values()) {
            for(Value valorCarta : Value.values()) { // Temos 4 Naipes, mas queremos 52 Cartas
                // Adicionar uma nova carta ao baralho
                this.cartas.add(new Carta(naipeCarta, valorCarta));
            }
        }
    }
    
    public void embaralhar() {
        // Percorrer aleatoriamente o baralho e colocar em um baralho temporário para ter ordem diferente
        // O baralho temporário é o baralho embaralhado
        ArrayList<Carta> tempDeck = new ArrayList<Carta>();
        Random random = new Random();
        int randomCardIndex = 0;
        int tamanhoOriginal = this.cartas.size();
        for(int i = 0; i < tamanhoOriginal; i++) {
            // Index aleatório
            randomCardIndex = random.nextInt((this.cartas.size()-1 - 0) + 1) + 0;
            tempDeck.add(this.cartas.get(randomCardIndex));
            // Removendo do Deck original
            this.cartas.remove(randomCardIndex);
        }
        this.cartas = tempDeck; // Atribuindo Deck embaralhado
    }
    
    public String toString() {
        String listaCartaOutput = "";
        int i = 0; // Teste
        for(Carta arrayCarta : this.cartas) {
            listaCartaOutput += "\n" + i + "-" + arrayCarta.toString();
            i ++;
        }
        return listaCartaOutput;
    }
    
}
