package com.marcopollivier.xmen.queue.rabbitmq.consumer.vivo.tmp;

import java.text.MessageFormat;
import java.util.Arrays;
import java.util.List;

public enum RespostaEnum {
    // sucesso
    SUCESSO("0000", "Sucesso"),
    
    // erros genericos

    ERRO_INTERNO                        ("1000", "Erro interno"),
    ARQUIVO_DE_PROPERTIES_NAO_ECONTRADO ("1001", "Nao foi encontrado o arquivo de properties [{0}]"),
    PROPRIEDADE_NAO_ENCONTRADA          ("1002", "Nao foi encontrada a propriedade [{1}] no arquivo de properties [{0}]"),
    VALIDACAO_XML_NAO_ENCONTRADA        ("1003", "Arquivo XML de validacao nao foi encontrado"),
    VALIDACAO_XML_INVALIDO              ("1004", "Arquivo XML de validacao invalido"),
    INCONSISTENCIA                      ("1005", "Foi identificado uma inconsistencia na base de dados"),
    INCONSISTENCIA_COM_OPERADORA        ("1006", "Foi identificado uma inconsistencia dos dados com a Operadora"),
    FALHA_MANIPULAR_ARQUIVO 			("1007", "Falha ao manipular arquivo"),

    ASSINANTE_OBRIGATORIO   ("2000", "As informacoes do assinante sao obrigatorias"),
    MSISDN_OBRIGATORIO      ("2001", "O campo msisdn eh obrigatorio"),
    MSISDN_INVALIDO         ("2002", "O campo msisdn possui um valor invalido"),
    CPF_OBRIGATORIO         ("2003", "O campo cpf eh obrigatorio"),
    CPF_INVALIDO            ("2004", "O campo cpf possui um valor invalido"),
    NOME_OVERFLOW           ("2005", "O campo nome esta ultrapassando o limite de caracteres aceitos"),
    EMAIL_INVALIDO          ("2006", "O campo email possui um valor invalido"),
    EMAIL_OVERFLOW          ("2007", "O campo email esta ultrapassando o limite de caracteres aceitos"),
    MIGRADO_OBRIGATORIO     ("2008", "O campo migrao eh obrigatorio"),
    LOGRADOURO_OVERFLOW     ("2009", "O campo logradouro esta ultrapassando o limite de caracteres aceitos"),
    COMPLEMENTO_OVERFLOW    ("2010", "O campo complemento esta ultrapassando o limite de caracteres aceitos"),
    BAIRRO_OVERFLOW         ("2011", "O campo bairro esta ultrapassando o limite de caracteres aceitos"),
    CIDADE_OVERFLOW         ("2012", "O campo cidade esta ultrapassando o limite de caracteres aceitos"),
    ESTADO_OVERFLOW         ("2013", "O campo estado esta ultrapassando o limite de caracteres aceitos"),
    CEP_INVALIDO            ("2014", "O cep precisa possuir 8 digitos"),
    CARTAO_OBRIGATORIO      ("2015", "As informacoes do cartao sao obrigatorias"),
    BANDEIRA_OBRIGATORIA    ("2016", "O campo bandeira eh obrigatorio"),
    BANDEIRA_OVERFLOW       ("2017", "O campo bandeira esta ultrapassando o limite de caracteres aceitos"),
    PAN_INVALIDO            ("2018", "O campo pan possui um valor invalido"),
    MES_VENCIMENTO_INVALIDO ("2019", "O campo mes de vencimento possui um valor invalido"),
    ANO_VENCIMENTO_INVALIDO ("2020", "O campo ano de vencimento possui um valor invalido"),
    CVV_INVALIDO            ("2021", "O campo cvv possui um valor invalido"),
    PAN_LUHN_INVALIDO       ("2022", "O campo pan nao foi validado pelo algoritmo de luhn"),
    CARTAO_INEXISTENTE      ("2023", "Cartao inexistente"),
    CARTAO_VENCIDO          ("2024", "Cartao vencido"),
    CONTRATO_OBRIGATORIO    ("2026", "O campo contrato eh obrigatorio"),
    CANAL_OBRIGATORIO       ("2027", "O campo canal eh obrigatorio"),
    CONF_SEM_SERVICE_ID     ("2028", "Nao foi possivel determinar um service id"),
    BA_ID_OBRIGATORIO           ("2029", "O campo BaId eh obrigatorio"),
    ORDER_ID_OBRIGATORIO    ("2029", "O campo orderId eh obrigatorio"),
    PLANO_OBRIGATORIO     ("2030", "O campo Plano eh obrigatorio"),
    PLANO_INVALIDO        ("2031", "O campo Plano possui um valor invalido"),
    CANAL_INVALIDO        ("2032", "O campo Canal possui um valor invalido"),
    LOGIN_ATENDENTE_OBRIGATORIO     ("2033", "O campo Login do Atendente eh obrigatorio"),
    LOGIN_ATENDENTE_INVALIDO        ("2034", "O campo Login do Atendente possui um valor invalido"),
    CODIGO_PERFIL_EXTERNO_OBRIGATORIO     ("2035", "O campo Codigo do Perfil Externo eh obrigatorio"),
    CODIGO_PERFIL_EXTERNO_INVALIDO        ("2036", "O campo Codigo do Perfil Externo possui um valor invalido"),
    COMISSIONAMENTO_OBRIGATORIO     ("2037", "O campo Comissionamento eh obrigatorio"),
    COMISSIONAMENTOO_INVALIDO        ("2038", "O campo Comissionamento possui um valor invalido"),
    IP_CLIENTE_OBRIGATORIO     ("2039", "O campo IP do Cliente eh obrigatorio"),
    IP_CLIENTE_INVALIDO        ("2040", "O campo IP do Cliente possui um valor invalido"),
    CARTAO_QUATRO_ULTIMOS_DIGITOS_INVALIDOS     ("2041", "O campo com os quatro ultimos digitos possui um valor invalido"),
    CARTAO_QUATRO_ULTIMOS_DIGITOS_OBRIGATORIO   ("2042", "O campo com os quatro ultimos digitos eh obrigatorio"),
    CARD_ID_OBRIGATORIO         ("2043", "O campo CARD ID eh obrigatorio"),
    CARD_ID_INVALIDO            ("2044", "O campo CARD ID possui um valor invalido"),
    PAN_ID_OBRIGATORIO          ("2045", "O campo PAN ID eh obrigatorio"),
    PAN_ID_INVALIDO             ("2046", "O campo PAN ID possui um valor invalido"),
    MES_VENCIMENTO_OBRIGATORIO  ("2047", "O campo mes de vencimento eh obrigatorio"),
    CVV_OBRIGATORIO             ("2048", "O campo CVV eh obrigatorio"),
    COMISSIONAMENTO_INVALIDO    ("2049", "O campo comissionamento possui um valor invalido"),
    ANO_VENCIMENTO_OBRIGATORIO  ("2050", "O campo ano de vencimento eh obrigatorio"),
    TOKEN_CARTAO_OBRIGATORIO      ("2051", "O campo token eh obrigatorio"),
    TELEFONE_OBRIGATORIO        ("2053", "O campo telefone eh obrigatorio"),
    TELEFONE_INVALIDO           ("2054", "O campo telefone possui um valor invalido"),
    VALOR_PLANO_OBRIGATORIO     ("2055", "O campo valor do plano eh obrigatorio"),
    TIPO_PROMOTOR_OBRIGATORIO     ("2056", "O campo tipo do promotor eh obrigatorio"),
    PERFIL_INTERNO_OBRIGATORIO          ("2057", "O campo perfil interno eh obrigatorio"),
    PERFIL_INTERNO_INEXISTENTE                          ("2058", "Perfil interno Inexistente"),
    CODIGO_PROMOTOR_OBRIGATORIO                         ("2059", "O codigo do promotor eh obrigatorio"),
    VERSAO_APLICATIVO_OBRIGATORIO                               ("2060", "A versao do aplicativo eh obrigatoria"),
    SERVICO_OBRIGATORIO                         ("2061", "O campo servico eh obrigatorio"),
    CODIGO_PROMOTOR_JA_CADASTRADO               ("2062", "O codigo do promotor ja esta cadastrado"),
    MSISDN_PROMOTOR_OBRIGATORIO                         ("2063", "O msisdn do promotor eh obrigatorio"),
    REFIL_OBRIGATORIO                                           ("2064", "Refil Obrigatorio"),
    PLUGIN_OBRIGATORIO                                           ("2065", "Plugin Obrigatorio"),
    TIPO_ACAO_OBRIGATORIO                                           ("2066", "Tipo de acao obrigatorio"),
    TIPO_ACAO_INVALIDO                                           ("2067", "Tipo de acao invalido"),
    CNPJ_OBRIGATORIO                                             ("2068", "Cnpj eh obrigatorio"),
    CNPJ_INVALIDO                                                ("2069", "Cnpj invalido"),
    PARCEIRO_NAO_IDENTIFICADO                                    ("2070", "Paceiro nao identificado"),
    PRODUTO_CARTAO_OBRIGATORIO                             ("2090", "Produto cartao obrigatorio"),
    PRODUTO_CARTAO_INVALIDO                                    ("2091", "Produto cartao invalido"),
    DDD_OBRIGATORIO                             ("2092", "DDD obrigatorio"),
    DDD_INVALIDO_PARA_OPERACAO                                    ("2093", "DDD invalido para a operacao."),

