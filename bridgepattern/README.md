# Bridge Pattern

O padrão Bridge é um padrão estrutural que é utilizado em situações onde queremos separar a abstração da implementação do código.

Neste padrão existe uma dependência do cliente relativamente à interface que permite o acesso a implementações de objetos criados dinamicamente durante a execução da aplicação. Desta forma é possível criar novas implementações sem alterar a estrutura de dependências.

O cliente interage sempre com o objeto que representa a interface com as implementações, que por sua vez delega os pedidos para o objeto pertencente à classe que contém a implementação. Desta forma, a implementação pode ser acrescentada em runtime, sem recompilar a aplicação. A imagem seguinte mostra a estrutura abstrata do padrão.

<p align="center">
  <img src="https://argon7.github.io/TrabalhosES2/BridgePattern/resources/Bridge.png">
</p>
<br>

## Exercício

Aplique o padrão Bridge a um componente que permita o acesso a vários serviços instanciados dinamicamente para armazenar e obter conteúdos.

A classe que serve de interface deve fornecer:

- os métodos gerais presentes na especificação;

- uma especialização do método getContent que permita obter todo o conteúdo agregado de um serviço.

Como o conteúdo está armazenado num hashmap, a classe LinkedHashMap tem de ser utilizada em vez da classe HashMap tradicional, para garantir que os dados sejam acedidos iterativamente pela ordem de inserção.
## Links

* [Documentação](https://argon7.github.io/TrabalhosES2/BridgePattern/javadoc/index.html)
* [PDF do exercício](https://argon7.github.io/TrabalhosES2/BridgePattern/resources/ExBridgePattern.pdf)
* https://sourcemaking.com/design_patterns/bridge
* https://sourcemaking.com/design_patterns/structural_patterns