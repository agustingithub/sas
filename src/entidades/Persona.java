package entidades;

import conexion.ConexionBase;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class Persona {
    ConexionBase conexion;
    
    private int idpersona;
    private int dni;
    private int telefono;
    private String apellido;
    private String nombre;
    private String direccion;
    private int cp;
    private String email;
    private Date fechanac;
    private int sexo;
    private String barrio;
    private int cel;
    private int nrodireccion;
    private int cuil;
    private String nacionalidad;
    private String ednia;
    private String compania;
    private String estado;
    private int idlocalidad;

    public Persona() {
    }
        public Persona(ConexionBase conexion, int idpersona, int dni, int telefono, String apellido, String nombre, String direccion, int cp, String email, Date fechanac, int sexo, String barrio, int cel, int nrodireccion, int cuil, String nacionalidad, String ednia, String compania, String estado, int idlocalidad) {
        
        this.conexion = conexion;
        this.idpersona = idpersona;
        this.dni = dni;
        this.telefono = telefono;
        this.apellido = apellido;
        this.nombre = nombre;
        this.direccion = direccion;
        this.cp = cp;
        this.email = email;
        this.fechanac = fechanac;
        this.sexo = sexo;
        this.barrio = barrio;
        this.cel = cel;
        this.nrodireccion = nrodireccion;
        this.cuil = cuil;
        this.nacionalidad = nacionalidad;
        this.ednia = ednia;
        this.compania = compania;
        this.estado = estado;
        this.idlocalidad = idlocalidad;
    }

    public ConexionBase getConexion() {
        return conexion;
    }

    public void setConexion(ConexionBase conexion) {
        this.conexion = conexion;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public int getNrodireccion() {
        return nrodireccion;
    }

    public void setNrodireccion(int nrodireccion) {
        this.nrodireccion = nrodireccion;
    }

    public int getCuil() {
        return cuil;
    }

    public void setCuil(int cuil) {
        this.cuil = cuil;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getEdnia() {
        return ednia;
    }

    public void setEdnia(String ednia) {
        this.ednia = ednia;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getIdlocalidad() {
        return idlocalidad;
    }

    public void setIdlocalidad(int idlocalidad) {
        this.idlocalidad = idlocalidad;
    }
    

    public int getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(int idpersona) {
        this.idpersona = idpersona;
    }
    public int getDni(){
        return dni;
    }
    public void setDni(int dni){
        this.dni = dni;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public int setCP(){
        return cp;
    }
    public void getCP(int cp){
        this.cp = cp;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getFechanac() {
        return fechanac;
    }

    public void setFechanac(Date fechanac) {
        this.fechanac = fechanac;
    }

    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }
    public String getBarrio(){
        return barrio;
    }
    public void setBarrio(String barrio){
        this.barrio = barrio;
    }
    public int getCel(){
        return cel;
    }
    public void setCel(int cel){
        this.cel = cel;
    }
    public int setNrodireccion(){
        return nrodireccion;
    }
    public void getNrodireccion(int nrodireccion){
        this.nrodireccion = nrodireccion;
    }
    
    public void CargarPersona(){
        try {
            conexion = new ConexionBase();
            Connection base = conexion.getConnection();
            
            PreparedStatement pst = base.prepareStatement("CALL insertarpersona (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?");
            
            pst.setString(1, this.nombre);
            pst.setString(2, this.apellido);
            pst.setInt(3, this.dni);
            pst.setInt(4, cuil);
            pst.setDate(5, this.fechanac);
            pst.setString(6, nacionalidad);
            pst.setString(7, ednia);
            pst.setString(8, this.direccion);
            pst.setString(9, barrio);
            pst.setInt(10, this.telefono);
            pst.setInt(11, cel);
            pst.setString(12, compania);
            pst.setString(13, this.email);
            pst.setString(14, estado);
            pst.setInt(15, idlocalidad);
            pst.setInt(16, sexo);
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cargado correctamente");
        } catch (SQLException ex) {
            Logger.getLogger(Persona.class.getName()).log(Level.SEVERE, null, ex);
        }            
    }
    
}
