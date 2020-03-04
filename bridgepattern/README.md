# Composite Pattern

O padrão Composite é um padrão estrutural que permite executar operações num objeto sem lidar diretamente com a hierarquia de objetos. Este padrão utiliza composição recursiva numa estrutura em árvore de objetos relacionados hierarquicamente. Esta estrutura permite processar objetivos primitivos e compósitos. Enquanto os objetos primitivos são indivisíveis, os objetos compósitos podem ser decompostos em outros compósitos ou objetivos primitivos.

Uma escola é um exemplo de um compósito que pode ser dividido em outros compósitos (e.g., departamentos). Um departamento pode ser outro compósito de cursos. O curso pode ser outro compósito de alunos, enquanto que um aluno é um elemento primitivo (indecomponível).

Na estrutura do Composite, o Component é definido numa classe abstrata para representar objetos primitivos e objetos compósitos. As restantes classes são subclasses do objeto Component. A interface da classe abstrata representa o denominador comum de ambas classes derivadas.

<br><br>
<p align="center">
  <img src="https://argon7.github.io/TrabalhosES2/CompositePattern/resources/Composite.png">
</p>
<br>

## Exercício

Aplique o padrão Composite à descrição de opções de um menu HTML. O menu pode ter opções e subopções, no entanto, apenas as opções finais têm links para páginas.

## Links

* [Documentação](https://argon7.github.io/TrabalhosES2/CompositePattern/javadoc/index.html)
* [PDF do exercício](https://argon7.github.io/TrabalhosES2/CompositePattern/resources/ExCompositePattern.pdf)
* https://sourcemaking.com/design_patterns/composite
* https://sourcemaking.com/design_patterns/structural_patterns