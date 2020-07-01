
/***********************************************************************************/
/*CRIADO DE FORMA AUTOMATICA PELO GERADOR DE CÓDIGO DA CROSSYSTEM*/
/*Data:  2020-04-02 */
/***********************************************************************************/
package Bean;

import java.math.BigDecimal;
import java.util.Date;

public class Transferencia {

private Long seqTransferencia;
private Long seqEntregador;
private Long seqTransportadora;
private Date data;
private BigDecimal valor;
private BigDecimal taxa;
private Date dataCredito;
private String codigoPagarme;

// Criar GETs e SETs

    public Long getSeqTransferencia() {
        return seqTransferencia;
    }

    public void setSeqTransferencia(Long seqTransferencia) {
        this.seqTransferencia = seqTransferencia;
    }

    public Long getSeqEntregador() {
        return seqEntregador;
    }

    public void setSeqEntregador(Long seqEntregador) {
        this.seqEntregador = seqEntregador;
    }

    public Long getSeqTransportadora() {
        return seqTransportadora;
    }

    public void setSeqTransportadora(Long seqTransportadora) {
        this.seqTransportadora = seqTransportadora;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public BigDecimal getTaxa() {
        return taxa;
    }

    public void setTaxa(BigDecimal taxa) {
        this.taxa = taxa;
    }

    public Date getDataCredito() {
        return dataCredito;
    }

    public void setDataCredito(Date dataCredito) {
        this.dataCredito = dataCredito;
    }

    public String getCodigoPagarme() {
        return codigoPagarme;
    }

    public void setCodigoPagarme(String codigoPagarme) {
        this.codigoPagarme = codigoPagarme;
    }

}