    SEM_PERMISSAO_DE_ACESSO_A_FUNCIONALIDADE             ("3000", "Sem permissao de acesso a funcionalidade"),
    MSISDN_LIMITE_DE_CONTRATOS_POR_CPF                   ("3001", "O cpf [{0}] nao pode ativar o msisdn [{1}] pois estaria violando o limite de [{2}] contratos ativos"),
    MSISDN_LIMITE_DE_CONTRATOS_POR_CNPJ                  ("3001", "O cnpj [{0}] nao pode ativar o msisdn [{1}] pois estaria violando o limite de [{2}] contratos ativos"),
    MSISDN_LIMITE_DE_CONTRATOS_POR_IDENTIFICADOR        ("3001", "O identificador [{0}] nao pode ativar o contrato pois estaria violando o limite de [{1}] contratos ativos"),
    CANAL_INEXISTENTE                                            ("3002", "O canal [{0}] nao esta cadastrado na base de dados"),
    MSISDN_NA_BLACKLIST                                  ("3003", "Msisdn[{0}] na blacklist"),
    NAO_FOI_POSSIVEL_RECUPERAR_PROMOCAO                  ("3004", "Nao foi encontrada uma promocao para o DDD, canal e promocaoFantasia do assinante"),
    PROMOCAO_COM_ATIVACAO_DESABILITADA                   ("3005", "Promocao com ativacao desabilitada"),
    TOKEN_NAO_EXISTENTE                         ("3006","O token informado nao existe no banco de dados"),
    TOKEN_EXPIRADO                              ("3007","O token informado existe, porem sua validade expirou"),
    MSISDN_JA_COM_CONTRATO_ATIVO                ("3008", "O msisdn [{0}] ja possui o produto [{1}]"),
    TIPO_PLANO_INELEGIVEL                           ("3009", "Tipo plano [{0}] inelegivel"),
    NAO_EXISTE_CADASTRO_PENDENTE                ("3010", "O msisdn [{0}] nao possui cadastro pendente"),
    MSISDN_EM_CARENCIA_DE_ATIVACAO              ("3011", "Msisdn [{0}] em carencia de ativacao"),
    CARTAO_NA_BLACKLIST                         ("3012", "Cartao utilizado pelo msisdn [{0}] na blacklist"),
    LIMITE_DE_UTILIZACAO_CARTAO_CREDITO         ("3013", "O cartao de credito informado pelo msisdn [{0}] alcancou o limite [{1}] de utilizacao"),
    EXECUCAO_SIMULTANEA                         ("3014", "Foi identificada uma tentativa de atualizacao simultanea, o processamento foi abortado"),
    PRODUTO_INVALIDO                                        ("3015", "Produto informado [{0}] invalido"),
    CANAL_NAO_PERMITE_PRECADASTRO                               ("3016", "Canal {0} nao permite precadastro"),
    CONFIGURACAO_RECARGA_PROGRAMADA             ("3017", "A recarga programada deve possuir o parametro vencimento e não pode possuir os parametros nivel de saldo e/ou limite de recargas"),
    CONFIGURACAO_RECARGA_REFIL                  ("3018", "A recarga refil nao deve possuir o parametro vencimento e deve possuir os parametros nivel de saldo e limite de recargas"),
    CONFIGURACAO_RECARGA_PROGRAMADA_REFIL       ("3019", "A recarga programada+refil deve possuir os parametros vencimento, nivel de saldo e limite de recargas"),
    CONFIGURACAO_INVALIDA                       ("3020", "Valor {0} nao permitido para o parametro {1}."),
    IDENTIFICADOR_SEM_PLANO_ATIVO                      ("3021", "O msisdn nao possui plano ativo."),
    ALTERACAO_NAO_PERMITIDA_PROXIMA_AO_VENCIMENTO       ("3022", "Alteracao de promocao nao permitida {0} dia(s) antes do vencimento."),
    CUSTOMER_ID_INVALIDO                        ("3023", "Customer id invalido"),
    NAO_EXISTE_CADASTRO_ASSINCRONO_EM_ANDAMENTO ("3024", "O msisdn [{0}] nao possui cadastro pendente"),
    MSISDN_NECESSITA_NONO_DIGITO                ("3025", "Para números deste DDD é necessário que você preencha o 9º dígito."),
    MSISDN_SEM_NONO_DIGITO                      ("3026", "Para números deste DDD não é necessário que você preencha o 9º dígito."),
    ASYNC_FALHA_PLANO_TARIF_DIF_PRODUTO         ("3027", "Conclusao da migracao assincrona em falha, pois assinante nao possui plano tarifario do produto"),
    MIGRACAO_ASYNC_EM_ANDAMENTO                 ("3028", "Existe um contrato com status indicando uma migracao assincrona nao concluida"),
    ACESSORIO_JA_SE_ENCONTRA_ATIVO              ("3029", "Acessorio ja se encontra ativo"),
    NAO_EXISTE_ACESSORIO_DISPONIVEL             ("3030", "Nao existe acessorio disponivel"),
    ACESSORIO_PENDENTE_DE_ATIVACAO                              ("3031", "Acessorio pendente de ativacao"),
    ACESSORIO_NAO_CONTRATADO                    ("3032", "Acessorio nao contratado"),
    ACESSORIO_NAO_EXISTENTE                     ("3033", "Acessorio nao existente"),
    TIPO_ALTERACAO_INVALIDO                     ("3034", "Tipo de alteracao invalido"),
    ERRO_CONSULTA_ACESSORIO_CONTRATADO          ("3035", "Erro na consulta de acessorio contratado"),
    PRODUTO_NECESSITA_PACOTE_DADOS              ("3036", "Produto requer pacote de dados"),
    LIMITE_CARTOES_POR_IDENTIFICADOR                    ("3037", "Identificador [{0}] excedeu seu limite de [{1}] cartões de crédito"),
    STATUS_TERMINAL_INELEGIVEL                            ("3038", "Status Terminal [{0}] inelegivel"),
    PLANO_INELEGIVEL                                      ("3039", "Plano [{0}] inelegivel"),
    CADASTRO_INCOMPLETO_NA_OPERADORA                      ("3040", "Cadastro Incompleto na Operadora"),
    CARENCIA_TROCA_DE_PLANO                               ("3041", "Assinante em carência para troca de Plano"),
    MSISDN_SEM_CONTRATO_ATIVO                             ("3042", "Msisdn sem contrato ativo"),
    TROCA_PROMOCAO_NAO_PERMITIDA_NESTE_CANAL              ("3043","Troca de Promocao nao permitida neste Canal"),
    TROCA_PROMOCAO_INVALIDA_DDD_DIFERENTE                 ("3044","Troca de Promocao invalida pois o DDD da nova promocao e diferente ao da Promocao Atual"),
    PAGAMENTO_NAO_FOI_CAPTURADO                           ("3045", "Pagamento nao foi capturado"),
    ESTORNO_NAO_CONCEDIDO                                 ("3045", "Estorno nao concedido"),
    PAGAMENTO_INEXISTENTE                                 ("3046", "Pagamento inexistente"),
    MIGRACAO_ASSINCRONA                                   ("3047", "Migracao interrompida - pois nao foi possivel determinar se o plano do assinante foi alterado na operadora"),
    NAO_EXISTE_CONTRATO_EM_MIGRACAO_ASSINCRONA            ("3048", "Migracao interrompida - pois nao foi possivel determinar se o plano do assinante foi alterado na operadora"),
    CLIENTE_COM_STATUS_DIFERENTE_NA_OPERADORA             ("3049", "Status do Cliente na Operadora diferente do esperado"),
    MSISDN_SEM_CONTRATO_SUSPENSO                          ("3050", "Msisdn nao possui o contrato Suspenso"),
    PROPRIEDADE_INEXISTENTE                               ("3051","Identificador nao foi encontrado na base de dados"),
    IDENTIFICADOR_SEM_CONTRATO_NO_SISTEMA                 ("3052","Nenhum contrato foi encontrado para o identificador"),
    CLIENTE_COM_MSISDN_DIFERENTE_NA_OPERADORA             ("3053","Numero do Cliente esta diferente na operadora"),
    CONTRATO_SEM_ACCOUNT                                  ("3054","Contrato sem account"),
    CLIENTE_COM_PLANO_DIFERENTE_NA_OPERADORA              ("3055", "Plano do Cliente na Operadora diferente do esperado"),
    CONTRATO_COM_ESTADO_TRANSITORIO                       ("3056", "Contrato com estado transitorio"),
    PROMOCAO_OBRIGATORIA                                  ("3057", "A promocao eh obrigatoria"),
    PROMOCAO_INCONSISTENTE_COM_DDD                        ("3058", "Promocao inconsistente com DDD"),
    PROMOCAO_INCONSISTENTE_COM_CANAL                      ("3059", "Promocao inconsistente com Canal"),
    PAGAMENTO_NAO_AUTORIZADO_ADQUIRENTE                   ("3060", "Pagamento nao autorizado pela adquirente"),
    CONTRATO_EM_CARENCIA_TROCA_CARTAO_CREDITO             ("3061","Contrato em carencia para troca de Cartao de Credito"),
    STATUS_DO_PAGAMENTO_INVALIDO_PARA_OPERACAO            ("3062","Status do Pagamento invalido para operacao. Esperado [{0}] Recebido[{1}]"),
    ESTORNO_NAO_DEVE_SER_NOTIFICADO                       ("3063","Estorno deste Pagamento nao deve ser notificado a Operadora"),
    PROFILE_MASTER_NAO_ENCONTRADO_PARA_PAGAMENTO          ("3064","Profile Master nao encontrado para o pagamento"),
    TROCA_PROMOCAO_INVALIDA_VALOR_IGUAL                   ("3067","Troca de Promocao invalida pois o valor da nova promocao e igual ao da Promocao Atual"),
    LIMITE_PERMANENCIA_CADASTRO_ASSINCRONO_EXCEDIDA       ("3068", "Conclusao da migracao assincrona em falha, pois excedeu o limite de espera do evento de sincronismo"),
    TID_EXTERNO_DUPLICADO                                 ("3069", "O Tid externo informado ja existe"),
    CPF_INFORMADO_DIFERENTE_DO_CADASTRADO_NA_OPERADORA    ("3070","O CPF informado esta diferente do cadastrado na Operadora"),
    ASSINANTE_JA_NOTIFICADO                                                               ("3071","Assinante ja notificado"),
    CODIGO_PERFIL_EXTERNO_JA_CADASTRADO                                   ("3072", "Codigo de perfil externo ja cadastrado"),
    PROMOTOR_FORA_WHITELIST                                                               ("3073", "O promotor nao esta presente na whitelist"),
    VERSAO_APLICATIVO_INVALIDA                                                    ("3074", "Versao do aplicativo invalida"),
    DDD_COM_RENOVACAO_BLOQUEADA_TEMPORARIAMENTE                         ("3073","DDD nao permite renovacao no momento"),
    SERVICO_OPT_INEXISTENTE                         ("3075","Servico OPT inexistente"),
    OPT_OUT_JA_REGISTRADO                         ("3076","OptOut ja registrado"),
    TOKEN_INVALIDO                         ("3077","O token informado nao e valido"),
    INCENTIVO_JA_CADASTRADO                              ("3078", "Dados já esta cadastrados"), 
    PERFIL_MULTIRECARGA_NAO_ELEGIVEL                     ("3079", "Perfil MultiRecarga nao elegivel"),
    CONTRATO_NAO_ELEGIVEL_PARA_RENOVACAO_NO_PEGASUS                     ("3080", "Contrato nao elegivel para renovacao no pegasus no momento."),
    DIA_DO_CICLO_INVALIDO ("3081","Dia nao faz parte de um dia valido para nenhum o ciclo de pagamento. Diferenca de dias[Hoje - DLBC]: {0}"),
    TEMPO_CADASTRO_NAO_ATINGIDO 						("3082", "Tempo de cadastro minimo nao atingido."),
    EXECUCAO_SIMULTANEA_CARTAO_CREDITO                   ("3083", "Utilizacao simultanea de cartao de credito."),
    ARQUIVO_WHITELIST_JA_PROCESSADO						("3084", "Arquivo de Whitelist promotor ja processado"),
    ARQUIVO_WHITELIST_INEXISTENTE						("3085", "Arquivo de Whitelist promotor nao encontrado"),
    TOKEN_OBRIGATORIO                         ("3086","O token nao foi informado"),
    TROCA_PROMOCAO_INVALIDA_IGUAL                   ("3087","Troca de Promocao invalida pois o valor e a fantasia da nova promocao e igual ao da Promocao Atual"),
    PLUGIN_NAO_ENCONTRADO                   ("3088","Plugin nao encontrado"),
    PROCESSAMENTO_ASSINCRONO_EM_PENDENCIA   ("3089", "Processamento em pendencia"),
    CONTRATO_INADIMPLENTE                                               ("3090", "Contrato Inadimplente"),
    CONTRATACAO_REFIL_BLOQUEADA                                         ("3091", "Contratacao do Refil Bloqueada"),
    CARTAO_COM_CONTRATACAO_BLOQUEADA_POR_CONTESTACAO                    ("3092", "Cartao possui uma contestacao de pagamento realizada para o servico solicitado nos ultimos {0} dias"),
    LIMITE_DE_CONTRATACAO_DE_REFIL_ATINGIDO                    ("3093", "Limite de contratacoes para refil {0} atingido. Nova contratacao nao permitida."),
    TRANSACAO_DE_MESMO_TIPO_EM_ANDAMENTO                                     ("3094", "Transacao nao permitida pois o sistema ja possui uma transacao deste tipo em andamento."),
    TRANSACAO_DUPLICADA                                                      ("3095","Transacao Duplicada"),
    TRANSACAO_NAO_REALIZADA_FALHA_NA_CONSULTA_DA_TRANSACAO                   ("3096","Nao foi possivel concluir a consulta da Transacao"),

