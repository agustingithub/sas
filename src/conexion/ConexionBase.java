/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Agustin
 */
public class ConexionBase {
    Connection conn=null;
    private static final String driver="com.mysql.jdbc.Driver";
    private static final String user="programadoresisi";
    private static final String password="isi111mil";
    private static final String url="jdbc:mysql://db4free.net:3306/bdcolegio";

        public ConexionBase() {
            try{
                Class.forName(driver);
                conn=DriverManager.getConnection(url, user, password);
                if (conn!=null){
                   System.out.println("Conexion Establecida");
                }
            }
                catch(ClassNotFoundException | SQLException e){
                        System.out.println("Error de Conexion "+e);
                        }
            }
        public Connection getConnection(){
            return conn;
        }
        public void desconectar(){
            conn=null;
            if (conn==null){
                System.out.println("Conexion Terminada");
            }
        }
        }
    

