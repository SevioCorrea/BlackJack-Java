/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sevio.blackjack01;

/**
 *
 * @author sevio
 */
public class Carta {
    
    private Naipe naipe;
    private Value value;
    
    public Carta(Naipe naipe, Value value) {  // Construtor        
        this.value = value;
        this.naipe = naipe;       
    }
    
    public String toString() { // Imprimir o Naipe e o Valor
        return this.naipe.toString() + "-" + this.value.toString();
    }
    
    public Value getValue() { // Checar os valores da Classe Deck para determinar quantos pontos estão na mão do Usuário        
        return this.value;       
    }
    
}
