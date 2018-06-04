package EntidadesDominio;

import java.util.ArrayList;
import java.util.List;

public class Requisito {
	
	private String nombre;
	private String descripcion;
	private int porcentajeCompletado;
	private List<Tarea> tareas;
	
	public Requisito(String nombre, String descripcion){
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.porcentajeCompletado = 0;
		this.tareas = new ArrayList<Tarea>();
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getDescripcion() {
		return this.descripcion;
	}
	
	public int getPorcentajeCompletado() {
		return this.porcentajeCompletado;
	}
	
	public void modificarPorcentajeCompletado(int nuevoPorcentaje) {
		this.porcentajeCompletado = nuevoPorcentaje;				
	}
	
	public List<Tarea> getTareas(){
		return this.tareas;
	}
	
	public void agregarTarea(Tarea tarea){
		this.tareas.add(tarea);
	}

	
}