    LIMITE_TENTATIVA_ADESAO_CARTOES_DIFERENTES                              ("3097", "Limite de tentativas de adesao com cartoes diferentes atingido"),
    /*
     * ANTES DE CRIAR UM NOVO CODIGO OLHAR NO WIKI
     */
    
    LOTE_DIARIO_JA_CRIADO                                       ("3100", "Os lotes para o vencimento {0}/{1}/{2} ja foi criado em {3}"),
    LOTE_NAO_CRIADO_SEM_ITENS                                   ("3101", "O lote nao foi criado porque nao existem itens"),
    
    RENOVACAO_REGRA_DE_NEGOCIO_PADRAO                     ("3209", "Item nao processado por situacao ja prevista"),
    
    TRANSACAO_NEGADA                                      ("3900", "Transacao negada. Sem detalhamento"),
    TRANSACAO_NAO_PERMITIDA_CARTAO_INVALIDO               ("3901", "Cartao invalido"),
    TRANSACAO_NAO_PERMITIDA_CARTAO_VENCIDO                ("3902", "Cartao vencido"),
    TRANSACAO_NAO_PERMITIDA_CVV_INVALIDO                  ("3903", "Cvv invalido"),
    TRANSACAO_NAO_PERMITIDA_SALDO_INSUFICIENTE            ("3904", "Saldo insuciente"),
    TRANSACAO_NAO_REALIZADA_FALHA_GENERICA                ("3905", "Falha Generica"),
    TRANSACAO_COM_STATUS_INDEFINIDO                       ("3906", "Falha Generica"),

