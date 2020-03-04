# Factory Pattern

A arquitetura de muitos frameworks abriga à definição de uma interface comum para a criação de objetos, sem comprometer as especificidades de cada objeto.

O padrão Factory Method permite definir uma interface para a criação desses objetos. Neste padrão, a superclasse do objeto a criar implementa o comportamento genérico, enquanto que as subclasses instanciadas pelos clientes implementam os detalhes da criação.

<p align="center">
  <img src="https://argon7.github.io/TrabalhosES2/FactoryPattern/resources/product.png">
</p>
<br>

O desenho dos argumentos do método da fábrica utilizada para criar o objeto permite a identificação da classe derivada a instanciar. Para evitar várias formas de instanciação, os construtores não podem ser públicos e o método da fábrica deve ser static.

Este padrão pode ser complementado com uma object pool para reutilizar objetos. Desta forma objetos com o mesmo estado podem ser reutilizados.

## Exercício

Aplique o padrão Factory Method à criação dos objetos Computer e Software.

## Links

* [Documentação](https://argon7.github.io/TrabalhosES2/FactoryPattern/javadoc/index.html)
* [PDF do exercício](https://argon7.github.io/TrabalhosES2/FactoryPattern/resources/ExFactoryPattern.pdf)
* https://sourcemaking.com/design_patterns/factory_method
* https://sourcemaking.com/design_patterns/object_pool