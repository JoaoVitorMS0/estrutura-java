```markdown
# Sistema de Ordenação de Empresas - BubbleSort

![Java](https://img.shields.io/badge/Java-17%2B-blue)
![License](https://img.shields.io/badge/License-MIT-green)

Sistema para ordenação de empresas por valor de mercado utilizando algoritmo BubbleSort, desenvolvido em Java para a disciplina de Estrutura de Dados.

## 📋 Índice

- [Visão Geral](#-visão-geral)
- [Estrutura do Projeto](#-estrutura-do-projeto)
- [Funcionalidades](#-funcionalidades)
- [Pré-requisitos](#-pré-requisitos)
- [Como Executar](#-como-executar)
- [Formato dos Arquivos](#-formato-dos-arquivos)
- [Desempenho](#-desempenho)
- [Melhorias Futuras](#-melhorias-futuras)
- [Licença](#-licença)

## 🌟 Visão Geral

O sistema processa um arquivo TXT contendo dados de empresas (nome, inscrição estadual e valor de mercado) e gera um novo arquivo com os registros ordenados por valor de mercado em ordem decrescente.

## 📂 Estrutura do Projeto

```
sistema-ordenacao-empresas/
├── src/
│   └── com/
│       └── estudo/
│           ├── Empresa.java        # Modelo de dados
│           ├── FileManager.java    # Gerenciamento de arquivos
│           ├── BubbleSort.java     # Algoritmo de ordenação
│           └── Main.java           # Ponto de entrada
├── data/
│   ├── Empresas_BubbleSort.txt     # Entrada (exemplo)
│   └── Empresas_Ordenadas.txt      # Saída (gerado)
├── lib/                            # Dependências
├── target/                         # Arquivos compilados
└── README.md                       # Esta documentação
```

## 🛠️ Funcionalidades

- **Leitura de arquivos**: Processa arquivos TXT com dados de empresas
- **Tratamento de dados**: Converte diversos formatos monetários
- **Ordenação**: Implementação otimizada do BubbleSort
- **Saída formatada**: Gera arquivo com dados ordenados e valores formatados

## 📦 Pré-requisitos

- Java JDK 17+
- Mínimo 2GB de RAM (4GB recomendado)
- 200MB de espaço livre em disco

## 🚀 Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/ordenacao-empresas.git
   ```

2. Compile o projeto:
   ```bash
   javac -d target src/com/estudo/*.java
   ```

3. Execute o programa:
   ```bash
   java -cp target com.estudo.Main
   ```

4. Os arquivos serão procurados em `data/` por padrão

## 📄 Formato dos Arquivos

### Entrada (`Empresas_BubbleSort.txt`)
```
Nome Fantasia | Inscrição Estadual | Valor
Empresa A | 12345678-9 | 5000000
Empresa B | 98765432-1 | R$3.000.000,00
```

### Saída (`Empresas_Ordenadas.txt`)
```
Empresa A | 12345678-9 | R$ 5000000.00
Empresa B | 98765432-1 | R$ 3000000.00
```

## ⏱️ Desempenho

| Quantidade | Tempo Estimado |
|------------|----------------|
| 1.000      | < 1s           |
| 10.000     | ~10s           |
| 100.000    | ~15min         |
| 1.000.000  | 6-24 horas     |

## 🔮 Melhorias Futuras

- [ ] Implementar algoritmos mais eficientes (QuickSort, MergeSort)
- [ ] Adicionar processamento paralelo
- [ ] Interface gráfica para seleção de arquivos
- [ ] Opção de ordenação por diferentes campos

## 📜 Licença

Este projeto está licenciado sob a licença MIT - veja o arquivo [LICENSE](LICENSE) para detalhes.

---

Desenvolvido por [Seu Nome] - 2024 | [Estrutura de Dados S.A.](https://www.example.com)
```

### Observações:
1. Substitua `[Seu Nome]` e o link do repositório pelos dados reais
2. Adicione um arquivo LICENSE se necessário
3. Para um README mais completo, inclua:
   - Seção de "Como Contribuir"
   - Badges adicionais (build status, coverage)
   - Capturas de tela (se tiver interface)
4. Mantenha atualizado conforme o projeto evolui
