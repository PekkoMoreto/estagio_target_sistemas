# Desafio Target Sistemas

1) Observe o trecho de código abaixo:

```

int INDICE = 13, SOMA = 0, K = 0;

enquanto K < INDICE faça

{

K = K + 1;

SOMA = SOMA + K;

}

imprimir(SOMA);


```
Ao final do processamento, qual será o valor da variável SOMA?

[Resposta da questão 1](https://github.com/ThiagoTrajanoDev/teste-target-sistemas/blob/master/out/production/Teste%20Target%20Sistemas/SomaSimples/SomaSimples.java) =  91 


2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.
[Resposta da Questão 2](https://github.com/ThiagoTrajanoDev/teste-target-sistemas/blob/master/out/production/Teste%20Target%20Sistemas/Fibonacci/Fibonacci.java)

3) Descubra a lógica e complete o próximo elemento:


a) 1, 3, 5, 7, <strong><code>9</code></strong>
Cada número é igual ao anterior + 2, formando os números ímpares. Assim, o próximo número é igual a 7 + 2 = 9.

b) 2, 4, 8, 16, 32, 64,  <strong><code>128</code></strong>
Cada número é igual ao anterior multiplicado por 2. Assim, o próximo número é igual a 64 x 2 = 128. 

c) 0, 1, 4, 9, 16, 25, 36, <strong><code>49</code></strong>
Cada número é igual ao anterior acrescido de um número ímpar que segue a sequência 1, 3, 5, 7, 9. Realizando a subtração dos dois últimos números, temos que 36 - 25 = 11. Assim, devemos acrescentar 11 + 2 = 13 ao último número, obtendo 36 + 13 = 49.

d) 4, 16, 36, 64, <strong><code>100</code></strong>
Cada número é igual ao quadrado dos números pares. Com isso, temos que 64 = 8². Então, o próximo número par é 10, e o seu quadrado é 10² = 100.

e) 1, 1, 2, 3, 5, 8,<strong><code>13</code></strong>
Cada número é igual à soma do número atual com o número anterior. Assim, o próximo número é igual a 8 + 5 = 13.

f) 2,10, 12, 16, 17, 18, 19, <strong><code>200</code></strong>
Sequência formada através de todos os números que iniciam com a letra d. Assim, o próximo número em ordem crescente que inicia com a letra d é 200.


4) Você está em uma sala com três interruptores, cada um conectado a uma lâmpada em uma sala diferente. Você não pode ver as lâmpadas da sala em que está, mas pode ligar e desligar os interruptores quantas vezes quiser. Seu objetivo é descobrir qual interruptor controla qual lâmpada.

Como você faria para descobrir, usando apenas duas idas até uma das salas das lâmpadas, qual interruptor controla cada lâmpada?

```
Entendendo que há 3 salas cada um com uma lâmapda:
Na primeira ida:

- Ligo o interruptor 1 por 5 minutos e o desligo, ligo o interruptor 2 e na mesma hora vou até uma das 3 salas
- Se a lâmpada estiver acessa, pertence ao interruptor 2, se estiver desligada e quente pertence ao interruptor 1, se estiver desligada e fria pertence ao interruptor 3.

Na segunda ida:
- Já sabendo a qual pertence um interruptor, apenas deixo um ligado e outro desligado entre o restantes
- Vou até outra sala e descubro os outros dois.
```

5) Escreva um programa que inverta os caracteres de um string.


IMPORTANTE:

a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;

b) Evite usar funções prontas, como, por exemplo, reverse;

[Resposta questão 5](https://github.com/ThiagoTrajanoDev/teste-target-sistemas/blob/master/out/production/Teste%20Target%20Sistemas/InverteString/InverteString.java)

