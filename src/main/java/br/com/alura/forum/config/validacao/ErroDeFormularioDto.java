package br.com.alura.forum.config.validacao;

public class ErroDeFormularioDto {

    private String campo;
    private String msgErro;

    public ErroDeFormularioDto(String campo, String msgErro) {
        this.campo = campo;
        this.msgErro = msgErro;
    }

    public String getCampo() {
        return campo;
    }

    public String getMsgErro() {
        return msgErro;
    }
}
