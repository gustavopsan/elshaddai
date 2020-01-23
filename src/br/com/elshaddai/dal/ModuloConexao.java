package br.com.elshaddai.dal;

import java.sql.*;

public class ModuloConexao {

    //Método responsável por estabelecer a conexão com o BD
    public static Connection conector() {
        java.sql.Connection conexao = null;
        //A linha abaixo "chama" o driver
        String driver = "com.mysql.jdbc.Driver";
        //Armazenando informações referentes ao Banco de Dados
        String url = "jdbc:mysql://localhost:3306/elshaddai";
        String user = "root";
        String password = "";
        //Estabelecendo a conexão com o Banco de Dados
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            //A linha abaixo esclarece o erro
            //System.out.println(e);
            return null;
        }
    }
}
