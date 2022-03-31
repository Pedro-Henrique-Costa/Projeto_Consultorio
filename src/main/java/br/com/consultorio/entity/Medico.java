package br.com.consultorio.entity;

import java.math.BigDecimal;

public class Medico {
     String CRM;
     String consultorio;
     String especializacao;
     BigDecimal porcParticicao;

    public String getCRM() {
        return CRM;
    }

    public void setCRM(String CRM) {
        this.CRM = CRM;
    }

    public String getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(String consultorio) {
        this.consultorio = consultorio;
    }

    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }

    public BigDecimal getPorcParticicao() {
        return porcParticicao;
    }

    public void setPorcParticicao(BigDecimal porcParticicao) {
        this.porcParticicao = porcParticicao;
    }

}
