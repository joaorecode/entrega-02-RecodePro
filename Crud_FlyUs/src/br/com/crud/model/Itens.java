package br.com.crud.model;

import java.util.Date;

public class Itens{

private int id_pacote;
private String nomepacote;
private Date datacompra;
private int quantidade;

public int getId_Pacote() {
return id_pacote;
}

public void setId_Pacote(int id_pacote) {
this.id_pacote = id_pacote;
}

public String getNomePacote() {
return nomepacote;
}

public void setNomePacote(String nomepacote) {
this.nomepacote = nomepacote;
}

public Date getDataCompra() {
return datacompra;
}

public void setDataCompra(Date datacompra) {
this.datacompra= datacompra;
}

public int getQuantidade() {
return quantidade;
}

public void setQuantidade(int quantidade) {
this.quantidade= quantidade;
 }
}