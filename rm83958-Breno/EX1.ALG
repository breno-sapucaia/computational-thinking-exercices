Algoritmo "semnome"
// Disciplina  :  [Linguagem e Lógica de Programação] 
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 08/03/2019
Var
// Seção de Declarações das variáveis 
nome:caractere
idade:inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
   escreval("Digite seu nome:")
   leia(nome)
   escreval(nome+", digite sua idade:")
   leia(idade)
   
   se (idade >= 18) entao
      escreval(nome," sua idade  é igual a ",idade,".")
   senao
        escreval("Você é menorde idade.")
   fimse

Fimalgoritmo