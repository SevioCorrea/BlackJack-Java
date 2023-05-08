/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sevio.blackjack01;

import java.util.Scanner;

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
        deckDeJogo.embaralhar();
        
        // Deck para o jogador
        Deck deckDoJogador = new Deck();
        
        // Deck para o dealer
        Deck dealerDeck = new Deck();
        
        double dinheiroDoJogador = 100.00;
        
        Scanner inputDoUsuario = new Scanner(System.in);
        
        // Game Loop
        while(dinheiroDoJogador > 0) {
            // Receber a aposta do jogador
            System.out.println("Você tem $:" + dinheiroDoJogador + ", quanto você quer apostar?");
            double apostaDoJogador = inputDoUsuario.nextDouble();
            if(apostaDoJogador > dinheiroDoJogador) {
                System.out.println("Você não pode apostar mais do que você tem. Por favor, saia.");
                break;
            }
            
            // Começar a distribuir o baralho
            // O jogador recebe duas cartas
            deckDoJogador.montar(deckDeJogo);
            deckDoJogador.montar(deckDeJogo);
            
            // Dealer recebe duas cartas
            dealerDeck.montar(deckDeJogo);
            dealerDeck.montar(deckDeJogo);
            
            while(true) {
                System.out.println("Sua mão:");
                System.out.println(deckDoJogador.toString());
            }
            
        }
        System.out.println("Fim de Jogo! Você está sem dinheiro.");
    }
    
}
