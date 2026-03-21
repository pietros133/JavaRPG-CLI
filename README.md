# JavaRPG-CLI

JavaRPG-CLI é um pequeno jogo de RPG desenvolvido em Java que roda diretamente no terminal.
O projeto foi criado com o objetivo de praticar conceitos de **Programação Orientada a Objetos (POO)**, lógica de programação e organização de código.

## Objetivo do Projeto

Este projeto foi desenvolvido para reforçar conceitos importantes de Java, como:

* Classes e Objetos
* Encapsulamento
* Métodos
* Organização de pacotes
* Lógica de combate em turnos

Além disso, serve como um projeto de prática para melhorar habilidades em desenvolvimento back-end e estruturação de sistemas simples.

## Como Funciona

O jogo acontece no terminal.

Fluxo básico do jogo:

1. O jogador cria um personagem digitando seu nome.
2. Um inimigo aparece.
3. O combate acontece em turnos.
4. O jogador pode atacar o inimigo.
5. A batalha termina quando a vida de um dos personagens chega a 0.

## Estrutura do Projeto

O projeto está organizado em pacotes Java para separar responsabilidades e manter o código mais organizado.

```
src/
 └── main/
      └── java/
           ├── poo/
           │    ├── Personagem.java
           │    ├── Inimigo.java
           |    ├── Heroi.java
           |    ├── Esqueleto.java
           |    ├── Goblin.java
           |    ├── Chefe.java
           │    └── Utils.java
           │
           └── mycompany/
                └── jogoPoo.java
```

* **poo/** → Contém as classes relacionadas à lógica do jogo e conceitos de Programação Orientada a Objetos.
* **mycompany/** → Contém a classe principal responsável por iniciar a aplicação.


Cada classe possui uma responsabilidade específica dentro da lógica do jogo.

## Tecnologias Utilizadas

* Java
* Programação Orientada a Objetos (POO)
* Execução via terminal (CLI)

## Como Executar o Projeto

1. Clone o repositório:

```
git clone https://github.com/pietros133/JavaRPG-CLI.git
```

2. Entre na pasta do projeto:

```
cd JavaRPG-CLI
```

3. Compile o projeto:

```
javac Main.java
```

4. Execute o jogo:

```
java Main
```

## Melhorias Futuras

Algumas melhorias planejadas para o projeto:
* Diferentes tipos de inimigos
* Sistema de Armaduras

## Autor

**Pietro Miranda**

