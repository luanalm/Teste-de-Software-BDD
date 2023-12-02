#Author: luana.landmartini@gmail.com

@tag
Feature: Cliente faz saque de dinheiro como um cliente,
eu gostaria de sacar dinheiro em caixa eletrônica,
para que eu não tenha que esperar em uma fila do banco.

  @tag1
  Scenario: Cliente especial com saldo negativo
    Given Um cliente especial com saldo atual de -200 reais
    When foi solicitado um saque de 100 reais
    Then deve efetuar o saque e atualizar o saldo da conta para -300 reais
    And check more outcomes
    
  @tag2
  Scenario: Cliente comum com saldo negativo
    Given Um cliente comum com saldo atual de -200 reais
    When solicitar um saque de 200 reais
    Then não deve efetuar o saque e deve retornar a mensagem Saldo Insuficiente
