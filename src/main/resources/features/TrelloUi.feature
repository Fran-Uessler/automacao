#language: pt
#encoding: UTF-8
@ui
Funcionalidade: Trello UI

  @ui
  Esquema do Cenario: Criando, comentando e deletando um card
    Dado que eu esteja logado no trello
    E acesse o board
    Quando crio um card com nome "<card name>"
    E comento "<comment>"
    Entao o card deve estar na lista
    Quando excluo o card
    Entao o card não existe mais

    Exemplos:
      |card name	| comment	|
      |Fran		    | teste 1	|
      |Fran 2 		| teste 2	|