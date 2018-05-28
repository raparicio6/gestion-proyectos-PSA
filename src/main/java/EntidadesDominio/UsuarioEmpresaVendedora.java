package EntidadesDominio;

import java.util.ArrayList;
import java.util.List;

public class UsuarioEmpresaVendedora {
	// la clase tiene un nombre genérico ya que el producto a pesar de ser para PSA se puede vender a otro
	
	private String nombre;
	private String apellido;
	private String mail;
	private String telefono;
	private List<RolUsuarioEmpresaVendedora> roles;
	
	public UsuarioEmpresaVendedora(String nombre, String apellido, String mail, String telefono){
		this.nombre = nombre;
		this.apellido = apellido;
		this.mail = mail;
		this.telefono = telefono;
		this.roles = new ArrayList<RolUsuarioEmpresaVendedora>();
	}
	
	public void agregarRol(RolUsuarioEmpresaVendedora rol){
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
	
	public List<RolUsuarioEmpresaVendedora> getRoles(){
		return this.roles;
	}

}
