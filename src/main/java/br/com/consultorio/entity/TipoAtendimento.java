package br.com.consultorio.entity;
//enum nao precisa ficar na DAO
public enum TipoAtendimento {
 Particular(1), Convenio(2);

 private final int valorTipo;
 TipoAtendimento(int valor){ valorTipo = valor;}

 public int getValorTipo() {return valorTipo;}

}
