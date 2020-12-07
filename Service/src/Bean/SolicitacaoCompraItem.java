
/***********************************************************************************/
/*CRIADO DE FORMA AUTOMATICA PELO GERADOR DE CÓDIGO DA CROSSYSTEM*/
/*Data:  2020-05-27 */
/***********************************************************************************/
package Bean;

import java.math.BigDecimal;
import java.util.Date;

public class SolicitacaoCompraItem {

private Long seqSolicitacaoCompraItem;
private Long seqSolicitacaoCompra;
private String codigo;
private String codigoPedido;
private Date dataCadastro;
private Long seqUsuario;
private String emailUsuario;
private String situacao;
private String situacaoDescricao;
private String chave;
private Date dataLancamento;
private Date dataEntrega;
private Date dataDocumento;
private String codigoItem;
private String nomeItem;
private BigDecimal quantidadeOriginal;
private BigDecimal quantidadeFechada;
private BigDecimal precoUnitario;
private BigDecimal percentualDesconto;
private String codigoCentroCusto;
private String codigoImposto1;
private String codigoImposto2;
private String codigoProcesso;
private String codigoProcessoItem;
private BigDecimal totalFechado;
private BigDecimal totalAberto;
private BigDecimal peso;
private BigDecimal volume;
private String tag01;
private String tag02;
private String tag03;
private String tag04;
private String tag05;
private String tag06;
private String tag07;
private String tag08;
private String tag09;
private String tag10;
private String linha1;
private String linha2;
private String observacao;

// Criar GETs e SETs

    public Long getSeqSolicitacaoCompraItem() {
        return seqSolicitacaoCompraItem;
    }

    public void setSeqSolicitacaoCompraItem(Long seqSolicitacaoCompraItem) {
        this.seqSolicitacaoCompraItem = seqSolicitacaoCompraItem;
    }

    public Long getSeqSolicitacaoCompra() {
        return seqSolicitacaoCompra;
    }

    public void setSeqSolicitacaoCompra(Long seqSolicitacaoCompra) {
        this.seqSolicitacaoCompra = seqSolicitacaoCompra;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigoPedido() {
        return codigoPedido;
    }

    public void setCodigoPedido(String codigoPedido) {
        this.codigoPedido = codigoPedido;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Long getSeqUsuario() {
        return seqUsuario;
    }

    public void setSeqUsuario(Long seqUsuario) {
        this.seqUsuario = seqUsuario;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getSituacaoDescricao() {
        return situacaoDescricao;
    }

    public void setSituacaoDescricao(String situacaoDescricao) {
        this.situacaoDescricao = situacaoDescricao;
    }

    public String getChave() {
        return chave;
    }

    public void setChave(String chave) {
        this.chave = chave;
    }

    public Date getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(Date dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public Date getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(Date dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public Date getDataDocumento() {
        return dataDocumento;
    }

    public void setDataDocumento(Date dataDocumento) {
        this.dataDocumento = dataDocumento;
    }

    public String getCodigoItem() {
        return codigoItem;
    }

    public void setCodigoItem(String codigoItem) {
        this.codigoItem = codigoItem;
    }

    public String getNomeItem() {
        return nomeItem;
    }

    public void setNomeItem(String nomeItem) {
        this.nomeItem = nomeItem;
    }

    public BigDecimal getQuantidadeOriginal() {
        return quantidadeOriginal;
    }

    public void setQuantidadeOriginal(BigDecimal quantidadeOriginal) {
        this.quantidadeOriginal = quantidadeOriginal;
    }

    public BigDecimal getQuantidadeFechada() {
        return quantidadeFechada;
    }

    public void setQuantidadeFechada(BigDecimal quantidadeFechada) {
        this.quantidadeFechada = quantidadeFechada;
    }

    public BigDecimal getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(BigDecimal precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public BigDecimal getPercentualDesconto() {
        return percentualDesconto;
    }

    public void setPercentualDesconto(BigDecimal percentualDesconto) {
        this.percentualDesconto = percentualDesconto;
    }

    public String getCodigoCentroCusto() {
        return codigoCentroCusto;
    }

    public void setCodigoCentroCusto(String codigoCentroCusto) {
        this.codigoCentroCusto = codigoCentroCusto;
    }

    public String getCodigoImposto1() {
        return codigoImposto1;
    }

    public void setCodigoImposto1(String codigoImposto1) {
        this.codigoImposto1 = codigoImposto1;
    }

    public String getCodigoImposto2() {
        return codigoImposto2;
    }

    public void setCodigoImposto2(String codigoImposto2) {
        this.codigoImposto2 = codigoImposto2;
    }

    public String getCodigoProcesso() {
        return codigoProcesso;
    }

    public void setCodigoProcesso(String codigoProcesso) {
        this.codigoProcesso = codigoProcesso;
    }

    public String getCodigoProcessoItem() {
        return codigoProcessoItem;
    }

    public void setCodigoProcessoItem(String codigoProcessoItem) {
        this.codigoProcessoItem = codigoProcessoItem;
    }

    public BigDecimal getTotalFechado() {
        return totalFechado;
    }

    public void setTotalFechado(BigDecimal totalFechado) {
        this.totalFechado = totalFechado;
    }

    public BigDecimal getTotalAberto() {
        return totalAberto;
    }

    public void setTotalAberto(BigDecimal totalAberto) {
        this.totalAberto = totalAberto;
    }

    public BigDecimal getPeso() {
        return peso;
    }

    public void setPeso(BigDecimal peso) {
        this.peso = peso;
    }

    public BigDecimal getVolume() {
        return volume;
    }

    public void setVolume(BigDecimal volume) {
        this.volume = volume;
    }

    public String getTag01() {
        return tag01;
    }

    public void setTag01(String tag01) {
        this.tag01 = tag01;
    }

    public String getTag02() {
        return tag02;
    }

    public void setTag02(String tag02) {
        this.tag02 = tag02;
    }

    public String getTag03() {
        return tag03;
    }

    public void setTag03(String tag03) {
        this.tag03 = tag03;
    }

    public String getTag04() {
        return tag04;
    }

    public void setTag04(String tag04) {
        this.tag04 = tag04;
    }

    public String getTag05() {
        return tag05;
    }

    public void setTag05(String tag05) {
        this.tag05 = tag05;
    }

    public String getTag06() {
        return tag06;
    }

    public void setTag06(String tag06) {
        this.tag06 = tag06;
    }

    public String getTag07() {
        return tag07;
    }

    public void setTag07(String tag07) {
        this.tag07 = tag07;
    }

    public String getTag08() {
        return tag08;
    }

    public void setTag08(String tag08) {
        this.tag08 = tag08;
    }

    public String getTag09() {
        return tag09;
    }

    public void setTag09(String tag09) {
        this.tag09 = tag09;
    }

    public String getTag10() {
        return tag10;
    }

    public void setTag10(String tag10) {
        this.tag10 = tag10;
    }

    public String getLinha1() {
        return linha1;
    }

    public void setLinha1(String linha1) {
        this.linha1 = linha1;
    }

    public String getLinha2() {
        return linha2;
    }

    public void setLinha2(String linha2) {
        this.linha2 = linha2;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

}