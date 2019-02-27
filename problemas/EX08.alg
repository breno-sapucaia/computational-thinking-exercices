algoritmo "semnome"
// Função :
// Autor :
// Data : 27/02/2019
// Seção de Declarações 
var
x,valorBoleto:real
dias,juros:inteiro

inicio
escreval("Digite o valor do boleto:")
leia(valorBoleto)
escreval("Digite o valor do juros [exemplo 5% = 5] :")
leia(juros)
escreval("Faz quantos dias que atraso?")
leia(dias)
x <- valorBoleto +(valorBoleto*(juros/100))*dias
escreval ("o valor final é", x)

fimalgoritmo
