
# Problema SEDEX - Verificação de Compatibilidade de Bolas de Boliche

Este projeto é uma solução para um problema que verifica se uma bola de boliche cabe dentro de uma caixa específica. Dado o diâmetro de uma bola e as três dimensões de uma caixa (altura, largura e profundidade), o programa determina se a bola pode ser transportada em uma determinada caixa usando as regras fornecidas.

## Descrição do Problema

- A entrada consiste em dois conjuntos de valores:
  1. Um inteiro `N` representando o diâmetro da bola (1 ≤ N ≤ 10.000).
  2. Três inteiros `A`, `L` e `P` representando as dimensões da caixa (altura, largura e profundidade), onde (1 ≤ A, L, P ≤ 10.000).

- Saída:
  - O programa deve imprimir "S" se a bola cabe na caixa.
  - O programa deve imprimir "N" caso contrário.

## Como Executar o Programa

### Pré-requisitos

- Java 8 ou superior instalado.

### Compilação e Execução

1. Compile o código usando o `javac`:

   ```bash
   javac TestaEnvio.java
   ```

2. Execute o programa:

   ```bash
   java TestaEnvio
   ```

### Exemplo de Uso

**Entrada:**
```
10
15 20 30
```

**Saída:**
```
S
```

**Descrição:** Neste exemplo, a bola de diâmetro 10 cabe dentro da caixa com dimensões 15x20x30.

## Estrutura do Projeto

- `TestaEnvio.java`: Código fonte da solução.
