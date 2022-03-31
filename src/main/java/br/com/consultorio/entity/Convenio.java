package br.com.consultorio.entity;

import java.math.BigDecimal;

public class Convenio {
    String nome;
    BigDecimal custo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getCusto() {
        return custo;
    }

    public void setCusto(BigDecimal custo) {
        this.custo = custo;
    }
}
