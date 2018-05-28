package EntidadesDominio;

import java.util.ArrayList;
import java.util.List;

public class Cliente implements RolUsuario {
	
	private String CUIT;
	private String razonSocial;
	private String domicilio;	
	private List<Comentario> comentarios;
	// FALTAN LOS PRODUCTOS, LOS TICKETS, Y DEMÁS
	
	public Cliente(String CUIT, String razonSocial, String domicilio){
		this.CUIT = CUIT;
		this.razonSocial = razonSocial;
		this.domicilio = domicilio;
		this.comentarios = new ArrayList<Comentario>();
	}
	
	public String getCUIT(){
		return this.CUIT;
	}
	
	public String getRazonSocial(){
		return this.razonSocial;
	}
	
	public String getDomicilio(){
		return this.domicilio;
	}
	
	public List<Comentario> getComentarios(){
		return this.comentarios;
	}
	
	public void agregarComentario(Comentario comentario){
		this.comentarios.add(comentario);
	}
	

}
