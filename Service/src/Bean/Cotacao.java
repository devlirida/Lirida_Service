/** ******************************************************************************** */
/*CRIADO DE FORMA AUTOMATICA PELO GERADOR DE CÓDIGO DA CROSSYSTEM*/
 /*Data:  2020-06-25 */
/** ******************************************************************************** */
package Bean;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class Cotacao {

    private Long seqCotacao;
    private String codigo;
    private Date dataCadastro;
    private Long seqUsuario;
    private String emailUsuario;
    private String situacao;
    private String situacaoDescricao;
    private String chave;
    private String codigoCliente;
    private String nomeCliente;
    private String codigoFormaPagamento;
    private String codigoCondicaoPagamento;
    private String codigoFilial;
    private String codigoImposto001;
    private String codigoImposto002;
    private String codigoProcesso;
    private String codigoProcessoItem;
    private Date dataLancamento;
    private Date dataEntrega;
    private Date dataDocumento;
    private BigDecimal total;
    private BigDecimal totalPagar;
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
    private List<CotacaoItem> listaItem;

// Criar GETs e SETs
    public Long getSeqCotacao() {
        return seqCotacao;
    }

    public void setSeqCotacao(Long seqCotacao) {
        this.seqCotacao = seqCotacao;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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

    public String getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getCodigoFormaPagamento() {
        return codigoFormaPagamento;
    }

    public void setCodigoFormaPagamento(String codigoFormaPagamento) {
        this.codigoFormaPagamento = codigoFormaPagamento;
    }

    public String getCodigoCondicaoPagamento() {
        return codigoCondicaoPagamento;
    }

    public void setCodigoCondicaoPagamento(String codigoCondicaoPagamento) {
        this.codigoCondicaoPagamento = codigoCondicaoPagamento;
    }

    public String getCodigoFilial() {
        return codigoFilial;
    }

    public void setCodigoFilial(String codigoFilial) {
        this.codigoFilial = codigoFilial;
    }

    public String getCodigoImposto001() {
        return codigoImposto001;
    }

    public void setCodigoImposto001(String codigoImposto001) {
        this.codigoImposto001 = codigoImposto001;
    }

    public String getCodigoImposto002() {
        return codigoImposto002;
    }

    public void setCodigoImposto002(String codigoImposto002) {
        this.codigoImposto002 = codigoImposto002;
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

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public BigDecimal getTotalPagar() {
        return totalPagar;
    }

    public void setTotalPagar(BigDecimal totalPagar) {
        this.totalPagar = totalPagar;
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

    public List<CotacaoItem> getListaItem() {
        return listaItem;
    }

    public void setListaItem(List<CotacaoItem> listaItem) {
        this.listaItem = listaItem;
    }


    
}
