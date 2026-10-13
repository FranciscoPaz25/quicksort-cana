# Contexto de Estudo — Trabalho AV-2: QuickSort em Java

> Documento de contexto para retomar o estudo e manter consistência nas próximas conversas.
>
> **Objetivo:** registrar o enunciado do trabalho, as decisões já tomadas, o que já foi aprendido e o plano de estudo até a implementação e análise de complexidade.

---

## 1. Regra importante do trabalho

O enunciado informa que:

- o trabalho é **individual**;
- trabalhos que não compilarem não serão corrigidos;
- plágio/cópia, inclusive de texto ou código, pode resultar em nota zero;
- o enunciado também diz que **não é permitido utilizar modelos de Inteligência Artificial para obtenção de informações durante a elaboração do trabalho**.

Portanto, este documento deve ser tratado como **contexto de estudo e organização**. Nas próximas etapas, a prioridade será compreender os conceitos, praticar com exemplos e revisar código escrito pelo próprio aluno, evitando transformar a conversa em uma solução pronta para submissão.

---

# 2. O que o trabalho pede, em termos gerais

O trabalho pede a implementação, em **Java**, do algoritmo **QuickSort** sobre **arranjos/vetores de inteiros**, em diferentes versões, seguida de uma análise de complexidade de cada versão.

O foco da análise está em dois cenários:

1. **QuickSort com pivô aleatório**, analisando o caso médio em que as partições são consideradas igualmente prováveis.
2. **QuickSort proporcional**, em que o pivô força uma divisão em uma razão fixa `α : (1 − α)`.

A divisão de **90%–10%** não pode ser escolhida, pois já foi resolvida em sala.

Fonte: `TRABALHO DA AV-2.pdf`.

---

# 3. Parte I — Implementação exigida

As duas versões devem usar o **mesmo procedimento de particionamento**.

O aluno pode escolher entre:

- **Lomuto**
- **Hoare**

A escolha precisa ser **justificada na documentação**.

As versões exigidas são:

### 3.1 QuickSort com pivô aleatório

O programa deve implementar uma versão do QuickSort em que o pivô é escolhido aleatoriamente.

### 3.2 QuickSort proporcional

O programa deve receber `α` como parâmetro e escolher o pivô de forma a forçar uma divisão aproximada na proporção:

`α : (1 − α)`

Os valores de `α` usados devem ser escolhidos dentre os valores pedidos na Parte II.

---

# 4. Vetores que devem ser utilizados

O enunciado determina que as sequências sejam formadas por **permutações dos inteiros de `1` até `n`**, sem repetição.

Exemplo válido para `n = 7`:

```text
[6, 3, 8, 2, 5, 1, 7]
```

Exemplo inválido:

```text
[6, 3, 3, 2, 5, 1, 7]
```

pois há repetição do `3` e falta outro inteiro da faixa.

Além disso, o enunciado determina o uso de **sequências aleatórias para todas as versões**.

---

# 5. Problema de StackOverflowError

O enunciado alerta que algumas configurações do QuickSort podem produzir `StackOverflowError` por causa da profundidade da recursão.

O aluno precisa tratar esse problema e **documentar a decisão adotada**.

O próprio enunciado dá como exemplo uma estratégia em que se faz:

- recursão apenas na menor partição;
- iteração na maior partição.

Outra possibilidade citada é o ajuste do tamanho da pilha, mas essa decisão também precisaria ser documentada.

Esse assunto ainda não foi estudado em profundidade e ficará para uma etapa posterior.

---

# 6. Parte II — Análise de complexidade exigida

A documentação deve apresentar a análise de complexidade de tempo de **cada versão implementada**, explicando as passagens com palavras próprias. Não basta escrever apenas o resultado final.

## 6.1 Custo do particionamento

É preciso analisar o custo do procedimento de particionamento escolhido — Lomuto ou Hoare — sobre um subarranjo de `n` elementos e mostrar que:

`Θ(n)`

Esse custo será o termo `cn` usado nas recorrências seguintes.

---

## 6.2 QuickSort com pivô aleatório — caso médio

O trabalho pede que a análise parta da relação de recorrência vista em sala e mostre:

1. por que os dois somatórios podem ser reunidos em um só;
2. a manipulação algébrica que elimina o somatório;
3. o processo de telescopagem até `T(1)`;
4. a relação com a série harmônica;
5. a complexidade resultante para `T(n)`.

Também é necessário explicar:

- por que, usando pivô aleatório, o resultado do caso médio vale para qualquer tipo de sequência de entrada;
- se o pior caso ainda pode ocorrer.

Esse será um dos blocos matemáticos mais importantes do trabalho e ainda **não foi estudado detalhadamente**.

---

# 7. QuickSort proporcional

O enunciado determina pelo menos **2 valores de `α`**.

Os valores permitidos são:

| `α` | Partição correspondente |
|---|---|
| `1/2` | 50% / 50% |
| `1/3` | aproximadamente 33% / 67% |
| `1/4` | 25% / 75% |
| `1/5` | 20% / 80% |

O enunciado considera `0 < α ≤ 1/2`.

Para cada `α` escolhido, a documentação deve:

1. desenhar a árvore de recursão com **no mínimo 3 níveis**;
2. indicar o tamanho dos subproblemas e o custo de cada nível;
3. determinar a altura do ramo mais curto `hmin`;
4. determinar a altura do ramo mais longo `hmax`;
5. obter um limite inferior e um limite superior para `T(n)`;
6. escrever `hmax` como `k · log₂ n` e calcular `k`;
7. concluir a complexidade de `T(n)` para qualquer `α` constante;
8. discutir o que muda quando a partição não é proporcional, por exemplo, quando ocorre sempre uma divisão `0` e `n − 1`.

Essa parte também será estudada **depois da consolidação do QuickSort básico**.

---

# 8. Entregas exigidas

O trabalho deve conter:

### Código-fonte

- código Java;
- bem indentado;
- comentado.

### Documentação

A documentação deve incluir, entre outras coisas:

#### A. Introdução

- descrição do problema;
- visão geral do funcionamento do programa.

#### B. Implementação

- estruturas de dados utilizadas;
- diagramas ilustrativos, de preferência;
- funcionamento das principais funções/procedimentos;
- formato de entrada e saída;
- decisões tomadas para casos e detalhes não completamente especificados no enunciado.

#### C. Análise de Complexidade

- integralmente a Parte II do enunciado;
- análise de cada versão implementada;
- quadro-resumo;
- uso de notação `O` e `Θ`.

---

# 9. Forma de entrega

O enunciado informa que a entrega deve ser feita no AVA como **um único arquivo `.zip`**, contendo:

- código-fonte;
- arquivos diversos necessários;
- documentação.

Também deve haver apresentação da documentação física referente à análise do algoritmo na data de entrega, com explicação do trabalho ao professor.

O enunciado informa que, caso o trabalho não seja explicado, a nota pode ser zero.

---

# 10. Decisão já tomada: usar Lomuto

Foi escolhido o **Lomuto** em vez do Hoare.

### Motivo prático já identificado durante o estudo

O Lomuto foi considerado mais fácil de entender e acompanhar passo a passo.

A justificativa formal para a documentação será construída **mais adiante**, depois que o aluno estiver seguro do funcionamento do método. Neste momento, não há necessidade de escrever a justificativa final.

---

# 11. O que significa Lomuto

Lomuto é um **procedimento de particionamento** usado dentro do QuickSort.

Não é outro algoritmo de ordenação completamente diferente do QuickSort.

Neste estudo, estamos usando a forma clássica em que o **último elemento do subarranjo é escolhido como pivô**.

A ideia principal é fazer a partição ficar no formato:

```text
[ menores ou iguais ao pivô ] | pivô | [ maiores que o pivô ]
```

Depois dessa partição, o QuickSort pode continuar recursivamente nas partes da esquerda e da direita.

---

# 12. Papel dos índices `i` e `j` no Lomuto

Essa é a regra central já estudada.

### `j`

`j` é o índice que **percorre/explora o vetor**.

Ele anda para a frente, analisando os elementos.

### `i`

`i` marca a posição onde deve entrar o **próximo elemento menor ou igual ao pivô**.

Quando `j` encontra um elemento menor ou igual ao pivô:

1. o elemento de `j` é trocado com o elemento de `i`;
2. `i` avança.

Quando `j` encontra um elemento maior que o pivô:

- não ocorre troca;
- `i` permanece parado;
- `j` continua andando.

### Frase-memória usada no estudo

> **`j` procura; `i` indica onde colocar os elementos menores ou iguais ao pivô.**

---

# 13. Exemplo já resolvido durante o estudo

Vetor:

```text
[6, 3, 8, 2, 5, 1, 7]
```

Pivô = `7` (último elemento).

Durante a partição, os elementos menores ou iguais a `7` vão sendo trazidos para a região esquerda.

O resultado final da primeira partição foi:

```text
[6, 3, 2, 5, 1] | 7 | [8]
```

Ou seja:

- lado esquerdo: `6, 3, 2, 5, 1`;
- pivô: `7`;
- lado direito: `8`.

Importante: essa primeira partição **não ordena completamente o vetor**. Ela apenas coloca o pivô na posição correspondente à partição e separa elementos menores/iguais dos maiores.

Depois disso, o QuickSort continua trabalhando nas partes restantes.

---

# 14. Segundo passo do exemplo — percepção do pior caso

Foi analisada a parte esquerda:

```text
[6, 3, 2, 5, 1]
```

Pivô = `1`.

Todos os outros elementos são maiores que `1`.

A partição resultou em:

```text
[] | 1 | [3, 2, 5, 6]
```

Isso mostrou de forma intuitiva uma divisão **muito desequilibrada**.

Essa situação é importante porque divisões extremamente desequilibradas repetidas podem levar o QuickSort ao pior caso `O(n²)`.

Esse exemplo serviu para começar a relacionar o comportamento do algoritmo com análise de complexidade.

---

# 15. Lomuto × Hoare — entendimento atual

O trabalho permite escolher um entre os dois procedimentos.

## Lomuto

- mais simples para nosso estudo atual;
- usa `i` e `j`;
- na versão estudada, usa o último elemento como pivô;
- faz uma troca final para colocar o pivô na posição da partição.

## Hoare

- também é um procedimento de particionamento para QuickSort;
- utiliza dois índices/ponteiros que avançam a partir das extremidades;
- procura elementos que estão do lado errado do pivô e realiza trocas;
- o funcionamento é diferente do Lomuto.

Ainda **não há necessidade de dominar Hoare**, pois a decisão atual é seguir com Lomuto.

---

# 16. Comparação de complexidade já compreendida

A escolha entre Lomuto e Hoare não significa, por si só, escolher entre uma versão `O(n log n)` e outra `O(n²)`.

O ponto mais importante neste trabalho é:

- a **partição** custa `Θ(n)`;
- a maneira como o pivô divide o problema influencia fortemente a recursão;
- divisões equilibradas tendem a gerar profundidade logarítmica;
- divisões muito desequilibradas podem gerar comportamento quadrático.

A análise matemática completa ainda será construída passo a passo.

---

# 17. Estado atual do aprendizado

## Já compreendido

### QuickSort — ideia geral

O QuickSort:

1. escolhe um pivô;
2. particiona o vetor em torno desse pivô;
3. repete o processo nas partes menores e maiores;
4. termina quando os subvetores são pequenos o suficiente.

### Lomuto

O aluno já consegue acompanhar manualmente:

- escolha do pivô como último elemento;
- movimentação de `j`;
- comportamento de `i`;
- troca quando `j` encontra elemento `≤ pivô`;
- situação em que `i` permanece parado diante de elemento maior;
- troca final do pivô;
- separação esquerda | pivô | direita.

### Relação com pior caso

Já foi percebido intuitivamente que uma sequência de partições muito desequilibradas é ruim e pode levar a `O(n²)`.

---

# 18. Pontos que ainda precisam ser estudados

Ainda faltam, em ordem aproximada:

