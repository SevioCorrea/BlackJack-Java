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
