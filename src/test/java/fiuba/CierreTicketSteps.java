package fiuba;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import EntidadesDominio.Cliente;
import EntidadesDominio.EstadoTicket;
import EntidadesDominio.TicketSoporte;

import static org.junit.Assert.assertFalse;

public class CierreTicketSteps {

	private TicketSoporte ticket;
	private Cliente cliente;

	@Dado("^que un ticket es creado por un cliente con \"(.*?)\" como descripcion$")
    public void que_un_ticket_es_creado_por_un_cliente_como_descripcion(String descripcion) throws Throwable {
    	this.cliente = new Cliente(descripcion,"Sony","Avenida Belgrano 2040");    	
    	this.ticket = new TicketSoporte(cliente, descripcion, 1);       
    	this.cliente.agregarTicket(ticket);
    }

    @Cuando("^se resuelve$")
    public void se_resuelve() throws Throwable {
    	this.ticket.modificarEstado(EstadoTicket.FINALIZADO);
    }

    @Entonces("^el cliente puede dar un feedback \"(.*?)\" de la resolucion del ticket \"(.*?)\"$")
    public void el_cliente_puede_dar_un_feedback_de_la_resolucion(String feedback, long idTicket) throws Throwable {
    	this.cliente.darFeedbackResolucionTicket(feedback, idTicket);    	
        assertEquals(this.ticket.getFeedbackResolucion(), feedback);
    }

}
