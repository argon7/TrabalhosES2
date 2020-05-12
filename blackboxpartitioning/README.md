# Testes Blackbox: Particionamento de Equivalência

Os testes blackbox permitem fazer fazer a cobertura da aplicação sem ter em consideração a sua implementação. Esta abordagem é orientada aos dados, na medida em que o seu sucesso depende da seleção correta dos valores de input passados às interfaces da aplicação.

O particionamento de equivalência é uma das técnicas black-box mais populares. Esta técnica separa a gama de valores de um parâmetro de entrada de acordo com a forma como esse parâmetro é processado pelo módulo. Por exemplo, o método que faz o registo de um utilizador apenas se for maior de 18 anos, pode ter um comportamento diferente para cada uma das seguintes partições de dados:

<br><br>
<p align="center">
  <img src="https://argon7.github.io/TrabalhosES2/blackboxpartitioning/resources/partitioning.png">
</p>
<br>

O particionamento de equivalência não define os valores a selecionar dentro das partições. A análise dos valores limite é uma abordagem para a seleção de valores dentro de cada partição. Nesta abordagem, são selecionados os valores pertencentes aos limites dos intervalos inferiores e superiores das partições de equivalência de cada parâmetro ou valor de retorno de cada método.

## Exercício

### Particionamento de Equivalência

- Crie a classe Die a partir da especificação JavaDocs;

- Crie os testes para a classe Die, tendo em conta os princípios e heurísticas do particionamento de equivalência. É importante considerar aqui que o comportamento de um método pode depender não só dos valores dos parâmetros de entrada, como também de dados obtidos através de outras fontes (ex: gerador de números aleatórios). Nesses cenários, quando não for possível prever ou controlar os dados obtidos a partir dessas fontes, torna-se necessário validar probabilisticamente o método que está a ser testado, repetindo a sua invocação várias vezes;

- Importe o código da classe ArrayUtils;

- Crie os testes para os métodos findMin(..) e goodResize(..);

- Verifique se os testes criados para o método goodResize(..) passam quando aplicados ao método badResize(..).


### Particionamento de Equivalência + Análise dos Valores Limite

- Altere o método findAndPrintPairs(..), de forma a que o parâmetro target aceite apenas valores positivos > 0;

- Crie os testes para os métodos findAndPrintPairs(..) e showList(..), considerando como critério de seleção de valores os resultados da análise dos valores limite.  Para analisar os valores escritos é necessário redirecionar o output da consola antes de realizar os testes e repôr a configuração inicial depois de executar os testes, utilizando  como referência o exemplo seguinte.

```
private final static ByteArrayOutputStream outContent = new ByteArrayOutputStream();

@BeforeAll
public void setUpStreams() { System.setOut(new PrintStream(outContent)); }

@Test
void testFoo(){
    assertTrue(outContent.toString().equals("Success!!!"));
//or
    assertTrue(outContent.toString().contains("Success!!!"));
// in case reset is needed
    outContent.reset();
}
@AfterAll
public void restoreStreams() { System.setOut(System.out); }
```

- Crie os testes para os métodos bubblesort(..) e isAscending(..). Um destes métodos pode ter erros!

## Links

* [Documentação](https://argon7.github.io/TrabalhosES2/blackboxpartitioning/javadoc/index.html)
* [PDF do exercício](https://argon7.github.io/TrabalhosES2/blackboxpartitioning/resources/Exblackboxpartitioning.pdf)
* https://en.wikipedia.org/wiki/Black-box_testing
* https://www.guru99.com/equivalence-partitioning-boundary-value-analysis.html
* https://pt.wikipedia.org/wiki/An%C3%A1lise_do_valor_limite