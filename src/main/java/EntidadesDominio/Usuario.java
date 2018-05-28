package EntidadesDominio;

import java.util.List;

public class Usuario {
	
	private String nombre;
	private String apellido;
	private String mail;
	private String telefono;
	private List<RolUsuario> roles;
	
	public Usuario(String nombre, String apellido, String mail, String telefono){
		this.nombre = nombre;
		this.apellido = apellido;
		this.mail = mail;
		this.telefono = telefono;
	}
	
	public void agregarRol(RolUsuario rol){
		this.roles.add(rol);
	}
	
	public String getNombre(){
		return this.nombre;
	}
	
	public String getApellido(){
		return this.apellido;
	}
	
	public String getMail(){
		return this.mail;
	}
	
	public String getTelefono(){
		return this.telefono;
	}

}
