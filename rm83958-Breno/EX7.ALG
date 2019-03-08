Algoritmo "semnome"
// Disciplina  :  [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 08/03/2019
Var
   // Seção de Declarações das variáveis
   m:inteiro

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   escreval("Digite um valor entre 1 e 12")
   leia(m)

   se (m=1) entao
      escreval("mês =",m," - Janeiro")
   senao
      se(m=2) entao
         escreval("mês =",m," - Fevereiro")
      senao
         se(m=3) entao
            escreval("mês =",m," - Março")
         senao
            se(m=4) entao
               escreval("mês =",m," - Abril")
            senao
               se(m=5) entao
                  escreval("mês =",m," - Maio")
               senao
                  se(m=6) entao
                     escreval("mês =",m," - Junho")
                  senao
                     se(m=7) entao
                        escreval("mês =",m," - Julho")
                     senao
                        se(m=8) entao
                           escreval("mês =",m," - Agosto")
                        senao
                           se(m=9) entao
                              escreval("mês =",m," - Setembro")
                           senao
                              se(m=10) entao
                                 escreval("mês =",m," - Outubro")
                              senao
                                 se(m=11) entao
                                    escreval("mês =",m," - Novembro")
                                 senao
                                    se (m=12)entao
                                       escreval("mês =",m," - Dezembro")
                                    senao
                                       escreval("mês inválido")
                                    fimse
                                 fimse
                              fimse
                           fimse
                        fimse
                     fimse
                  fimse
               fimse
            fimse
         fimse
      fimse
   fimse

Fimalgoritmo