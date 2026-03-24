package com.example.fornecedor.entity;

import jakarta.persistence.*;

@Entity(name = "Fornecedor")
@Table(name = "tb_fornecedor")
public class Fornecedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome_fantasia")  // Nome diferente no banco
    private String nomeFantasia;

    @Column(name = "cnpj_fornecedor") // Nome diferente no banco
    private String cnpj;

    @Column(name = "contato_fornecedor") // Nome diferente no banco
    private String contato;

    public Fornecedor() {}

    public Fornecedor(String nomeFantasia, String cnpj, String contato) {
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
        this.contato = contato;
    }

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNomeFantasia() { return nomeFantasia; }
    public void setNomeFantasia(String nomeFantasia) { this.nomeFantasia = nomeFantasia; }

    public String getCnpj() { return cnpj; }
    public void setCnpj(String cnpj) { this.cnpj = cnpj; }

    public String getContato() { return contato; }
    public void setContato(String contato) { this.contato = contato; }
}