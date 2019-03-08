Algoritmo "semnome"
// Disciplina  :  [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 08/03/2019
Var
   // Seção de Declarações das variáveis
   x,y,z:inteiro
Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   escreva("Digite o 1º valor:")
   leia(x)
   escreva("Digite o 2º valor:")
   leia(y)
   escreva("Digite o 3º valor:")
   leia(z)
   limpatela
   escreva("na ordem crescente temos:")
   se(x<z) e (x<y)entao
      se(y<z)entao
         escreval(x,y,z)
      senao
         escreval(x,z,y)
      fimse
   senao
      se(z<x) e(z<y) entao
         se(x<y)entao
            escreval(z,x,y)
         senao
            escreval(z,y,x)
         fimse
      senao
         se(y<x) e (y<z)entao
            se(x<z) entao
               escreval(y,x,z)
            senao
               escreval(y,z,x)
            fimse
         fimse
      fimse
   fimse

Fimalgoritmo