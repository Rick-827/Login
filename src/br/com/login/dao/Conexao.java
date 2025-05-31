/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.login.dao;

import static java.awt.SystemColor.info;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author yasmin bispo
 */
public class Conexao {
    
    public Connection getConnection() throws SQLException{
    Connection conexao = DriverManager.getConnection("jdbc.postgresql://localhost:3306/login", "root", "");
    return conexao;

    
    }
}