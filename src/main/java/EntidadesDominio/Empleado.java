package EntidadesDominio;

import java.util.ArrayList;
import java.util.List;

public class Empleado implements RolUsuarioEmpresaVendedora{

	private String legajo;
	private Cargo cargo;
	private Area area;
	private Seniority seniority;
	private List<Tarea> tareas;
	
	public Empleado(String legajo, Cargo cargo, Area area){
		this.legajo = legajo;
		this.cargo = cargo;
		this.area = area;
		this.seniority = null; // puede no tener (por ej un gerente no tiene)
		this.tareas = new ArrayList<Tarea>();
	}
	
	public String getLegajo(){
		return this.legajo;
	}
	
	public Cargo getCargo(){
		return this.cargo;
	}
	
	public Area getArea(){
		return this.area;
	}	
	
	public void modificarSeniority(Seniority seniority){
		this.seniority = seniority;
	}
	
	public Seniority getSeniority(){
		return this.seniority;
	}
	
	public List<Tarea> getTareas(){
		return this.tareas;
	}
	
	public void tomarTarea(Tarea tarea){
		if (tarea.getEmpleadoAlQueSeAsigno() != null)
			throw new TareaYaAsignadaException();		
		
		this.tareas.add(tarea);
		tarea.modificarEstado(EstadoTarea.EN_CURSO);  
	}
	
	public void finalizarTarea(long numeroTarea){
		Tarea t = null;		
		
		for (Tarea tarea : this.getTareas()){			
			if (tarea.getNumeroTarea() == numeroTarea){				
				t = tarea;
				break;
			}				
		}		
		
		t.modificarEstado(EstadoTarea.FINALIZADA);		
	}
	
	public Dinero facturarProyecto(Proyecto proyecto){
		if (this.getCargo() != Cargo.GERENTE || this.getArea() != Area.FINANZAS)
			throw new GerenteFinanzasFacturaProyectosException();
		
		int horas = proyecto.getHorasAsignadas();		
		
		Dinero costoPorHora = new Dinero(500, TipoMoneda.PESO);
		double montoFacturado = horas * costoPorHora.getMonto();
		
		Dinero dineroFacturado = new Dinero(montoFacturado, TipoMoneda.PESO);
				
		proyecto.setDineroFacturado(dineroFacturado);
		
		return dineroFacturado;
	}
	
}
