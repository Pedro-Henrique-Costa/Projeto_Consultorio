package br.com.consultorio.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Secretaria extends Pessoas{
     BigDecimal salario;
     LocalDateTime dataContratacao;

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public LocalDateTime getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(LocalDateTime dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

}
 