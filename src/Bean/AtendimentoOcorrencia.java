/** ******************************************************************************** */
/*CRIADO DE FORMA AUTOMATICA PELO GERADOR DE CÓDIGO DA CROSSYSTEM*/
 /*Data:  2020-04-13 */
/** ******************************************************************************** */
package Bean;

import java.util.Date;

public class AtendimentoOcorrencia {

    private Long seqAtendimentoOcorrencia;
    private Long seqAtendimento;
    private Date dataCadastro;
    private String texto;
    private String origem;

// Criar GETs e SETs

    public Long getSeqAtendimentoOcorrencia() {
        return seqAtendimentoOcorrencia;
    }

    public void setSeqAtendimentoOcorrencia(Long seqAtendimentoOcorrencia) {
        this.seqAtendimentoOcorrencia = seqAtendimentoOcorrencia;
    }

    public Long getSeqAtendimento() {
        return seqAtendimento;
    }

    public void setSeqAtendimento(Long seqAtendimento) {
        this.seqAtendimento = seqAtendimento;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }
    
}
