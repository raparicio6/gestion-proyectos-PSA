package fiuba;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import EntidadesDominio.Area;
import EntidadesDominio.Cargo;
import EntidadesDominio.Cliente;
import EntidadesDominio.Empleado;
import EntidadesDominio.EstadoTarea;
import EntidadesDominio.EstadoTicket;
import EntidadesDominio.Requisito;
import EntidadesDominio.Tarea;
import EntidadesDominio.TicketSoporte;

import static org.junit.Assert.assertFalse;

public class DesarrolloTareaFinalizadoSteps {

	private Requisito requisito = new Requisito("NOMBRE", "DESCRIPCION");
	private Tarea tarea;
	private Empleado desarrollador;	
	
	@Dado("^que una tarea con \"(.*?)\" como descripcion se crea$")
    public void que_una_tarea_con_como_descripcion_se_crea(String descripcion) throws Throwable {
		this.tarea = new Tarea(this.requisito, descripcion);		
		this.requisito.agregarTarea(this.tarea);				
    }

    @Cuando("^se le asigna a un desarrollador con legajo \"(.*?)\"$")
    public void se_le_asigna_a_un_desarrollador(String legajo) throws Throwable {
    	this.desarrollador = new Empleado(legajo, Cargo.DESARROLLADOR, Area.OPERACIONES);
    	this.desarrollador.tomarTarea(this.tarea);		
    	this.tarea.asignarEmpleado(this.desarrollador);    	   	
    }

    @Entonces("^el desarrollador la resuelve y finaliza la tarea numero \"(.*?)\"$")
    public void el_desarrollador_con_legajo_la_resuelve_y_finaliza_la_tarea_numero(long numeroTarea) throws Throwable {
    	this.desarrollador.finalizarTarea(numeroTarea);
    	assertEquals(this.tarea.getEstado(), EstadoTarea.FINALIZADA);    	
    }

}
