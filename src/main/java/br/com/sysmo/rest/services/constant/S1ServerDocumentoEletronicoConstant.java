package br.com.sysmo.rest.services.constant;

public class S1ServerDocumentoEletronicoConstant {

    public static final String PKG_DOCUMENTOELETRONICO = "br.com.sysmo.s1.server.documento.eletronico";
    public static final String PKG_API = PKG_DOCUMENTOELETRONICO + ".api";
    public static final String PKG_API_CONFIG = PKG_API + ".config";
    public static final String PKG_SERVICE = PKG_DOCUMENTOELETRONICO + ".service";
    public static final String PKG_REPOSITORY = PKG_DOCUMENTOELETRONICO + ".repository";
    public static final String PKG_JAVANFE = "br.com.sysmo.server.javanfe";

    public static final String COMPONENT_SCAN_API = "componentScanApiBeanDoc";
    public static final String COMPONENT_SCAN_SERVICE = "componentScanServiceBeanDoc";
    public static final String COMPONENT_SCAN_UTIL = "componentScanUtilBeanDoc";

    private static final String CONTEXT_PATH = "/s1-server-documento-eletronico-api/bs";
    public static final String PATH_DOCUMENTOELETRONICO = CONTEXT_PATH + "/documentoEletronico";
    public static final String PATH_DOCUMENTOELETRONICONUMERO = CONTEXT_PATH + "/documentoEletronicoNumero";
    public static final String PATH_CONFIGURACAO = CONTEXT_PATH + "/configuracao";
    public static final String PATH_INICIALIZACAO_MODULO = CONTEXT_PATH + "/inicializacaoModulo";
    public static final String PATH_DOCUMENTOELETRONICO_STATUS_SEFAZ = CONTEXT_PATH + "/documentoEletronicoStatusSefaz";

    public static final String API_DOCUMENTOELETRONICO = "Documento Eletrônico";
    public static final String API_DOCUMENTOELETRONICO_NUMERO = "Documento Eletrônico Número";
    public static final String API_CONFIGURACAO = "Configuração";
    public static final String API_INICIALIZACAOMODULO = "Dados da configuração do modulo";
    public static final String API_DOCUMENTOELETRONICO_STATUS_SEFAZ = "Documento Eletrônico Status Sefaz";

    public static final String SEFAZ_CONFIGURACAO_PREFIX = "s1.server.documento.eletronico";
    public static final String PROXY_CONFIGURACAO_PREFIX = "s1.server.proxy";

    public static final String PATH_DOCUMENTOELETRONICO_AUTORIZAR = "/autorizar";
    public static final String PATH_ATUALIZAR_CONFIGURACAO = "/atualizarConfiguracao";
    public static final String PATH_OBTER_MODULO_ATIVO = "/obterModuloAtivo";
    public static final String PATH_OBTER_VERSAO_MODULO = "/obterVersaoModulo";
    public static final String PATH_DOCUMENTOELETRONICO_CANCELAR = "/cancelar";
    public static final String PATH_CONSULTAR_STATUS = "/consultarStatus";
    public static final String PATH_CONSULTAR_STATUS_RETORNO = "/consultarStatusRetorno";
    public static final String PATH_ATUALIZAR_NUMERACAO = "/atualizarNumeracao";
    public static final String PATH_ADQUIRIR_ULTIMO_NUMERO_SERIE_UTILIZADO = "/adquirirUltimoNumeroSerieUtilizado";

    public static final String ENDPOINT_DOCUMENTOELETRONICO_AUTORIZAR = PATH_DOCUMENTOELETRONICO + PATH_DOCUMENTOELETRONICO_AUTORIZAR;
    public static final String ENDPOINT_DOCUMENTOELETRONICO_CANCELAR = PATH_DOCUMENTOELETRONICO + PATH_DOCUMENTOELETRONICO_CANCELAR;
    public static final String ENDPOINT_CONFIGURACAO_DOCUMENTOELETRONICO = PATH_CONFIGURACAO + PATH_ATUALIZAR_CONFIGURACAO;
    public static final String ENDPOINT_INICIALIZACAO_MODULO_OBTER_MODULO_ATIVO = PATH_INICIALIZACAO_MODULO + PATH_OBTER_MODULO_ATIVO;
    public static final String ENDPOINT_INICIALIZACAO_MODULO_OBTER_VERSAO_MODULO = PATH_INICIALIZACAO_MODULO + PATH_OBTER_VERSAO_MODULO;
    public static final String ENDPOINT_DOCUMENTOELETRONICONUMERO_ADQUIRIR_ULTIMO_NUMERO_UTILIZADO = PATH_DOCUMENTOELETRONICONUMERO
            + PATH_ADQUIRIR_ULTIMO_NUMERO_SERIE_UTILIZADO;
    public static final String ENDPOINT_DOCUMENTOELETRONICONUMERO_ATUALIZAR_NUMERACAO = PATH_DOCUMENTOELETRONICONUMERO + PATH_ATUALIZAR_NUMERACAO;
    public static final String ENDPOINT_DOCUMENTOELETRONICOSTATUSSEFAZ_CONSULTAR_STATUS = PATH_DOCUMENTOELETRONICO_STATUS_SEFAZ
            + PATH_CONSULTAR_STATUS;

    public static final String PARAMETRO_CODIGO_EMPRESA = "codigoEmpresa";
    public static final String PARAMETRO_CODIGO_PDV = "codigoPDV";
    public static final String PARAMETRO_CODIGO_VENDA = "codigoVenda";
    public static final String PARAMETRO_CODIGO_ORDEM_OPERACAO = "codigoOrdemOperacao";
    public static final String PARAMETRO_DATA_MOVIMENTO = "dataMovimento";
    public static final String PARAMETRO_UNIDADE_FEDERATIVA = "unidadeFederativa";
    public static final String PARAMETRO_AMBIENTE = "ambiente";
    public static final String PARAMETRO_VALOR = "valor";

    public static final String CAMPO_DOCELETRONICO = "documento eletrônico";
    public static final String CAMPO_EMITENTE = "emitente";
    public static final String CAMPO_IDENTIFICACAO = "identificacao";
    public static final String CAMPO_ITENS = "itens";
    public static final String CAMPO_PAGAMENTOS = "pagamentos";
    public static final String CAMPO_TOTAIS = "totais";
    public static final String CAMPO_VENDA = "venda";
    public static final String CAMPO_EMITENTE_ENDERECO = "endereço do emitente";
    public static final String CAMPO_ITEM_CODIGO = "codigo do produto";
    public static final String CAMPO_ITEM_IMPOSTO = "imposto do produto codigo ";
    public static final String CAMPO_ITEM_IMPOSTO_ICMS = "icms do produto codigo ";
    public static final String CAMPO_ITEM_IMPOSTO_COFINS = "cofins do produto codigo ";
    public static final String CAMPO_ITEM_IMPOSTO_PIS = "pis do produto codigo ";
    
    public static final String NUMERO = " Numero: ";
    public static final String SERIE = " Serie: ";

    private S1ServerDocumentoEletronicoConstant() {
    }
}
