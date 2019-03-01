algoritmo "semnome"
// Função :
// Autor :
// Data : 27/02/2019
// Seção de Declarações 
var
i,ganho,despesas:real
ano : inteiro
inicio
escreval("Digite o valor do seu salário mesal:")
leia(ganho)
escreval("Digite o valor das suas despesas:")
leia(despesas)


enquanto i <= 1000000 faca
i <- i + ((12*ganho)-(despesas*12))
ano <- ano + 1
fimenquanto
escreval("vai demorar ",ano," anos para você se tornar um milhionário")

fimalgoritmo
