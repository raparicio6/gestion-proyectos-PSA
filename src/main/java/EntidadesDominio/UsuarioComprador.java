package EntidadesDominio;

import java.util.ArrayList;
import java.util.List;

public class UsuarioComprador {
	
	private String nombre;
	private String apellido;
	private String mail;
	private String telefono;
	private List<RolUsuarioComprador> roles;
	
	public UsuarioComprador(String nombre, String apellido, String mail, String telefono){
		this.nombre = nombre;
		this.apellido = apellido;
		this.mail = mail;
		this.telefono = telefono;
		this.roles = new ArrayList<RolUsuarioComprador>();
	}
	
	public void agregarRol(RolUsuarioComprador rol){
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
	
	public List<RolUsuarioComprador> getRoles(){
		return this.roles;
	}

}
