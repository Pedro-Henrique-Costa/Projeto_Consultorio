package br.com.consultorio.entity;
//enum nao precisa ficar na DAO
public enum Sexo {
    Masculino (1), Feminino(2), Outros(3);

    private final int valorSexo;
    Sexo(int valor){
        valorSexo = valor;
    }

    public int getValorSexo(){
        return valorSexo;
    }
}
