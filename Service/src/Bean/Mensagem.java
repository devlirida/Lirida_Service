
/***********************************************************************************/
/*CRIADO DE FORMA AUTOMATICA PELO GERADOR DE CÓDIGO DA CROSSYSTEM*/
/*Data:  2020-05-08 */
/***********************************************************************************/
package Bean;

import java.util.Date;

public class Mensagem {

private Long seqMensagem;
private Long seqUsuario;
private Long seqModulo;
private String codigo;
private String codigoModulo;
private String emailUsuario;
private String mensagem;
private String lida;
private Date dataLida;
private Date dataCadastro;
private String chave;
private String titulo;
private String usuarioNome;
private String moduloNome;
private String moduloPagina;

// Criar GETs e SETs

    public Long getSeqMensagem() {
        return seqMensagem;
    }

    public void setSeqMensagem(Long seqMensagem) {
        this.seqMensagem = seqMensagem;
    }

    public Long getSeqUsuario() {
        return seqUsuario;
    }

    public void setSeqUsuario(Long seqUsuario) {
        this.seqUsuario = seqUsuario;
    }

    public Long getSeqModulo() {
        return seqModulo;
    }

    public void setSeqModulo(Long seqModulo) {
        this.seqModulo = seqModulo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getLida() {
        return lida;
    }

    public void setLida(String lida) {
        this.lida = lida;
    }

    public Date getDataLida() {
        return dataLida;
    }

    public void setDataLida(Date dataLida) {
        this.dataLida = dataLida;
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

    public String getUsuarioNome() {
        return usuarioNome;
    }

    public void setUsuarioNome(String usuarioNome) {
        this.usuarioNome = usuarioNome;
    }

    public String getCodigoModulo() {
        return codigoModulo;
    }

    public void setCodigoModulo(String codigoModulo) {
        this.codigoModulo = codigoModulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getModuloNome() {
        return moduloNome;
    }

    public void setModuloNome(String moduloNome) {
        this.moduloNome = moduloNome;
    }

    public String getModuloPagina() {
        return moduloPagina;
    }

    public void setModuloPagina(String moduloPagina) {
        this.moduloPagina = moduloPagina;
    }
    

}