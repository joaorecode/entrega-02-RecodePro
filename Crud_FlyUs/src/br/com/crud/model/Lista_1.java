package br.com.crud.model;

import java.util.Date;

public class Lista_1{

private int id_lista_1;
private String voos;
private Date data_ida;
private Date data_volta;
private String destinos;

public int getId_Lista_1() {
return id_lista_1;
}

public void setId_Lista_1(int id_lista_1) {
this.id_lista_1 = id_lista_1;
}

public String getVoos() {
return voos;
}

public void setVoos(String voos) {
this.voos = voos;
}

public Date getData_Ida() {
return data_ida;
}

public void setData_Ida(Date data_ida) {
this.data_ida= data_ida;
}

public Date getData_Volta() {
return data_volta;
}

public void setData_Volta(Date data_volta) {
this.data_volta= data_volta;
}

public String getDestinos() {
return destinos;
}

public void setDestinos(String destinos) {
this.destinos= destinos;
 }
}