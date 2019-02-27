algoritmo "semnome"
// Função :
// Autor :
// Data : 27/02/2019
// Seção de Declarações
var
total,nulo,branco,candidatoA,candidatoB,candidatoC: real

inicio
escreval("Digite a quantidade de votos do 1° candidato: ")
leia(candidatoA)
escreval("Digite a quantidade de votos do 2° candidato: ")
leia(candidatoB)
escreval("Digite a quantidade de votos do 3° candidato: ")
leia(candidatoC)
escreval("Quanto votos nulos?")
leia(nulo)
escreval("Quantos votos brancos?")
leia(branco)

total <- candidatoA + candidatoB + candidatoC + nulo + branco

se ((candidatoA > candidatoB) e (candidatoA > candidatoC))  entao
   candidatoA <- candidatoA + branco
senao
   se ((candidatoB > candidatoA) e (candidatoB> candidatoC)) entao
      candidatoB <- candidatoB + branco
   senao
        candidatoC <- candidatoC + branco
   fimse
fimse

escreval("o 1° candidato  recebeu ",((candidatoA * 100)/total):2:1,"% de votos")
escreval("o 2° candidato  recebeu ",((candidatoB * 100)/total):2:1,"% de votos")
escreval("o 3° candidato  recebeu ",((candidatoC * 100)/total):2:1,"% de votos")
escreval("A quantidade de nulos fora ",((nulo * 100)/total):2:1,"% de votos")
escreval("A quantidade de brancos fora ",((branco * 100)/total):2:2,"% de votos")










   fimalgoritmo
