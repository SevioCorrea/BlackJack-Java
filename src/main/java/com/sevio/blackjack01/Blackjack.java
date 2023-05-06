/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sevio.blackjack01;

/**
 *
 * @author sevio
 */
public class Blackjack {
    
    public static void main(String[] args) {
        // Mensagem de Bem-Vindo
        System.out.println("Bem-vindo ao Black Jack");
        
        // Deck de jogo
        Deck deckDeJogo = new Deck();
        deckDeJogo.criarDeckCompleto();
        
        System.out.println(deckDeJogo);
    }
    
}
