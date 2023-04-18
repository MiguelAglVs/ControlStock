package clases;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class GestorArchivo {

    private String archivo;

    public GestorArchivo(String archivo) {
        this.archivo = archivo;
    }

    public List<Usuario> leerUsuarios() throws IOException {
        List<Usuario> usuarios = new ArrayList<>();
        File file = new File(archivo);
        if (!file.exists()) {
            throw new IOException("El archivo " + archivo + " no existe");
        }
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] campos = linea.split(",");
                if (campos.length != 5) {
                    System.out.println("Error: la línea no tiene el formato correcto");
                    continue;
                }
                int id = Integer.parseInt(campos[0]);
                String usuario = campos[1];
                String contrasena = campos[2];
                String palabra = campos[3];
                String rol = campos[4];
                Usuario u = new Usuario(id, usuario, contrasena, palabra, rol);
                usuarios.add(u);
            }
        }
        return usuarios;
    }

    public void escribirUsuario(Usuario usuario) throws IOException {
        File file = new File(archivo);
        int lastId = 0;
        if (file.exists()) {
            List<Usuario> usuarios = leerUsuarios();
            if (!usuarios.isEmpty()) {
                lastId = usuarios.get(usuarios.size() - 1).getId();
            }
        }
        usuario.setId(lastId + 1);
        try (PrintWriter pw = new PrintWriter(new FileWriter(archivo, true))) {
            pw.println(usuario.getId() + "," + usuario.getUsuario() + "," + usuario.getContrasena() + "," + usuario.getPalabra() + "," + usuario.getRol());
        }
    }

    public Usuario buscarUsuario(String usuario) {
        Usuario usuarioEncontrado = null;
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] campos = linea.split(",");
                int id = Integer.parseInt(campos[0]);
                String usuarioArchivo = campos[1];
                String contrasenaArchivo = campos[2];
                String palabraArchivo = campos[3];
                String rol = campos[4];
                if (usuarioArchivo.equalsIgnoreCase(usuario)) {
                    usuarioEncontrado = new Usuario(id, usuarioArchivo, contrasenaArchivo, palabraArchivo, rol);
                    break;
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
        return usuarioEncontrado;
    }

    // Otros métodos para actualizar y borrar usuarios
}