1. consolidar Lomuto com mais exemplos;
2. transformar o particionamento em lógica/pseudocódigo;
3. compreender a implementação em Java;
4. construir o QuickSort completo a partir do particionamento;
5. entender a chamada recursiva de QuickSort;
6. entender escolha de pivô aleatório;
7. gerar as permutações aleatórias `1..n` sem repetição;
8. entender e tratar `StackOverflowError`/profundidade de recursão;
9. entender o QuickSort proporcional e a escolha de `α`;
10. construir exemplos de árvores de recursão;
11. entender `Θ(n)` do particionamento;
12. estudar a recorrência do QuickSort com pivô aleatório;
13. entender os somatórios e a telescopagem;
14. entender a relação com a série harmônica;
15. concluir o caso médio do pivô aleatório;
16. estudar `hmin` e `hmax` no QuickSort proporcional;
17. calcular `hmax = k · log₂ n` para cada `α` escolhido;
18. obter limites inferior/superior;
19. concluir a complexidade para `α` constante;
20. discutir a divisão não proporcional `0` e `n−1`;
21. montar a documentação final nas próprias palavras;
22. testar, compilar e preparar a explicação oral do trabalho.

---

# 19. Estratégia pedagógica para as próximas conversas

A preferência é **não pular etapas**.

O usuário demonstrou que aprende melhor quando:

- um conceito é explicado por vez;
- há exemplos pequenos;
- o vetor é acompanhado visualmente;
- o significado de cada índice é explicado;
- o usuário tenta responder antes de receber a solução;
- matemática abstrata é introduzida apenas depois da intuição estar clara.

Portanto, a sequência ideal é:

```text
QuickSort básico
      ↓
Particionamento Lomuto
      ↓
Exercícios manuais
      ↓
Pseudocódigo
      ↓
Java
      ↓
Pivô aleatório
      ↓
QuickSort proporcional
      ↓
Complexidade da partição
      ↓
Recorrências
      ↓
Caso médio
      ↓
Árvore proporcional
      ↓
Limites e hmax
      ↓
Documentação
```

Evitar apresentar a matemática completa antes de o funcionamento do algoritmo estar sólido.

---

# 20. Como responder quando o estudo continuar

Ao retomar este contexto:

- assumir que o usuário já conhece a ideia básica de QuickSort;
- assumir que ele já estudou a versão Lomuto manualmente;
- continuar do ponto em que ele parou, sem voltar ao início desnecessariamente;
- manter explicações graduais;
- fazer o usuário raciocinar sobre exemplos sempre que possível;
- corrigir pequenos detalhes conceituais sem atropelar a linha de raciocínio;
- evitar entregar código completo de submissão sem necessidade, especialmente devido à regra explícita do enunciado sobre uso de IA;
- priorizar explicação, exercícios, pseudocódigo, revisão e compreensão.

---

# 21. Possível estrutura futura da documentação do trabalho

Quando chegar a hora de montar a documentação, uma estrutura coerente será:

```text
1. Introdução
2. Fundamentação / funcionamento do QuickSort
3. Escolha e justificativa do particionamento Lomuto
4. Estruturas de dados utilizadas
5. Funcionamento das principais funções
6. Geração dos vetores aleatórios
7. QuickSort com pivô aleatório
8. QuickSort proporcional
9. Tratamento do risco de StackOverflowError
10. Análise de complexidade do particionamento
11. Análise do QuickSort com pivô aleatório
12. Análise do QuickSort proporcional
13. Quadro-resumo de complexidades
14. Conclusão
```

Essa estrutura é um **planejamento**, não uma exigência literal de títulos do enunciado. Os títulos finais devem ser adaptados conforme o desenvolvimento do trabalho.

---

# 22. Progresso mais recente — ligação entre Lomuto e QuickSort

Nesta etapa, o estudo avançou da compreensão manual do Lomuto para a compreensão de como o procedimento de particionamento se conecta ao QuickSort recursivo.

## 22.1 Resumo que o aluno conseguiu explicar

### QuickSort

O entendimento atual é:

- escolhemos um pivô;
- particionamos o trecho em torno dele;
- colocamos os menores/iguais à esquerda e os maiores à direita;
- o pivô fica na posição definida pela partição;
- repetimos o processo recursivamente nas partes restantes;
- podemos ter vários pivôs ao longo das diferentes chamadas recursivas.

No trabalho, uma das versões exigidas será especificamente o **QuickSort com pivô aleatório**. A ideia geral do QuickSort, porém, não exige pivô aleatório.

