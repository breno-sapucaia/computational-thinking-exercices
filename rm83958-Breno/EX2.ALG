Algoritmo "semnome"
// Disciplina  :  [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 08/03/2019
Var
   // Seção de Declarações das variáveis
   n1,n2:real
   x,op:inteiro


Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   Escreval("           ++++++++++++++++++++++")
   Escreval("           +     CAlCULADORA    +")
   escreval("           ++++++++++++++++++++++")
   escreval("           +   Digite a opção   +")
   escreval("           +      desejada      +")
   escreval("           ++++++++++++++++++++++")
   escreval("           + 1 - Adição         +")
   escreval("           + 2 - Subtração      +")
   escreval("           + 3 - Multiplicação  +")
   escreval("           + 4 - Divisão        +")
   escreval("           ++++++++++++++++++++++")
   leia(op)
   limpatela
   se ((op <1) ou (op>=5)) entao
      escreval("opção inválida")
   senao
      x<-x+1
   fimse

   se(x=1) entao
      escreval("Digite os valores:")
      leia(n1)
      leia(n2)
      limpatela
   fimse

   se(op = 1) entao
      escreval(n1," + ",n2," = ",n1+n2)
   senao
      se(op = 2) entao
         escreval(n1," - ",n2," = ",n1-n2)
      senao
         se(op = 3) entao
            escreval(n1," x ",n2," = ",n1*n2)
         senao
            escreval(n1," / ",n2," = ",n1/n2)
         fimse
      fimse
   fimse



Fimalgoritmo