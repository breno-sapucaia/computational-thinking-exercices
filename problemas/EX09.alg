algoritmo "semnome"
// Função :
// Autor :
// Data : 27/02/2019
// Seção de Declarações
var
   i,ganho,despesas:real
   mes,ano : inteiro
inicio
   escreval("Digite o valor do seu salário mesal:")
   leia(ganho)
   escreval("Digite o valor das suas despesas mensais:")
   leia(despesas)

   enquanto i < 1000000 faca
      i <- i +(ganho - despesas)
      mes <- mes + 1
      ano <- ano + 1
   fimenquanto

   se  mes < 12 entao
      escreval("Demorará menos de 1 ano para você virar milhionário")
   senao
      escreval("demorará ",ano," para você virar milhionário")
   fimse




fimalgoritmo
