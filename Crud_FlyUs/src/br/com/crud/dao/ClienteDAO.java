package br.com.crud.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.crud.factory.ConnectionFactory;
import br.com.crud.model.Cliente;

public class ClienteDAO{

public void save(Cliente cliente) {

String sql = "INSERT INTO clientes(nome, telefone, email)" + "VALUES(?,?,?)";

Connection conn = null;
br.com.crud.dao.PreparedStatement pstm = null;

try {
conn = ConnectionFactory.createConnectionToMySQL();
pstm = conn.preparedStatement(sql);

pstm.setString(1, cliente.getNome());
pstm.setInt(2, cliente.getTelefone());
pstm.setString(3, cliente.getEmail());

pstm.execute();

} catch (Exception e) {

e.printStackTrace();
}finally{

try{
if(pstm != null){
conn.close();
}

}catch(Exception e){
e.printStackTrace();
}
}
}

public void removeById1(int id) {
String sql = "DELETE FROM cliente WHERE id = ?";
Connection conn = null;
br.com.crud.dao.PreparedStatement pstm = null;

try{
conn = ConnectionFactory.createConnectionToMySQL();
pstm = conn.preparedStatement(sql);

pstm.setInt(1, id);

pstm.execute();

} catch (Exception e) {

e.printStackTrace();
}finally{

try{
if(pstm != null){
pstm.close();
}

try{
if(conn != null){
conn.close();
}

}catch(Exception e){
e.printStackTrace();
}
}finally {
}
}
}
public void update1(Cliente cliente) {

String sql = "UPDATE cliente SET nome = ?, telefone = ?, email = ?" + "WHERE id = ?";
Connection conn = null;
br.com.crud.dao.PreparedStatement pstm = null;

try {
conn = ConnectionFactory.createConnectionToMySQL();
pstm = conn.preparedStatement(sql);

pstm.setString(1, cliente.getNome());
pstm.setInt(2, cliente.getTelefone());
pstm.setString(3, cliente.getEmail());

pstm.setInt(4, cliente.getId());

pstm.execute();

} catch (Exception e) {

e.printStackTrace();
}finally{

try{
if(pstm != null){
pstm.close();
}

try{
if(conn != null){
conn.close();
}

}catch(Exception e){
e.printStackTrace();
}
}finally {
}
}
}
public List<Cliente> getCliente1() {

String sql = "SELECT * FROM cliente";

List<Cliente> cliente = new ArrayList<Cliente>();

Connection conn = ConnectionFactory.createConnectionToMySQL();
br.com.crud.dao.PreparedStatement pstm = conn.preparedStatement(sql);

ResultSet rset = null;

try {
conn = ConnectionFactory.createConnectionToMySQL();
pstm = conn.preparedStatement(sql);

while(rset.next()){
Cliente cliente1 = new Cliente();

cliente1.setId(rset.getInt("id"));
cliente1.setNome(rset.getString("nome"));
cliente1.setTelefone(rset.getInt("telefone"));
cliente1.setEmail(rset.getEmail("email"));
}
}catch(Exception e){
e.printStackTrace();
}finally{
if(rset != null){
rset.close();
}
if(pstm != null){
pstm.close();
}

try{
if(conn != null){
conn.close();
}

}catch(Exception e){
e.printStackTrace();
}
}

return cliente;
}





package br.com.crud.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.crud.factory.ConnectionFactory;
import br.com.crud.model.Cliente;


public void save1(Cliente cliente) {

String sql = "INSERT INTO clientes(nome, telefone, email)" + "VALUES(?,?,?)";

Connection conn = null;
br.com.crud.dao.PreparedStatement pstm = null;

try {
conn = ConnectionFactory.createConnectionToMySQL();
pstm = conn.preparedStatement(sql);

pstm.setString(1, cliente.getNome());
pstm.setInt(2, cliente.getTelefone());
pstm.setString(3, cliente.getEmail());

pstm.execute();

} catch (Exception e) {

e.printStackTrace();
}finally{

try{
if(pstm != null){
conn.close();
}

}catch(Exception e){
e.printStackTrace();
}finally {
}
}
}

public void removeById(int id) {
String sql = "DELETE FROM cliente WHERE id = ?";
Connection conn = null;
br.com.crud.dao.PreparedStatement pstm = null;

try{
conn = ConnectionFactory.createConnectionToMySQL();
pstm = conn.preparedStatement(sql);

pstm.setInt(1, id);

pstm.execute();

} catch (Exception e) {

e.printStackTrace();
}finally{

try{
if(pstm != null){
pstm.close();
}

try{
if(conn != null){
conn.close();
}

}catch(Exception e){
e.printStackTrace();
}
}finally{
}
}
}

public void update(Cliente cliente) {

String sql = "UPDATE cliente SET nome = ?, telefone = ?, email = ?" + "WHERE id = ?";
Connection conn = null;
br.com.crud.dao.PreparedStatement pstm = null;

try {
conn = ConnectionFactory.createConnectionToMySQL();
pstm = conn.preparedStatement(sql);

pstm.setString(1, cliente.getNome());
pstm.setInt(2, cliente.getTelefone());
pstm.setString(3, cliente.getEmail());

pstm.setInt(4, cliente.getId());

pstm.execute();

} catch (Exception e) {

e.printStackTrace();
}finally{

try{
if(pstm != null){
pstm.close();
}

try{
if(conn != null){
conn.close();
}

}catch(Exception e){
e.printStackTrace();
}
}finally {
}
}
}

public List<Cliente> getCliente() throws Throwable {

String sql = "SELECT * FROM cliente";

List<Cliente> cliente = new ArrayList<Cliente>();

Connection conn = ConnectionFactory.createConnectionToMySQL();
br.com.crud.dao.PreparedStatement pstm = conn.preparedStatement(sql);

ResultSet rset = null;

try {
conn = ConnectionFactory.createConnectionToMySQL();
pstm = conn.preparedStatement(sql);

while(rset.next()){
Cliente clientes = new Cliente();

Cliente clients = null;
clients.setId(rset.getInt("id"));
clients.setNome(rset.getString("nome"));
clients.setTelefone(rset.getInt("telefone"));
clients.setEmail(rset.getEmail("email"));
}
}catch(Exception e){
e.printStackTrace();
}finally{
if(rset != null){
rset.close();
}
if(pstm != null){
pstm.close();
}

try{
if(conn != null){
conn.close();
}

}catch(Exception e){
e.printStackTrace();
}
}

return cliente;
}
}
