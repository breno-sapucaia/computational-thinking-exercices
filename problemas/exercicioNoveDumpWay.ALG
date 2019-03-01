Algoritmo "semnome"
// Disciplina  :  [Linguagem e Lógica de Programação] 
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 01/03/2019
//O usuário informa o valor do seu salário
//e suas despesas mensais. O programa calcula o valor que sobra e diz
//quanto tempo (em anos) será necessário poupar para se tornar
//milionário.
Var
// Seção de Declarações das variáveis 
anos :inteiro
mes :inteiro
ganho        :real
despesas:real
y,x: real


Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
 escreval("Digite seu ganho mensal")
 leia(ganho)
 escreval("Digite sua despesa mensal")
 leia(despesas)
 x <-1000000/(ganho - despesas)
 escreval ("demorará ", (x):1," meses para você se tornar milhionário")
 y<- x/12
 escreval ("e demorará ", y:2:2 , " anos para você se tornar milhionário")
 

Fimalgoritmo