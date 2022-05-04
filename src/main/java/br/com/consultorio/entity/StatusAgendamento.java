package br.com.consultorio.entity;

public enum StatusAgendamento  {


    Pendente (1), Aprovado (2), Cancelado (3), Rejeitado (4), Compareceu (5), NaoCompareceu(6);

    private final int valorStatus;
    StatusAgendamento(int valor){valorStatus = valor;}

    public int getValorStatus(){return valorStatus;}
}