    // Erros de integracao com o barramento VAS
    ERRO_INTEGRACAO_CONSULTA_ELEGIBILIDADE        ("4001", "Erro na execucao da consulta elegibilidade para o msisdn [{0}]"),
    ERRO_INTEGRACAO_CADAUTO_GENERICA              ("4002", "Erro na execucao do procedimento CADAUTO para o msisdn [{0}]"),
    ERRO_INTEGRACAO_MUDANCA_PLANO_TARIFARIO_GERAL  ("4003", "Falha na mudanca do plano tarifario do msisdn [{0}]"),
    ERRO_INTEGRACAO_MUDANCA_PLANO_TARIFARIO_TIMEOUT ("4008", "Falha na mudanca do plano tarifario do msisdn [{0}]"),
    ERRO_INTEGRACAO_CONCESSAO_RECARGA             ("4004", "Falha na concessao da recarga para o msisdn [{0}]"),
    ERRO_INTEGRACAO_CADAUTO_CONTACTAR_CALL_CENTER ("4005", "Erro na execucao do procedimento CADAUTO para o msisdn [{0}] - foi solicitado ao assinante para entrar em contato com o Call Center"),
    ERRO_INTEGRACAO_CADAUTO_LIMITE_CPF            ("4006", "Erro na execucao do procedimento CADAUTO para o msisdn [{0}] - foi informado que o assinante atingiu o limite de telefones com o seu CPF"),
    ERRO_INTEGRACAO_ALTERAR_MEIO_PAGAMENTO        ("4007", "Falha na alteracao do meio de pagamento do msisdn [{0}]"),
    ERRO_INTEGRACAO_AUTORIZACAO_RECARGA           ("4008", "Falha na autorizacao da recarga para o msisdn [{0}]"),
    
