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
    
    
    // Getter and Setter
    
    public void removerCarta(int i) {
        this.cartas.remove(i);        
    }
    
    public Carta getCarta(int i) {
        return this.cartas.get(i);
    }
    
    public void addCarta(Carta addCarta) {
        this.cartas.add(addCarta);
    }
    
    // Montar o Deck
    public void montar(Deck vindoDe) {
        // Adicionando a Carta no baralho e removendo de onde está vindo
        this.cartas.add(vindoDe.getCarta(0)); // Adicionando a Carta ao baralho
        vindoDe.removerCarta(0); // Removendo a Carta de onde está vindo
    }
    
    public int tamanhoDoDeck() {
        return this.cartas.size();
    }
    
    public void moverTudoParaDeck(Deck moverPara) {
        int thisTamanhoDoDeck = this.cartas.size(); // ToDo: Melhorar o nome
        
        // Colocar cartas no Deck moverPara
        for(int i = 0; i < thisTamanhoDoDeck; i++) {
            moverPara.addCarta(this.getCarta(i));
        }
        
        for(int i=0; i < thisTamanhoDoDeck; i++) {
            this.removerCarta(0);
        }
    }
    
    // Retorna o valor total das cartas no deck
    public int valorDasCartas() {
        int valorTotal = 0;
        int ases = 0;
        
        for(Carta arrayCarta : this.cartas) {
            switch(arrayCarta.getValue()) {
            case DOIS: valorTotal += 2; break;
            case TRES: valorTotal += 3; break;
            case QUATRO: valorTotal += 4; break;
            case CINCO: valorTotal += 5; break;
            case SEIS: valorTotal += 6; break;
            case SETE: valorTotal += 7; break;
            case OITO: valorTotal += 8; break;
            case NOVE: valorTotal += 9; break;
            case DEZ: valorTotal += 10; break;
            case VALETE: valorTotal += 10; break;
            case DAMA: valorTotal += 10; break;
            case REI: valorTotal += 10; break;
            case AS: ases += 1; break;
                
            }
        }
        
       for(int i = 0; i < ases; i++) {
           
           if(valorTotal > 10) {
               valorTotal += 1;
           }
           else {
               valorTotal += 11;
           }
           
       }
       
       return valorTotal;
    }
    
    public String toString() {
        String listaCartaOutput = "";
        for(Carta arrayCarta : this.cartas) {
            listaCartaOutput += "\n" + arrayCarta.toString();
        }
        return listaCartaOutput;
    }
    
}
