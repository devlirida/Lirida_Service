/** ******************************************************************************** */
/*CRIADO DE FORMA AUTOMATICA PELO GERADOR DE CÓDIGO DA CROSSYSTEM*/
 /*Data:  2020-04-01 */
/** ******************************************************************************** */
package Bean;

import java.math.BigDecimal;
import java.util.Date;

public class Cobranca {

    private Long seqCobranca;
    private Long seqNfe;
    private Long seqEntregador;
    private BigDecimal taxaEntregador;
    private BigDecimal valorEntregador;
    private BigDecimal valorEntregadorReceber;
    private BigDecimal valorEntregadorLiquido;
    private Long seqPagador;
    private BigDecimal taxaPagador;
    private Long seqTransportadora;
    private BigDecimal taxaTransportadora;
    private BigDecimal valorTransportadora;
    private BigDecimal valorTransportadoraReceber;
    private BigDecimal valorTransportadoraLiquido;
    private BigDecimal valorBoleto;
    private BigDecimal valorFrete;
    private BigDecimal valorParcela;
    private String situacao;
    private Date dataCadastro;
    private String chave;
    private String formaPagamento;
    private String linkBoleto;
    private String codigoTransacaoPagarme;
    private Date dataVencimento;
    private Date dataPagamento;
    private Date dataCredito;
    private String linhaDigitavel;
    private Long parcelas;
    private Long parcela;
    private String instrucaoBoleto;
    private String nfeSituacao;
    private String emitente;
    private String destinatario;
    private String numeroNfe;
    private String transportadora;
    private String pagador;
    private String entregador;

    
// Criar GETs e SETs

    public Long getSeqCobranca() {
        return seqCobranca;
    }

    public void setSeqCobranca(Long seqCobranca) {
        this.seqCobranca = seqCobranca;
    }

    public Long getSeqNfe() {
        return seqNfe;
    }

    public void setSeqNfe(Long seqNfe) {
        this.seqNfe = seqNfe;
    }

    public Long getSeqEntregador() {
        return seqEntregador;
    }

    public void setSeqEntregador(Long seqEntregador) {
        this.seqEntregador = seqEntregador;
    }

    public BigDecimal getTaxaEntregador() {
        return taxaEntregador;
    }

    public void setTaxaEntregador(BigDecimal taxaEntregador) {
        this.taxaEntregador = taxaEntregador;
    }

    public BigDecimal getValorEntregador() {
        return valorEntregador;
    }

    public void setValorEntregador(BigDecimal valorEntregador) {
        this.valorEntregador = valorEntregador;
    }

    public BigDecimal getValorEntregadorReceber() {
        return valorEntregadorReceber;
    }

    public void setValorEntregadorReceber(BigDecimal valorEntregadorReceber) {
        this.valorEntregadorReceber = valorEntregadorReceber;
    }

    public Long getSeqPagador() {
        return seqPagador;
    }

    public void setSeqPagador(Long seqPagador) {
        this.seqPagador = seqPagador;
    }

    public BigDecimal getTaxaPagador() {
        return taxaPagador;
    }

    public void setTaxaPagador(BigDecimal taxaPagador) {
        this.taxaPagador = taxaPagador;
    }

    public Long getSeqTransportadora() {
        return seqTransportadora;
    }

    public void setSeqTransportadora(Long seqTransportadora) {
        this.seqTransportadora = seqTransportadora;
    }

    public BigDecimal getTaxaTransportadora() {
        return taxaTransportadora;
    }

    public void setTaxaTransportadora(BigDecimal taxaTransportadora) {
        this.taxaTransportadora = taxaTransportadora;
    }

    public BigDecimal getValorTransportadora() {
        return valorTransportadora;
    }

    public void setValorTransportadora(BigDecimal valorTransportadora) {
        this.valorTransportadora = valorTransportadora;
    }

    public BigDecimal getValorTransportadoraReceber() {
        return valorTransportadoraReceber;
    }

    public void setValorTransportadoraReceber(BigDecimal valorTransportadoraReceber) {
        this.valorTransportadoraReceber = valorTransportadoraReceber;
    }

    public BigDecimal getValorBoleto() {
        return valorBoleto;
    }

    public void setValorBoleto(BigDecimal valorBoleto) {
        this.valorBoleto = valorBoleto;
    }

    public BigDecimal getValorFrete() {
        return valorFrete;
    }

    public void setValorFrete(BigDecimal valorFrete) {
        this.valorFrete = valorFrete;
    }

    public BigDecimal getValorParcela() {
        return valorParcela;
    }

    public void setValorParcela(BigDecimal valorParcela) {
        this.valorParcela = valorParcela;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getChave() {
        return chave;
    }

    public void setChave(String chave) {
        this.chave = chave;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public String getLinkBoleto() {
        return linkBoleto;
    }

    public void setLinkBoleto(String linkBoleto) {
        this.linkBoleto = linkBoleto;
    }

    public String getCodigoTransacaoPagarme() {
        return codigoTransacaoPagarme;
    }

    public void setCodigoTransacaoPagarme(String codigoTransacaoPagarme) {
        this.codigoTransacaoPagarme = codigoTransacaoPagarme;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public Date getDataCredito() {
        return dataCredito;
    }

    public void setDataCredito(Date dataCredito) {
        this.dataCredito = dataCredito;
    }

    public String getLinhaDigitavel() {
        return linhaDigitavel;
    }

    public void setLinhaDigitavel(String linhaDigitavel) {
        this.linhaDigitavel = linhaDigitavel;
    }

    public Long getParcelas() {
        return parcelas;
    }

    public void setParcelas(Long parcelas) {
        this.parcelas = parcelas;
    }

    public Long getParcela() {
        return parcela;
    }

    public void setParcela(Long parcela) {
        this.parcela = parcela;
    }

    public String getInstrucaoBoleto() {
        return instrucaoBoleto;
    }

    public void setInstrucaoBoleto(String instrucaoBoleto) {
        this.instrucaoBoleto = instrucaoBoleto;
    }

    public String getNfeSituacao() {
        return nfeSituacao;
    }

    public void setNfeSituacao(String nfeSituacao) {
        this.nfeSituacao = nfeSituacao;
    }

    public String getEmitente() {
        return emitente;
    }

    public void setEmitente(String emitente) {
        this.emitente = emitente;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getNumeroNfe() {
        return numeroNfe;
    }

    public void setNumeroNfe(String numeroNfe) {
        this.numeroNfe = numeroNfe;
    }

    public String getTransportadora() {
        return transportadora;
    }

    public void setTransportadora(String transportadora) {
        this.transportadora = transportadora;
    }

    public String getPagador() {
        return pagador;
    }

    public void setPagador(String pagador) {
        this.pagador = pagador;
    }

    public String getEntregador() {
        return entregador;
    }

    public void setEntregador(String entregador) {
        this.entregador = entregador;
    }

    public BigDecimal getValorEntregadorLiquido() {
        return valorEntregadorLiquido;
    }

    public void setValorEntregadorLiquido(BigDecimal valorEntregadorLiquido) {
        this.valorEntregadorLiquido = valorEntregadorLiquido;
    }

    public BigDecimal getValorTransportadoraLiquido() {
        return valorTransportadoraLiquido;
    }

    public void setValorTransportadoraLiquido(BigDecimal valorTransportadoraLiquido) {
        this.valorTransportadoraLiquido = valorTransportadoraLiquido;
    }
    
}
