algoritmo "semnome"
// Função :
// Autor :
// Data : 27/02/2019
// Seção de Declarações
var
   total,nulo,branco,candidatoA,candidatoB,candidatoC: real

inicio
   escreva("Digite a quantidade de votos do 1° candidato: ")
   leia(candidatoA)
   escreva("Digite a quantidade de votos do 2° candidato: ")
   leia(candidatoB)
   escreva("Digite a quantidade de votos do 3° candidato: ")
   leia(candidatoC)
   escreva("votos nulos:")
   leia(nulo)
   escreva("votos brancos: ")
   leia(branco)

   total <- candidatoA + candidatoB + candidatoC + nulo + branco

   se ((candidatoA >= candidatoB) ou (candidatoA >= candidatoC)) entao
      escreval("------------------")
      escreval("terá segundo turno")
      escreval("------------------")
   senao
      se candidatoB >= candidatoC ou candidatoB >= candidatoC entao
         escreval("------------------")
         escreval("terá segundo turno")
         escreval("------------------")
      senao
         se candidatoC >= candidatoA ou candidatoC >= candidatoB entao
            escreval("------------------")
            escreval("terá segundo turno")
            escreval("------------------")
         senao

            se ((candidatoA > candidatoB) e (candidatoA > candidatoC))  entao
               candidatoA <- candidatoA + branco
            senao
               se ((candidatoB > candidatoA) e (candidatoB> candidatoC)) entao
                  candidatoB <- candidatoB + branco
               senao
                  candidatoC <- candidatoC + branco
               fimse
            fimse
         fimse
      fimse
   fimse

   escreval("o 1° candidato  recebeu ",((candidatoA * 100)/total):2:1,"% de votos")
   escreval("o 2° candidato  recebeu ",((candidatoB * 100)/total):2:1,"% de votos")
   escreval("o 3° candidato  recebeu ",((candidatoC * 100)/total):2:1,"% de votos")
   escreval("A quantidade de nulos fora ",((nulo * 100)/total):2:1,"% de votos")
   escreval("A quantidade de brancos fora ",((branco * 100)/total):2:2,"% de votos")










fimalgoritmo
