package br.com.alura.forum.dto;

import br.com.alura.forum.model.Resposta;

import java.time.LocalDateTime;

public class RespostaDto {

    private String mensagem;
    private LocalDateTime dataDeCriacao;
    private String autor;

    public RespostaDto(Resposta resposta) {
        this.mensagem = resposta.getMensagem();
        this.dataDeCriacao = resposta.getDataDeCriacao();
        this.autor = resposta.getUsuario().getNome();
    }

    public String getMensagem() {
        return mensagem;
    }

    public LocalDateTime getDataDeCriacao() {
        return dataDeCriacao;
    }

    public String getAutor() {
        return autor;
    }
}
