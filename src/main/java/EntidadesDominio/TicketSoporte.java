package EntidadesDominio;

public class TicketSoporte {
	
	private Cliente clienteAutor;
	private String descripcion;
	private EstadoTicket estado;
	private String feedbackResolucion;
	private long id;
	
	public TicketSoporte(Cliente clienteAutor, String descripcion, long id){
		this.clienteAutor = clienteAutor;
		this.descripcion = descripcion;
		this.estado = EstadoTicket.CREADO;
		this.id = id;
	}
	
	public String getDescripcion(){
		return this.descripcion;
	}
	
	public void editarDescripcion(String nuevaDescripcion){
		this.descripcion = nuevaDescripcion;				
	}
	
	public String getFeedbackResolucion(){
		return this.feedbackResolucion;
	}
	
	public void darFeedbackResolucion(String feedbackResolucion) {
		this.feedbackResolucion = feedbackResolucion;
	}
	
	public EstadoTicket getEstado(){
		return this.estado;
	}
	
	public void modificarEstado(EstadoTicket estado){
		this.estado = estado;
	}
	
	public Cliente getClienteAutor(){
		return this.clienteAutor;
	}
	
	public long getId(){
		return this.id;
	}	

}