### Lomuto

A versão estudada utiliza o último elemento do trecho como pivô:

```text
pivo = vetor[fim]
```

Os dois índices principais são:

- `j`: percorre o trecho da esquerda para a direita;
- `i`: marca a posição onde deve entrar o próximo elemento menor ou igual ao pivô.

Regra principal:

```text
se vetor[j] <= pivo
    troca vetor[j] com vetor[i]
    i avança
senão
    i permanece parado
j continua avançando
```

Ao terminar o percurso, ocorre a troca final entre `vetor[i]` e `vetor[fim]`, colocando o pivô entre os dois grupos.

Resultado conceitual:

```text
[ menores ou iguais ] | pivô | [ maiores ]
```

Importante: a partição **não ordena completamente** os grupos da esquerda e da direita. Ela apenas organiza os elementos em relação ao pivô. A ordenação completa acontece por meio das chamadas recursivas do QuickSort.

## 22.2 Exemplo consolidado

Exemplo trabalhado:

```text
[9, 4, 7, 2, 8, 3, 6]
```

Pivô inicial: `6`.

Após a partição Lomuto:

```text
[4, 2, 3] | 6 | [8, 7, 9]
```

Depois o QuickSort trabalha separadamente em:

```text
[4, 2, 3]
[8, 7, 9]
```

O resultado final da ordenação é:

```text
[2, 3, 4, 6, 7, 8, 9]
```

Esse exemplo estabeleceu claramente a diferença entre:

```text
QuickSort → controla a divisão e a recursão
Lomuto    → realiza a partição
```

## 22.3 Caso-base

O QuickSort para quando o trecho possui zero ou um elemento.

Conceitualmente:

```text
se fim <= inicio
    pare
```

Um único elemento já está ordenado, e um trecho vazio também não precisa ser processado.

## 22.4 Parâmetros do QuickSort

Foi entendido que o QuickSort pode trabalhar com:

```text
quicksort(vetor, inicio, fim)
```

Não é necessário passar o pivô como parâmetro, porque o procedimento Lomuto consegue obtê-lo a partir de `fim`:

```text
pivo = vetor[fim]
```

Também não é necessário passar `i` e `j` ao QuickSort. Esses índices são detalhes internos da partição Lomuto.

## 22.5 Relação entre o retorno de Lomuto e as chamadas recursivas

O procedimento Lomuto deve retornar a posição final do pivô. Essa posição é usada pelo QuickSort para separar os dois subproblemas.

Se o retorno for `i`, as chamadas conceituais serão:

```text
quicksort(vetor, inicio, i - 1)
quicksort(vetor, i + 1, fim)
```

O índice `i` não entra em nenhuma das duas chamadas porque o pivô já está em sua posição de partição.

## 22.6 Pseudocódigo consolidado do Lomuto

A lógica alcançada até o momento foi:

```text
lomuto(vetor, inicio, fim) {

    pivo = vetor[fim]
    i = inicio

    para j de inicio até fim - 1 {

        se vetor[j] <= pivo {
            trocar vetor[j] com vetor[i]
            i++
        }
    }

    trocar vetor[i] com vetor[fim]

    retornar i
}
```

## 22.7 Pseudocódigo conceitual do QuickSort

A estrutura montada pelo aluno foi consolidada como:

```text
quicksort(vetor, inicio, fim) {

    se fim <= inicio
        retornar

    i = lomuto(vetor, inicio, fim)

    quicksort(vetor, inicio, i - 1)
    quicksort(vetor, i + 1, fim)
}
```

Esse código ainda deve ser transformado e testado em Java. A prioridade é garantir que o aluno compreenda cada linha antes da implementação final.

## 22.8 Correções conceituais importantes

Durante os exercícios, foram reforçados estes pontos:

1. Quando `vetor[j] > pivo`, `i` **não avança**; ele permanece na posição atual enquanto `j` continua andando.
2. O elemento menor/igual encontrado por `j` é trocado com o elemento da posição `i`, e só então `i` avança.
3. O `j` nunca precisa voltar para trás durante a partição.
4. O `for` do Lomuto deve analisar os elementos de `inicio` até `fim - 1`, porque `vetor[fim]` é o pivô.
5. Quando o QuickSort chama recursivamente as duas partes, o pivô fica de fora: esquerda é `inicio .. i-1` e direita é `i+1 .. fim`.
6. A partição não deixa necessariamente os grupos internos ordenados.

