package fiuba;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNotEquals;

import java.util.ArrayList;
import java.util.List;

import EntidadesDominio.Area;
import EntidadesDominio.Cargo;
import EntidadesDominio.Cliente;
import EntidadesDominio.Empleado;
import EntidadesDominio.EstadoTarea;
import EntidadesDominio.EstadoTicket;
import EntidadesDominio.Requisito;
import EntidadesDominio.Tarea;
import EntidadesDominio.TareaYaAsignadaException;
import EntidadesDominio.TicketSoporte;

import static org.junit.Assert.assertFalse;

public class AsignacionTareaSoloAUnEmpleadoSteps {

	private Requisito requisito = new Requisito("NOMBRE", "DESCRIPCION");
	private Tarea tarea;
	private Empleado desarrollador;	
	private List<RuntimeException> exceptions = new ArrayList<>();
	
	@Dado("^que una tarea con \"(.*?)\" de descripcion se crea$")
    public void que_una_tarea_con_de_descripcion_se_crea(String descripcion) throws Throwable {
		this.tarea = new Tarea(this.requisito, descripcion);		
		this.requisito.agregarTarea(this.tarea);				
    }

    @Cuando("^se le asigna a desarrollador de legajo \"(.*?)\"$")
    public void se_le_asigna_a_desarrollador(String legajo) throws Throwable {
    	this.desarrollador = new Empleado(legajo, Cargo.DESARROLLADOR, Area.OPERACIONES);
    	this.desarrollador.agregarTarea(this.tarea);		
    	this.tarea.asignarEmpleado(this.desarrollador);		
    	this.tarea.modificarEstado(EstadoTarea.EN_CURSO);   	
    }

    @Entonces("^si se intenta asignar la tarea a otro desarrollador no se lo permite$")
    public void si_se_intenta_asignar_la_tarea_a_otro_desarrollador_no_se_lo_permite() throws Throwable {
    	Empleado desarrollador2 = new Empleado("12343333", Cargo.DESARROLLADOR, Area.OPERACIONES);
    	
    	try {
            tarea.asignarEmpleado(desarrollador2);
        } catch (TareaYaAsignadaException e) {
            this.exceptions.add(e);
        }
    	
    	assertNotEquals(this.exceptions.size(), 0);    	
    }

}
