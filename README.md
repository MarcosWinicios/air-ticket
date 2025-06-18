# Air ticket

Projeto capaz de aplicar descontos em passagens aéreas baseado em tipos de passageiros(GOLD e SILVER).

Trata-se de um pequeno projeto de estudo, onde foram aplicados os conceitos de 
- TDD com o uso de testes unitários
- Desing pattern **Strategy**.

## Tecnologias
- Java 21
- JUnit 4
- Maven

## Regra de negócio

### Desconto para passageiro GOLD
- Se o preço total da passage for maior quie R$ 500,00, o desconto de 15% deverá ser aplicado. Caso contrário, o desconto será de 10%.
### Desconto para passageiro SILVER
- Se o preço total da passagem for maior que R$ 700,00, o desconto de 10% deverá ser aplicado. Caso contrário, o desconto será de 6%.