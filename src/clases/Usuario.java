package clases;

public class Usuario {

    private int id;
    private String usuario;
    private String contrasena;
    private String palabra;
    private String rol;

    public Usuario(int id, String usuario, String contrasena, String palabra, String rol) {
        this.id = id;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.palabra = palabra;
        this.rol = rol;
    }

    // Métodos getter y setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

}
