# Questões Teórica

## Questão 01

O Java Collections Framework é um conjunto de interfaces e classes que permite armazenar e manipular grupos de objetos.
Seus principais benefícios são o tamanho dinâmico, métodos prontos para adicionar, remover e buscar elementos, além de oferecer diferentes estruturas de dados para organizar informações.

## Questão 02

- **List:** permite elementos repetidos e mantém a ordem de inserção. Exemplo: lista de compras.
- **Set:** não permite elementos duplicados. Exemplo: conjunto de e-mails cadastrados.
- **Map:** armazena informações em pares de chave e valor, sem permitir chaves repetidas. Exemplo: cadastro de usuários utilizando o e-mail como chave.

## Questão 03

### HashSet
- **Ordem:** não garante a ordem dos elementos.
- **Busca, inserção e remoção:** O(1) em média.
- **Memória:** geralmente utiliza menos memória que as outras implementações.

### LinkedHashSet
- **Ordem:** mantém a ordem de inserção.
- **Busca, inserção e remoção:** O(1) em média.
- **Memória:** utiliza mais memória que HashSet, pois mantém referências para preservar a ordem.

### TreeSet
- **Ordem:** mantém os elementos ordenados.
- **Busca, inserção e remoção:** O(log n).
- **Memória:** utiliza memória adicional para manter a estrutura de árvore.

O HashSet é indicado quando não precisamos de ordem, o LinkedHashSet quando queremos preservar a ordem de inserção e o TreeSet quando precisamos dos elementos ordenados.
