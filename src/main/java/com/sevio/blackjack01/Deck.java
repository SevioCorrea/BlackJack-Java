/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sevio.blackjack01;

import java.util.ArrayList;

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
