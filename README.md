![Java](https://img.shields.io/badge/Java-17-orange)
![Status](https://img.shields.io/badge/status-learning-blue)
# Java RPG CLI

Um pequeno jogo de RPG feito em **Java utilizando Programação Orientada a Objetos (POO)**.  
O jogador cria um herói e enfrenta inimigos em batalhas por turnos diretamente no terminal.

Este projeto foi criado com o objetivo de **praticar lógica de programação, estrutura de classes e conceitos de POO em Java**.

---

# Como funciona

O jogador cria um herói e entra em batalha contra diferentes inimigos.

Fluxo básico do jogo:

1. Jogador digita o nome do herói
2. O herói enfrenta um **Goblin**
3. Após derrotar o Goblin, os status do herói são restaurados
4. Um novo inimigo aparece (**Esqueleto**)
5. O combate continua até o jogador vencer ou morrer

As ações do jogador são controladas pelo terminal.

Exemplo:

1 - Atacar
2 - Curar
3 - Ver status
4 - Especial
5 - Abandonar luta

---

# Estrutura do projeto

O jogo foi desenvolvido utilizando **classes separadas para cada entidade**.
```text
src/
├── com.mycompany.jogopoo
│ └── JogoPoo.java
│
└── poo
     └── Personagem.java
     └── Heroi.java
     └── Inimigo.java
     └── Goblin.java
     └── Esqueleto.java
     └── Chefe.java
```


---

# Mecânicas implementadas

- Sistema de combate por turnos
- Herança entre classes
- Polimorfismo
- Controle de fluxo com `while` e `switch`
- Interação com o usuário via `Scanner`

---

# Tecnologias utilizadas

- Java
- Programação Orientada a Objetos (POO)
- Terminal / CLI

---

# Como executar

1. Clone o repositório 
```Bash
git clone https://github.com/pietros133/JavaRPG-CLI.git
```

2. Entre na pasta do projeto
```Bash
cd JavaRPG-CLI
```


3. Compile o projeto
```Bash
javac *.java
```



5. Execute o jogo