    // Erros de integracao com o eldorado
    ELDORADO_FALHA_STORE                                        ("5001", "Falha generica na operacao de store"),
    ELDORADO_FALHA_AUTORIZACAO_GENERICO                         ("5002", "Falha generica na autorizacao do pagamento"),
    ELDORADO_FALHA_AUTORIZACAO_NAO_RETENTAR                     ("5003", "Falha permanente na autorizacao do pagamento"),
    ELDORADO_FALHA_AUTORIZACAO_PODE_RETENTAR                    ("5004", "Falha temporaria na autorizacao do pagamento - retentar imediatamente"),
    ELDORADO_FALHA_AUTORIZACAO_ESPERE_PARA_RETENTAR             ("5005", "Falha temporaria na autorizacao do pagamento - esperar para retentar"),
    ELDORADO_FALHA_CAPTURA_GENERICO                             ("5006", "Falha generica na captura do pagamento"),
    ELDORADO_FALHA_CAPTURA_NAO_RETENTAR                         ("5007", "Falha permanete na captura do pagamento"),
    ELDORADO_FALHA_CAPTURA_PODE_RETENTAR                        ("5008", "Falha temporaria na captura do pagamento - retentar imediatamente"),
    ELDORADO_FALHA_CAPTURA_ESPERE_PARA_RETENTAR                 ("5009", "Falha temporaria na captura do pagamento - esperar para retentar"),
    ELDORADO_FALHA_CARTAO_NA_BLACKLIST                          ("5010", "O cartao informado esta na blacklist"),
    ELDORADO_FALHA_CONSULTA_PELO_TOKEN                          ("5011", "Falha na consulta pelo token"),
    ELDORADO_FALHA_ESTORNO_GENERICO                             ("5012", "Falha generica no estorno do pagamento"),
    ELDORADO_FALHA_ESTORNO_NAO_RETENTAR                         ("5013", "Falha permanente no estorno do pagamento"),
    ELDORADO_FALHA_ESTORNO_PODE_RETENTAR                        ("5014", "Falha temporaria no estono do pagamento - retentar imediatamente"),
    ELDORADO_FALHA_ESTORNO_ESPERE_PARA_RETENTAR                 ("5015", "Falha temporaria no estono do pagamento - esperar para retentar"),
    
