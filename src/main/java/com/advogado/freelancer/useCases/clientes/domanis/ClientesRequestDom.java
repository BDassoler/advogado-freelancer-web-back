package com.advogado.freelancer.useCases.clientes.domanis;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;
@Data
public class ClientesRequestDom {

    private String nomeCompleto;

    private String cpfOuCnpj;

    private LocalDate dataNascimento;

    private String rua;

    private String numero;

    private String bairro;

    private String cidade;

    private String uf;

    private int cep;

    private String pais;

    private String telefone;

    private String email;

    private String complemento;

    private boolean status;


    // Não precisa gerar Gets, Sets e toString, pois o "@Data" vai fazer isso
}
