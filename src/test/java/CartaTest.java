/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.sevio.blackjack01.Carta;
import com.sevio.blackjack01.Naipe;
import com.sevio.blackjack01.Value;

public class CartaTest {

    @Test
    public void testToString() {
        Carta carta = new Carta(Naipe.COPAS, Value.AS);
        String expected = "COPAS-AS";
        String actual = carta.toString();
        Assertions.assertEquals(expected, actual);
        
        // Este teste verifica se o método toString() da classe Carta retorna a representação correta da carta como uma String.
        // Ele cria uma instância de Carta com o naipe COPAS e o valor AS.
        // Em seguida, compara a saída do método toString() com a String esperada, que é "COPAS-AS".
    }

    @Test
    public void testGetValue() {
        Carta carta = new Carta(Naipe.PAUS, Value.DAMA);
        Value expected = Value.DAMA;
        Value actual = carta.getValue();
        Assertions.assertEquals(expected, actual);
        
        // Este teste verifica se o método getValue() da classe Carta retorna o valor correto da carta.
        // Ele cria uma instância de Carta com o naipe PAUS e o valor DAMA.
        // Em seguida, compara o valor retornado pelo método getValue() com o valor esperado, que é DAMA.
    }
}
