package fiuba;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import EntidadesDominio.Area;
import EntidadesDominio.Cargo;
import EntidadesDominio.Cliente;
import EntidadesDominio.Dinero;
import EntidadesDominio.Empleado;
import EntidadesDominio.EstadoProyecto;
import EntidadesDominio.EstadoTicket;
import EntidadesDominio.Proyecto;
import EntidadesDominio.TicketSoporte;
import EntidadesDominio.TipoMoneda;

import static org.junit.Assert.assertFalse;

public class FacturacionProyectoSteps {

	private Proyecto proyecto;	
	private Empleado gerenteFinanzas;

	@Dado("^los datos de un proyecto con identificacion \"(.*?)\" previamente analizado$")
    public void los_datos_de_un_proyecto_con_identificacion_previamente_analizado(String identificacion) throws Throwable {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 2018);
		cal.set(Calendar.MONTH, Calendar.MAY);
		cal.set(Calendar.DAY_OF_MONTH, 10);
		Date fechaInicio = cal.getTime();
		
		Calendar cal2 = Calendar.getInstance();
		cal2.set(Calendar.YEAR, 2018);
		cal2.set(Calendar.MONTH, Calendar.NOVEMBER);
		cal2.set(Calendar.DAY_OF_MONTH, 20);
		Date fechaEstimadaFin = cal2.getTime();
		
		Cliente cliente = new Cliente("20304050", "Cimes", "Monroe 1523");
		Dinero presupuesto = new Dinero(200000, TipoMoneda.PESO);
				
    	this.proyecto = new Proyecto(identificacion, fechaInicio, fechaEstimadaFin, cliente, 
    			presupuesto, 500, EstadoProyecto.PENDIENTE_APROBACION);
    }

    @Cuando("^se desea facturar el proyecto por el gerente de finanzas$")
    public void se_desea_facturar_el_proyecto_por_el_gerente_de_finanzas() throws Throwable {
    	this.gerenteFinanzas = new Empleado("00003", Cargo.GERENTE, Area.FINANZAS);
    }

    @Entonces("^se obtienen los datos del proyecto para poder facturarlo")
    public void se_obtienen_los_datos_del_proyecto_para_poder_facturarlo() throws Throwable {
    	Dinero dinero = this.gerenteFinanzas.facturarProyecto(this.proyecto);    	
        assertEquals(dinero, proyecto.getDineroFacturado());
    }

}
