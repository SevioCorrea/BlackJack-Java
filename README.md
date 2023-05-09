# Documentação

Execute o Arquivo Blackjack.java


## Classe Carta

A classe `Carta` representa uma carta de baralho no jogo Black Jack.

### Atributos

- `naipe`: Representa o naipe da carta.
- `value`: Representa o valor da carta.

### Construtor

```java
public Carta(Naipe naipe, Value value)
```

Constrói um objeto `Carta` com o naipe e o valor especificados.

### Método `toString()`

```java
public String toString()
```

Retorna uma representação em string da carta, que combina o naipe e o valor.

### Método `getValue()`

```java
public Value getValue()
```

Retorna o valor da carta.

## Classe Deck

A classe `Deck` representa um baralho no jogo Black Jack.

### Atributos

- `cartas`: Uma lista de objetos do tipo `Carta`, que representa as cartas presentes no baralho.

### Construtor

```java
public Deck()
```

Constrói um objeto `Deck` vazio.

### Método `criarDeckCompleto()`

```java
public void criarDeckCompleto()
```

Cria um baralho completo preenchido com todas as cartas do jogo.

### Método `embaralhar()`

```java
public void embaralhar()
```

Embaralha as cartas do baralho.

### Métodos de manipulação de cartas

- `removerCarta(int i)`: Remove a carta na posição especificada.
- `getCarta(int i)`: Retorna a carta na posição especificada.
- `addCarta(Carta addCarta)`: Adiciona uma nova carta ao baralho.
- `montar(Deck vindoDe)`: Adiciona a primeira carta de outro baralho ao baralho atual.
- `tamanhoDoDeck()`: Retorna o número de cartas no baralho.
- `moverTudoParaDeck(Deck moverPara)`: Move todas as cartas para outro baralho.
- `valorDasCartas()`: Retorna o valor total das cartas no baralho.

### Método `toString()`

```java
public String toString()
```

Retorna uma representação em string do baralho.

# Classe Blackjack

A classe `Blackjack` contém o método `main` que representa o jogo Black Jack.

## Método `main`

```java
public static void main(String[] args)
```

O método `main` é o ponto de entrada do programa.

1. Criação do Deck de Jogo:
   - Instancia um objeto `Deck` chamado `deckDeJogo`.
   - Chama o método `criarDeckCompleto` para preencher o deck com todas as cartas.
   - Chama o método `embaralhar` para embaralhar as cartas.

2. Criação dos Decks para o Jogador e para o Dealer:
   - Instancia dois objetos `Deck`: `deckDoJogador` e `dealerDeck`.

3. Configuração inicial do jogo:
   - Define uma variável `dinheiroDoJogador` com o valor inicial de $100.00.
   - Instancia um objeto `Scanner` chamado `inputDoUsuario` para receber entrada do usuário.

4. Loop principal do jogo:
   - Enquanto o jogador tiver dinheiro:
     - Solicita a aposta do jogador.
     - Verifica se a aposta é válida (não pode apostar mais do que tem).
     - Inicializa a variável `fimDoRound` como `false`.

     - Distribuição das cartas:
       - O jogador recebe duas cartas do `deckDeJogo`.
       - O dealer recebe duas cartas do `deckDeJogo`.

     - Loop do jogador:
       - Enquanto o jogador quiser continuar:
         - Exibe a mão do jogador e o valor total.
         - Exibe a primeira carta do dealer e uma carta oculta.
         - Pergunta ao jogador a próxima ação: bater ou continuar.
         - Se o jogador escolher bater, adiciona uma nova carta ao `deckDoJogador`.
           - Verifica se o jogador estourou (valor total da mão maior que 21).
         - Se o jogador escolher continuar, encerra o loop.

     - Revelação das cartas do Dealer:
       - Exibe todas as cartas do dealer.

     - Verificação do resultado:
       - Verifica se o dealer venceu (valor total maior que o do jogador).
       - Se o dealer venceu, diminui a aposta do jogador e encerra o round.
       - O dealer compra cartas até atingir 16 pontos ou mais.
       - Exibe a mão total do dealer.

     - Verificação de vitória do jogador:
       - Verifica se o dealer estourou (valor total maior que 21).
       - Se o dealer estourou, aumenta a aposta do jogador e encerra o round.

     - Verificação de empate:
       - Verifica se o valor total do jogador é igual ao do dealer.
       - Se houver empate, encerra o round.

     - Verificação final do resultado:
       - Verifica se o jogador venceu (valor total maior que o do dealer).
       - Se o jogador venceu, aumenta a aposta do jogador e encerra o round.
       - Se o jogador perdeu, diminui a aposta do jogador e encerra o round.

     - Limpeza dos decks e exibição de mensagem de fim de jogo.

5. Exibe a mensagem de fim de jogo quando o jogador fica sem dinheiro.

# Testes

## Classe `DeckTest`:

1. `testCriarDeckCompleto()`: Este teste verifica se o método `criarDeckCompleto()` da classe `Deck` cria um baralho completo com 52 cartas. Ele cria uma instância de `Deck`, chama o método `criarDeckCompleto()` e em seguida verifica se o tamanho do deck é igual a 52 usando `Assertions.assertEquals()`.

2. `testEmbaralhar()`: Este teste verifica se o método `embaralhar()` da classe `Deck` embaralha o deck de forma efetiva. Ele cria duas instâncias de `Deck`, uma antes do embaralhamento (`deck`) e outra após o embaralhamento (`deckEmbaralhado`). Ambos os decks são criados com o método `criarDeckCompleto()`. Em seguida, o método `embaralhar()` é chamado em `deckEmbaralhado`. O teste verifica se a representação em forma de String dos dois decks é diferente usando `Assertions.assertNotEquals()`.

3. `testValorDasCartas()`: Este teste verifica se o método `valorDasCartas()` da classe `Deck` calcula corretamente o valor das cartas no deck. Ele cria uma instância de `Deck`, adiciona três cartas com valores conhecidos (AS, DAMA e CINCO) e chama o método `valorDasCartas()`. O teste verifica se o valor retornado é igual a 16 usando `Assertions.assertEquals()`.

4. `testMoverTudoParaDeck()`: Este teste verifica se o método `moverTudoParaDeck()` da classe `Deck` move todas as cartas de um deck para outro corretamente. Ele cria duas instâncias de `Deck` (`deck1` e `deck2`) e adiciona duas cartas em `deck1`. Em seguida, o método `moverTudoParaDeck()` é chamado para mover as cartas de `deck1` para `deck2`. O teste verifica se o tamanho de `deck1` é igual a 0 e o tamanho de `deck2` é igual a 2 usando `Assertions.assertEquals()`.


## Classe `Carta`:

1. `testToString()`: Este teste verifica se o método `toString()` da classe `Carta` retorna a representação correta da carta como uma String. Ele cria uma instância de `Carta` com o naipe `COPAS` e o valor `AS`. Em seguida, compara a saída do método `toString()` com a String esperada, que é "COPAS-AS".

2. `testGetValue()`: Este teste verifica se o método `getValue()` da classe `Carta` retorna o valor correto da carta. Ele cria uma instância de `Carta` com o naipe `PAUS` e o valor `DAMA`. Em seguida, compara o valor retornado pelo método `getValue()` com o valor esperado, que é `DAMA`.