    // Erros de integracao com o gw de SMS
    ERRO_INTEGRACAO_SMS                         ("6001", "Falha no envio de sms [{0}] [{1}]"),

 // Erros de integracao com o gw de SMS
    ERRO_INTEGRACAO_SFTP                         ("7001", "Falha no envio de arquivo para o SFTP"),

    //Erros de integracao com o Recarga TIM
    ERRO_REGISTRO_EVENTO_RECARGA_TIM ("8001", "Falha ao registrar evento no Recarga TIM"),
    
    //Erro de integracao com VivoNet
    VIVONET_FALHA_CONSULTA_TIPO_DE_LINHA                ("9001", "Falha na execucao da consulta do Tipo de Linha no VivoNet"),
    VIVONET_FALHA_CONSULTA_CPF                          ("9002", "Falha na execucao da consulta de CPF do assinante no VivoNet"),
    VIVONET_FALHA_GERAR_PALITO                          ("9003", "Falha na execucao do gerar palito no VivoNet"),
    
    //Erro de integracao com NGIN
    NGIN_FALHA_MIGRAR_PARA_CONTROLE                     ("10001", "Falha na execucao da migracao para controle no NGIN"),
    NGIN_FALHA_MIGRAR_PARA_PRE_PAGO                     ("10002", "Falha na execucao da migracao para pre-pago no NGIN"),
    NGIN_FALHA_CANCELAR_LINHA                           ("10003", "Falha na execucao do cancelar linha no NGIN"),
    NGIN_FALHA_CONSULTA_MSISDN                          ("10004", "Falha na execucao do consultar por msisdn no NGIN"),
    NGIN_FALHA_NOTIFICAR_ESTORNO                        ("10005", "Falha na execucao da notificacao do estorno no NGIN"),
    
    
    NGIN_ERRO_INTEGRACAO_CONSULTA_PLANO                 ("10006", "Erro na execucao da consulta do Plano no NGIN"),
    NGIN_ERRO_INTEGRACAO_CONSULTA_PLANO_TIMEOUT         ("10007", "Erro de timeout na execucao da consulta do Plano no NGIN"),
    NGIN_FALHA_CONECTIVIDADE_CONSULTA_PLANO             ("10008", "Falha de conectividade na execucao da consulta do Plano no NGIN"),
    NGIN_ERRO_INTEGRACAO_CONSULTA_STATUS_TERMINAL       ("10009", "Erro na execucao da consulta do Status do Terminal no NGIN"),
    NGIN_ERRO_INTEGRACAO_STATUS_TERMINAL_TIMEOUT        ("10010", "Erro de timeout na execucao da consulta do Status do Terminal no NGIN"),
    NGIN_FALHA_CONECTIVIDADE_STATUS_TERMINAL            ("10011", "Falha de conectividade na execucao da consulta do Status do Terminal no NGIN"),

