package br.com.consultorio.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Agenda extends AbstractEntity{

    @Getter @Setter
    @ManyToOne
    Paciente paciente;

    @Getter @Setter
    @ManyToOne
    Medico medico;

    @Getter @Setter
    @ManyToOne
    Secretaria secretaria;

    @Getter @Setter
    @Enumerated(EnumType.STRING)
    @Column(name = "statusAgendamento", nullable = false)
    StatusAgendamento statusAgendamento;

    @Getter @Setter
    @Column(name = "observacao", length = 40)
    String observacao;

    @Getter @Setter
    @Column(name = "encaixe", columnDefinition = "BOOLEAN DEFAULT TRUE", nullable = false)
    Boolean encaixe;

    @Getter @Setter
    @Column(name = "data")
    LocalDateTime data;


}
