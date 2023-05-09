/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import com.sevio.blackjack01.Deck;
import com.sevio.blackjack01.Carta;
import com.sevio.blackjack01.Naipe;
import com.sevio.blackjack01.Value;

/**
 *
 * @author sevio
 */
public class DeckTest {
    
    @Test
    public void testCriarDeckCompleto() {
        Deck deck = new Deck();
        deck.criarDeckCompleto();

        Assertions.assertEquals(52, deck.tamanhoDoDeck());
        
        // Este teste verifica se o método criarDeckCompleto() da classe Deck cria um baralho completo com 52 cartas.
        // Ele cria uma instância de Deck, chama o método criarDeckCompleto() e em seguida verifica se o tamanho do deck
        // é igual a 52 usando Assertions.assertEquals().
    }

    @Test
    public void testEmbaralhar() {
        Deck deck = new Deck();
        deck.criarDeckCompleto();
        Deck deckEmbaralhado = new Deck();
        deckEmbaralhado.criarDeckCompleto();
        deckEmbaralhado.embaralhar();

        Assertions.assertNotEquals(deck.toString(), deckEmbaralhado.toString());
        
        //  Este teste verifica se o método embaralhar() da classe Deck embaralha o deck de forma efetiva.
        // Ele cria duas instâncias de Deck, uma antes do embaralhamento (deck) e outra após o embaralhamento (deckEmbaralhado).
        // Ambos os decks são criados com o método criarDeckCompleto().
        // Em seguida, o método embaralhar() é chamado em deckEmbaralhado.
        // O teste verifica se a representação em forma de String dos dois decks é diferente usando Assertions.assertNotEquals().
    }

    @Test
    public void testValorDasCartas() {
        Deck deck = new Deck();
        deck.addCarta(new Carta(Naipe.COPAS, Value.AS));
        deck.addCarta(new Carta(Naipe.PAUS, Value.DAMA));
        deck.addCarta(new Carta(Naipe.ESPADA, Value.CINCO));

        Assertions.assertEquals(16, deck.valorDasCartas());
        
        // Este teste verifica se o método valorDasCartas() da classe Deck calcula corretamente o valor das cartas no deck.
        // Ele cria uma instância de Deck, adiciona três cartas com valores conhecidos (AS, DAMA e CINCO) e chama o
        // método valorDasCartas(). O teste verifica se o valor retornado é igual a 16 usando Assertions.assertEquals().
    }
    
    @Test
    public void testMoverTudoParaDeck() {
        Deck deck1 = new Deck();
        Deck deck2 = new Deck();

        deck1.addCarta(new Carta(Naipe.COPAS, Value.AS));
        deck1.addCarta(new Carta(Naipe.PAUS, Value.DAMA));

        deck1.moverTudoParaDeck(deck2);

        Assertions.assertEquals(0, deck1.tamanhoDoDeck());
        Assertions.assertEquals(2, deck2.tamanhoDoDeck());
        
        // Este teste verifica se o método moverTudoParaDeck() da classe Deck move todas as cartas de um deck para outro
        // corretamente. Ele cria duas instâncias de Deck (deck1 e deck2) e adiciona duas cartas em deck1.
        // Em seguida, o método moverTudoParaDeck() é chamado para mover as cartas de deck1 para deck2.
        // O teste verifica se o tamanho de deck1 é igual a 0 e o tamanho de deck2 é igual a 2 usando Assertions.assertEquals().
    }
}