    PLATAFORMA_RECARGA_FALHA_AUTORIZACAO_TRANSITORIA    ("11001", "Falha transitoria na autorizacao de recarga"),
    PLATAFORMA_RECARGA_FALHA_AUTORIZACAO_PERMANENTE     ("11002", "Falha permanente na autorizacao de recarga"),
    
    PEGASUS_FALHA_REATIVACAO                            ("12001", "Falha durante reativacao no pegasus"),
    PEGASUS_FALHA_ATUALIZACAO_PROMOCAO                  ("12002", "Falha durante atualizacao dos dados do cliente no pegasus"),
    PEGASUS_FALHA_ATUALIZACAO_CLIENTE                   ("12003", "Falha durante atualizacao dos dados do cliente no pegasus"),
    PEGASUS_FALHA_CANCELAMENTO                          ("12004", "Falha durante cancelamento no pegasus"),
    PEGASUS_FALHA_CADASTRO                              ("12005", "Falha durante cadastro no pegasus"),
    PEGASUS_FALHA_GENERICA                              ("12006", "Falha generica no conector do pegasus"),

    TIPO_PLANO_INELEGIVEL_CLIENTE_POS_PAGO ("100001", "Tipo plano [{0}] inelegivel"),
    TIPO_PLANO_INELEGIVEL_CLIENTE_CONTROLE ("100002", "Tipo plano [{0}] inelegivel"),
    TIPO_PLANO_INELEGIVEL_CLIENTE_PJ ("100003", "Tipo plano [{0}] inelegivel"),
    TIPO_PLANO_INELEGIVEL_CLIENTE_CDMA ("100004", "Tipo plano [{0}] inelegivel"),
    TIPO_PLANO_INELEGIVEL_CLIENTE_DATA_ATIVACAO_MENOR ("100005", "Tipo plano [{0}] inelegivel")
    ;
    
