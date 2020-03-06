# Decorator Pattern
O padrão Decorator é um padrão estrutural que permite adicionar novas responsabilidades (comportamento/estado) aos objetos em runtime. Desta forma, a construção das características de um objeto solicitada pelo cliente dinamicamente.

Este padrão fornece uma alternativa à herança para estender a funcionalidade de uma classe. Para exemplificar o conceito, considere o diagrama seguinte.


<br><br>
<p align="center">
  <img src="https://argon7.github.io/TrabalhosES2/DecoratorPattern/resources/Decorator.png">
</p>
<br>

No diagrama anterior, a classe Window representa o objeto principal do padrão, enquanto que a classe Decorator e derivadas representam a lógica adicional que pode ser adicionada ao objeto principal dinamicamente. Para exemplificar, o código seguinte adiciona os elementos necessários para criar uma estrutura composta pelo objeto principal Window e outros objetos utilizados para fazer a decoração de uma janela (scrollbar vertical, scrollbar horizontal e contorno).

```
Widget aWidget = new Border(new HorizontalSB(new VerticalSB( new Window( 80, 24 ))));
aWidget.draw();
```


## Exercício

Aplique o padrão Decorator a um componente responsável por fazer a autenticação de um serviço. Este componente deverá permitir decorar a funcionalidade principal com funcionalidades de:

- logging

- verificação de palavras inseguras na password, recorrendo a uma API REST que permite verificar se a palavra utilizada durante o processo de autenticação é insegura (faz parte do dicionário).

## Links

* [Documentação](https://argon7.github.io/TrabalhosES2/DecoratorPattern/javadoc/index.html)
* [PDF do exercício](https://argon7.github.io/TrabalhosES2/DecoratorPattern/resources/ExDecoratorPattern.pdf)
* https://sourcemaking.com/design_patterns/decorator
* https://sourcemaking.com/design_patterns/structural_patterns