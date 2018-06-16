package EntidadesDominio;

import java.util.List;

public interface RolUsuarioComprador {
	// Los distintos tipos de usuarios lado cliente que intervienen en todo el sistema.
	// Cualquiera de los mismos debe tener una implementación de estos métodos.
	
	public void agregarProducto(Producto producto);
	public List<Producto> getProductosContratados();
	
	public void crearTicket(TicketSoporte ticket);
	public List<TicketSoporte> getTicketsGenerados();
	public void darFeedbackResolucionTicket(String feedback, long idTicket);
	
}
