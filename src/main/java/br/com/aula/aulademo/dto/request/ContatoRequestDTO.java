package br.com.aula.aulademo.dto.request;

import lombok.Data;

@Data
public class ContatoRequestDTO {
    private Long id;
    private String nomeContato;
    private String telefoneContato;
    private String emailContato;
}
