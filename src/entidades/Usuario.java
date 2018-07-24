package entidades;


public class Usuario {

    public Usuario(String usuario, String clave, Persona persona) {
        this.usuario = usuario;
        this.clave = clave;
        this.persona = persona;
    }
    private int idusuario;
    private String usuario;
    private String clave;
    private Persona persona;

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
}
