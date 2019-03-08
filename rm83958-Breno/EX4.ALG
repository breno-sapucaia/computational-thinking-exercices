Algoritmo "semnome"
// Disciplina  :  [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 08/03/2019
Var
   // Seção de Declarações das variáveis
   n1,n2,n3,n4:real


Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   escreva("Digite o 1º valor: ")
   leia(n1)
   escreva("Digite o 2º valor: ")
   leia(n2)
   escreva("Digite o 3º valor: ")
   leia(n3)
   escreva("Digite o 4º valor: ")
   leia(n4)



   se (n1 < n2)e(n1<n3) e(n1<n4) entao
      escreval(n1," é o menor dos valores digitados")
   senao
      se(n2<n1) e (n2<n3) e(n2<n4) entao
         escreval(n2," é o menor dos valores digitados")
      senao
         se(n3 <n1) e (n3<n2) e (n3<n4) entao
            escreval(n3," é o menor dos valores digitados")
         senao
            escreval(n4," é o menor dos valores digitados")
         fimse
      fimse
   fimse



Fimalgoritmo