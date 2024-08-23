## **Visão Geral**

Este repositório utiliza a metodologia **Git Flow** para gerenciar o desenvolvimento e versionamento. A branch `hotfix` é utilizada para corrigir problemas críticos encontrados em produção.

## **Hotfix**

A branch `hotfix` é criada a partir da `master` para resolver problemas críticos que não podem esperar pelo próximo ciclo de lançamento. Após a correção, o código é mesclado de volta na `master` e na `develop`.

## **Fluxo de Trabalho Geral**

- **Correção urgente**: Resolva problemas críticos com urgência.
- **Mesclagem imediata**: Após a correção, mescle a hotfix na `master` para implantação imediata.
- **Atualização da develop**: Mescle também na `develop` para manter o código atualizado em todas as branches.

Retorne para a branch `master` ou siga o fluxo conforme necessário.
