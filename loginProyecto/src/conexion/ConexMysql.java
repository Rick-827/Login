/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author jhonf
 */
public class ConexMysql {
   Connection cn;

    public Connection conectar(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/tabela_login","root","");
            System.out.println("CONECTADO"); 
        } catch (Exception e) {
             System.out.println("ERROR DE CONEXÃO COM O BD"+e);
        }
        return cn;
    }
}
