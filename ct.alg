algoritmo "semnome"
// Função :
// Autor :
// Data : 22/03/2019
// Seção de Declarações
var
validacao: logico
salario: real
fodase : caractere
op: inteiro
inicio
// Seção de Comandos


escreval(" Bem vindo ")
escreva(" Digite o valor do Salário: ")
leia(salario)
se (salario < 988) entao
   escreval("Salário inferior ao salário mínimo de R$:988")
   escreval("Digite um valor igual ou superior.")
senao
   escreval("#/#/#/#/#/#/#/#/#/#/#/#/#/#/#/#/#/#")
   escreval("#/                               /#")
   escreval("#/   Salário atual R$:",salario,"      /#")
   escreval("#/                               /#")
   escreval("#/#/#/#/#/#/#/#/#/#/#/#/#/#/#/#/#/#")
   escreval("#/                               /#")
   escreval("#/ 1 - Calcular o Novo Salário   /#")
   escreval("#/ 2 - Calcular o Imposto        /#")
   escreval("#/ 3 - Classificação             /#")
   escreval("#/ 4 - Sair                      /#")
   escreval("#/                               /#")
   escreval("#/#/#/#/#/#/#/#/#/#/#/#/#/#/#/#/#/#")
   escreval("")
   escreval("")
   escreval("")
   escreval("#- Escolha a opção desejada [1/2/3/4]")
   leia(op)

   se ((op > 4) ou (op < 1)) entao
      escreval(" Opção Inváilida")
   senao
      escolha op
      caso 1
         se (salario <1008) entao
            salario <- salario + 240
         senao
            se ((salario >= 1008) e (salario <= 2000)) entao
               salario <- salario + 430
            senao
               se ((salario > 2000) e (salario <= 7000)) entao
                  salario <- salario +500
               senao
                  salario <- salario + 630
               fimse
            fimse
         fimse


         escreval("Seu salário recebeu um aumentoe de R$:240.00")
         escreval("Salário atual R$:",salario)
      caso 2
         se ((salario >190398/100) e (salario <=282665/100)) entao
            salario <- salario - (salario * 75/1000)

         senao
            se ((salario > 283666/100) e (salario < 375105/100)) entao
               salario <- salario - (salario * 15/100)

            senao
               se ((salario > 375106/100) e (salario <466468/100)) entao
                  salario <- salario (salario * 225/1000)
               senao
                  salario <- salario (salario * 275/1000)
               fimse
            fimse
         fimse
         escreval("Seu salário com imposto fica R$:",salario)
      caso 3
         se (salario <= 4000) entao
            escreval("Analista de Programação Júnior")
         senao
            se ((salario > 4000) ou (salario < 750099/100)) entao
               escreval("Analista de Programação Pleno")
               senao
               se ((salario >= 7501) ou (salario < 10000)) entao
                  escreval("Analista de Programação Sênior")
               senao
                  escreval("Gerente")
               fimse
            fimse
         fimse
      caso 4
         escreval ("é nois")




      fimescolha
   fimse
fimse







fimalgoritmo
