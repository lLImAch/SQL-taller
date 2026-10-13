package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dao {
String user = "root";
String psw = "admin";
String ruta = "jdbc:mysql://localhost:3306/pepe";
public void conectar() {
	Connection conexion  = null;
	try {
		conexion = DriverManager.getConnection(ruta, user, psw);
		System.out.println("conecto");
	}catch(SQLException e){
		e.printStackTrace();
	} finally {
		try {
			conexion.close();
		}catch(SQLException e) {
			
		}
	}
}
}
