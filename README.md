![Cypher_from_X-Men_Legacy_235.jpg](https://bitbucket.org/repo/4ppjBpL/images/1507394605-Cypher_from_X-Men_Legacy_235.jpg)

# Projeto Icatu Cypher

O Cypher é um projeto responsável pela troca de informações com a Icatu via arquivo padrão FEBRABAN.

## Arquivos previstos: 
- Arquivo de recebimento de pagamento (Entrada)
- Arquivo de retorno de confirmação de pagamento (Saída)
- Arquivo de recebimento de cancelamento (Entrada)

## Fluxo
A Icatu envia para M4U os arquivos via Connect:Direct. Esses arquivos são processados pelo Cypher e enviada para que o Magneto faça o cadastramento da programação. 

## Projeto Icatu Cypher

[Ops](https://bitbucket.org/git-m4u/icatu-ops)

[Infra](https://bitbucket.org/git-m4u/infra-born-m4u-icatu)

## Links Úteis
[Docker](https://hub.docker.com/r/m4ucorp/icatu/)

[Wiki](https://sistemas.m4u/wiki/display/ISVO/Icatu+Seguros+-+Venda+Online+Home)

## Projetos integrados
[Mistica](https://bitbucket.org/git-m4u/mistica)

[Magneto](https://bitbucket.org/git-m4u/magneto)

[Tempestade](https://bitbucket.org/git-m4u/tempestade)

## Projetos de referência 
[Colossus](https://bitbucket.org/git-m4u/colossus)

[Juggernaut](https://bitbucket.org/git-m4u/controle-algar-juggernaut)

## Códigos de Retorno
```
00 	Sucesso
10 	Erro inesperado
20 	Problema interno na adquirente
21 	Problema na comunicação com a adquirente
31 	Maquineta não encontrada
32 	Credencial inválida
33 	Terminal não está em uso
34 	Terminal com divergencia de sessao
50 	Problema no cartão
51 	Cartão inválido
52 	CVV Inválido
53 	Cartão vencido
54 	Cartão não desbloqueado
55 	Saldo insuficiente
56 	Limite de compras excedido
57 	Regra de negócio da adquirente
59 	Cartão na blacklist
81 	Falha na captura
82 	Resposta de autorização não encontrada
83 	Transação não autorizada
91 	Transação cancelada
92 	Erro ao cancelar uma transação
93 	Não é possível cancelar uma transação capturada
94 	Transação não encontrada para cancelamento
```

## Outros Projetos
[PHP _DESCONTINUADO_](https://bitbucket.org/git-m4u/frontend-m4u-post-paid-card-management-icatu)
