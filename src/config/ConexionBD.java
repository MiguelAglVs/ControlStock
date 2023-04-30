package config;

import java.sql.*;

public class ConexionBD {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/inventariocs";
        String usuario = "root";
        String contrasena = "";
        String consulta = "SELECT * FROM productos";

        try (Connection conexion = DriverManager.getConnection(url, usuario, contrasena);
             Statement declaracion = conexion.createStatement();
             ResultSet resultado = declaracion.executeQuery(consulta)) {
            while (resultado.next()) {
                int id = resultado.getInt("Id");
                String nombre = resultado.getString("nombre");
                String marca = resultado.getString("marca");
                int cantidad = resultado.getInt("cantidad");
                double precio = resultado.getDouble("precio");
                System.out.println("Id: " + id + ", Nombre: " + nombre + ", Marca: " + marca + ", Cantidad: " + cantidad + ", Precio: " + precio);
            }
        } catch (SQLException e) {
            System.out.println("Error al ejecutar la consulta: " + e.getMessage());
        }
    }
}
