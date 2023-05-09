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
            
            boolean fimDoRound = false;
            
            // Começar a distribuir o baralho
            // O jogador recebe duas cartas
            deckDoJogador.montar(deckDeJogo);
            deckDoJogador.montar(deckDeJogo);
            
            // Dealer recebe duas cartas
            dealerDeck.montar(deckDeJogo);
            dealerDeck.montar(deckDeJogo);
            
            while(true) {
                System.out.println("Sua mão: ");
                System.out.println(deckDoJogador.toString());
                System.out.println("O valor da sua mão é de: " + deckDoJogador.valorDasCartas());
                
                // Mão do Dealer
                System.out.println("Mão do Dealer: " + dealerDeck.getCarta(0).toString() + "e [Oculto]");
                
                // O que o jogador quer fazer
                System.out.println("O que você quer fazer? (1) para bater, (2) para continuar.");
                int resposta = inputDoUsuario.nextInt();
                
                // Jogador escolhe bater
                if(resposta == 1) {
                    deckDoJogador.montar(deckDeJogo);
                    System.out.println("Seu jogo:" + deckDoJogador.getCarta(deckDoJogador.tamanhoDoDeck()-1).toString());
                    // Bust se a mão do jogador ficar maior que 21
                    if(deckDoJogador.valorDasCartas() > 21) {
                        System.out.println("Bust. Atualmente o valor é: " + deckDoJogador.valorDasCartas());
                        dinheiroDoJogador =- apostaDoJogador;
                        fimDoRound = true;
                        break;
                    }
                }
                if(resposta == 2) {
                    break;
                }
            }
            
            // Revelando as cartas do Dealer
            System.out.println("Cartas do Dealer: " + dealerDeck.toString());
            //Ver se o Dealer tem mais ponto que o jogador
            if((dealerDeck.valorDasCartas() > deckDoJogador.valorDasCartas()) && fimDoRound == false) {
                System.out.println("O Dealer venceu.");
                dinheiroDoJogador -= apostaDoJogador;
                fimDoRound = true;
            }
            
            // Dealer compra até 16, permanece em 17
            while((dealerDeck.valorDasCartas() < 17) && fimDoRound == false) {
                dealerDeck.montar(deckDoJogador);
                System.out.println("Dealer compra: " + dealerDeck.getCarta(dealerDeck.tamanhoDoDeck()-1).toString());
            }
            
            // Mostrar o Valor Total do Dealer
            System.out.println("O valor da mão do Delar é: " + dealerDeck.valorDasCartas());
            
            // Determina se o Dealer "Bustou"
            if((dealerDeck.valorDasCartas() > 21) && fimDoRound == false) {
                System.out.println("Dealer Bustou. Você venceu.");
                dinheiroDoJogador += apostaDoJogador;
                fimDoRound = true;
            }
            
            // Determina se houve empate
            if((deckDoJogador.valorDasCartas() == dealerDeck.valorDasCartas()) && fimDoRound == false) {
                System.out.println("Empate.");
                fimDoRound = true;
            }
            
            // Determinar se o Jogador Venceu
            if((deckDoJogador.valorDasCartas() > dealerDeck.valorDasCartas()) && fimDoRound == false) {
                System.out.println("Você venceu.");
                dinheiroDoJogador += apostaDoJogador;
                fimDoRound = true;
            }
            
        }
        System.out.println("Fim de Jogo! Você está sem dinheiro.");
    }
    
}