    private String codigo;

    private String descricao;

    private RespostaEnum(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public RespostaEnum format(Object... params) {
        this.descricao = MessageFormat.format(this.descricao, params);
        return this;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static RespostaEnum getResposta(String codigo) {
        int length = RespostaEnum.values().length;
        for (int i = 0; i < length; i++) {
            RespostaEnum valor = RespostaEnum.values()[i];
            if (valor.getCodigo().equals(codigo)) {
                return valor;
            }
        }
        return null;
    }
    
    public static List<RespostaEnum> getFalhasNaAutorizacao() {
        return Arrays.asList(ELDORADO_FALHA_AUTORIZACAO_GENERICO,CARTAO_NA_BLACKLIST,
                              ELDORADO_FALHA_AUTORIZACAO_ESPERE_PARA_RETENTAR,ELDORADO_FALHA_AUTORIZACAO_NAO_RETENTAR,
                              ELDORADO_FALHA_AUTORIZACAO_PODE_RETENTAR,TRANSACAO_NEGADA,
                              TRANSACAO_NAO_PERMITIDA_CARTAO_INVALIDO,TRANSACAO_NAO_PERMITIDA_CARTAO_VENCIDO,
                              TRANSACAO_NAO_PERMITIDA_CVV_INVALIDO,TRANSACAO_NAO_PERMITIDA_SALDO_INSUFICIENTE);
    }

    public static List<RespostaEnum> getFalhasNaCaptura() {
        return Arrays.asList(ELDORADO_FALHA_CAPTURA_GENERICO, ELDORADO_FALHA_CAPTURA_NAO_RETENTAR, ELDORADO_FALHA_CAPTURA_PODE_RETENTAR, ELDORADO_FALHA_CAPTURA_ESPERE_PARA_RETENTAR);
    }

    public String toString() {
        return "RespostaEnum [codigo=" + codigo + ", descricao=" + descricao + "]";
    }
}