## 22.9 Primeira tentativa de implementação e correções identificadas

Foi feita uma tentativa inicial de escrever Lomuto em estilo Java. Os principais problemas identificados foram:

- começar o percurso em `0` em vez de `inicio`;
- criar `j` mas percorrer o vetor com outra variável (`k`);
- usar um limite que não analisava corretamente todos os elementos anteriores ao pivô;
- esquecer inicialmente que o QuickSort deve guardar o retorno de Lomuto em uma variável.

A estrutura conceitualmente corrigida ficou equivalente a:

```text
pivo = vetor[fim]
i = inicio

para j = inicio enquanto j < fim:
    se vetor[j] <= pivo:
        troca(vetor[j], vetor[i])
        i++

troca(vetor[i], vetor[fim])
retorna i
```

No QuickSort:

```text
se trecho tem 0 ou 1 elemento:
    parar
senão:
    i = lomuto(vetor, inicio, fim)
    quicksort(vetor, inicio, i - 1)
    quicksort(vetor, i + 1, fim)
```

## 22.10 Próximo passo imediato

O próximo passo planejado é **transformar esse pseudocódigo em Java de verdade**, entendendo cuidadosamente:

- `int[] vetor`;
- `int inicio`;
- `int fim`;
- por que o método de ordenação pode ser `void`;
- como `lomuto()` retorna a posição do pivô;
- como testar o algoritmo com um vetor pequeno;
- como acompanhar `inicio`, `fim`, `i` e `j` durante a execução.

Depois dessa etapa, o estudo seguirá para **pivô aleatório**, que é uma exigência específica da Parte I do trabalho.

---

# 23. Checklist do enunciado

## Implementação

- [ ] Java
- [ ] QuickSort
- [ ] vetores de inteiros
- [ ] duas versões exigidas
- [ ] mesmo procedimento de particionamento nas versões
- [x] escolha do procedimento: **Lomuto**
- [ ] pivô aleatório
- [ ] QuickSort proporcional
- [ ] `α` passado como parâmetro
- [ ] pelo menos 2 valores de `α`
- [ ] vetores como permutações de `1..n`
- [ ] sem repetição
- [ ] sequências aleatórias
- [ ] tratamento de possível `StackOverflowError`
- [ ] decisão sobre isso documentada

## Análise

- [ ] provar `Θ(n)` do particionamento
- [ ] análise do pivô aleatório
- [ ] unir os somatórios
- [ ] eliminar o somatório algebricamente
- [ ] telescopagem até `T(1)`
- [ ] relação com série harmônica
- [ ] complexidade do caso médio
- [ ] explicar por que vale para qualquer entrada com pivô aleatório
- [ ] discutir possibilidade de pior caso
- [ ] escolher pelo menos 2 valores de `α`
- [ ] árvore de recursão com pelo menos 3 níveis para cada `α`
- [ ] `hmin`
- [ ] `hmax`
- [ ] limite inferior
- [ ] limite superior
- [ ] `hmax = k · log₂ n`
- [ ] calcular `k`
- [ ] concluir complexidade para `α` constante
- [ ] discutir partição não proporcional

## Documentação/entrega

- [ ] introdução
- [ ] implementação
- [ ] estruturas de dados
- [ ] diagramas, de preferência
- [ ] principais funções/procedimentos
- [ ] entrada e saída
- [ ] decisões de especificação
- [ ] análise integral da Parte II
- [ ] quadro-resumo
- [ ] notação `O` / `Θ`
- [ ] código bem indentado e comentado
- [ ] arquivo `.zip`
- [ ] preparação para explicar o trabalho ao professor

---

# 24. Referência principal

Material-base utilizado para este contexto:

**TRABALHO DA AV-2.pdf — “Recomendações e regras para o Trabalho AV-2”**.

Este documento de contexto não substitui o enunciado original. Em caso de dúvida, deve-se conferir o PDF do professor.
