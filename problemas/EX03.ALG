Algoritmo "semnome"
// Disciplina  :  [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 27/02/2019
Var
   // Seção de Declarações das variáveis
   numero , i :inteiro
   x: vetor [1..4] de inteiro

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   para i de 1 ate 4  faca
      escreval("Digite o valor do ",i,"º número:")
      leia(numero)
      x[i] <- numero

   fimpara

escreva("A multiplicação do primeiro número")
escreval(" com o terceiro é igual a ",x[1]* x[3] )
escreva("A soma do segundo número com o quarto é igual a",x[2] + x[4])

Fimalgoritmo