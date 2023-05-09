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
public class BlackjackTest {
    
    @Test
    public void testCriarDeckCompleto() {
        Deck deck = new Deck();
        deck.criarDeckCompleto();

        Assertions.assertEquals(52, deck.tamanhoDoDeck());
    }

    @Test
    public void testEmbaralhar() {
        Deck deck = new Deck();
        deck.criarDeckCompleto();
        Deck deckEmbaralhado = new Deck();
        deckEmbaralhado.criarDeckCompleto();
        deckEmbaralhado.embaralhar();

        Assertions.assertNotEquals(deck.toString(), deckEmbaralhado.toString());
    }

    @Test
    public void testValorDasCartas() {
        Deck deck = new Deck();
        deck.addCarta(new Carta(Naipe.COPAS, Value.AS));
        deck.addCarta(new Carta(Naipe.PAUS, Value.DAMA));
        deck.addCarta(new Carta(Naipe.ESPADA, Value.CINCO));

        Assertions.assertEquals(16, deck.valorDasCartas());
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
    }
}
