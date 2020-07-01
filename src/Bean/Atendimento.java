
/***********************************************************************************/
/*CRIADO DE FORMA AUTOMATICA PELO GERADOR DE CÓDIGO DA CROSSYSTEM*/
/*Data:  2020-04-13 */
/***********************************************************************************/
package Bean;

import java.util.Date;

public class Atendimento {

private Long seqAtendimento;
private Date dataCadastro;
private String situacao;
private String texto;
private Long seqUsuario;
private String nome;

// Criar GETs e SETs

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

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Long getSeqUsuario() {
        return seqUsuario;
    }

    public void setSeqUsuario(Long seqUsuario) {
        this.seqUsuario = seqUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}