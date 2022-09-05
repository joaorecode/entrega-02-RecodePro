package br.com.crud.model;

import java.util.Date;

public class Lista_2{

private int id_lista_2;
private String voos;
private Date data_ida;
private Date data_volta;
private String destinos;

public int getId_Lista_2() {
return id_lista_2;
}

public void setId_Lista_2(int id_lista_2) {
this.id_lista_2 = id_lista_2;
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