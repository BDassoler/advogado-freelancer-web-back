package com.advogado.freelancer.useCases.clientes.impl.mappers;
import com.advogado.freelancer.entities.Clientes;
import com.advogado.freelancer.frameWork.ConversorData;
import com.advogado.freelancer.useCases.clientes.domanis.ClientesRequestDom;
import com.advogado.freelancer.useCases.clientes.domanis.ClientesResponseDom;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ClientesMapper {

    public static ClientesResponseDom clientesToClientesResponseDom(Clientes clientes){
        ClientesResponseDom out = new ClientesResponseDom();
        out.setId(clientes.getId());
        out.setNomeCompleto(clientes.getNomeCompleto());
        out.setCpfOuCnpj(clientes.getCpfOuCnpj());
        out.setDataNascimento(clientes.getDataNascimento());
        out.setRua(clientes.getRua());
        out.setNumero(clientes.getNumero());
        out.setBairro(clientes.getBairro());
        out.setCidade(clientes.getCidade());
        out.setUf(clientes.getUf());
        out.setCep(clientes.getCep());
        out.setPais(clientes.getPais());
        out.setTelefone(clientes.getTelefone());
        out.setEmail(clientes.getEmail());
        out.setComplemento(clientes.getComplemento());
        out.setStatus(clientes.getStatus());
        return out;
    }

    // Método para converter ClientesRequestDom para Clientes
    public static Clientes clientesRequestDomToClientes(ClientesRequestDom clientesRequestDom){
        Clientes out = new Clientes();

        out.setNomeCompleto(clientesRequestDom.getNomeCompleto());
        out.setCpfOuCnpj(clientesRequestDom.getCpfOuCnpj());
        out.setDataNascimento(ConversorData.converterDataBrasileiraParaDataAmericana(clientesRequestDom.getDataNascimento())); // Convertendo a data de nascimento
        out.setRua(clientesRequestDom.getRua());
        out.setNumero(clientesRequestDom.getNumero());
        out.setBairro(clientesRequestDom.getBairro());
        out.setCidade(clientesRequestDom.getCidade());
        out.setUf(clientesRequestDom.getUf().toUpperCase());
        out.setCep(clientesRequestDom.getCep());
        out.setPais(clientesRequestDom.getPais());
        out.setTelefone(clientesRequestDom.getTelefone());
        out.setEmail(clientesRequestDom.getEmail());
        out.setComplemento(clientesRequestDom.getComplemento());
        out.setStatus(clientesRequestDom.getStatus());
        return out;
    }

}
