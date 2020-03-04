# Memento Pattern

O padrão Memento é um padrão comportamental utilizado quando o estado do objeto necessita de ser guardado fora do mesmo, de forma a restaurar esse estado posteriormente. Este padrão é utilizado em situações em que é necessário fazer rollback/undo do estado do objeto ou proteger esse estado de uma forma independente do objeto que o gerou.

<p align="center">
  <img src="https://argon7.github.io/TrabalhosES2/MementoPattern/resources/Memento.png">
</p>
<br>
No diagrama anterior

- o Originator é o objeto que cria e interpreta os estados armazenados em objetos Memento

- o Caretaker solicita a criação de objetos Memento e armazena os objetos até serem necessários novamente, mas não tem acesso ao estado do mesmo.

## Exercício

Aplique o padrão Memento a um serviço de backups que permite guardar snapshots do estado de um servidor responsável por registar o nome de estudantes. Utilize o código seguinte para testar a implementação. 

```
Server s = new Server();
BackupService backup = new BackupService(s);
backup.takeSnapshot();
s.addStudent("Maria José");
backup.takeSnapshot();
s.addStudent("Manuel António");
System.out.println(s.getStudentNames().size());

backup.restoreSnapshot(1);
System.out.println(s.getStudentNames().size());
```
## Links

* [Documentação](https://argon7.github.io/TrabalhosES2/MementoPattern/javadoc/index.html)
* [PDF do exercício](https://argon7.github.io/TrabalhosES2/MementoPattern/resources/ExMementoPattern.pdf)
* https://sourcemaking.com/design_patterns/memento
* https://sourcemaking.com/design_patterns/behavioral_patterns