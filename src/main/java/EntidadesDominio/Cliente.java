package EntidadesDominio;

import java.util.ArrayList;
import java.util.List;

public class Cliente implements RolUsuarioComprador {
	
	private String CUIT;
	private String razonSocial;
	private String domicilio;	
	private List<Comentario> comentarios;
	private List<Producto> productos;
	private List<TicketSoporte> tickets;
	
	public Cliente(String CUIT, String razonSocial, String domicilio){
		this.CUIT = CUIT;
		this.razonSocial = razonSocial;
		this.domicilio = domicilio;
		this.comentarios = new ArrayList<Comentario>();
		this.productos = new ArrayList<Producto>();
		this.tickets = new ArrayList<TicketSoporte>();
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
	
	public void agregarProducto(Producto producto){
		this.productos.add(producto);
	}
	
	public void agregarTicket(TicketSoporte ticket){
		this.tickets.add(ticket);
	}
	
	public List<Producto> getProductosContratados(){
		return this.productos;
	}
	
	public List<TicketSoporte> getTicketsGenerados(){
		return this.tickets;
	}	

}
