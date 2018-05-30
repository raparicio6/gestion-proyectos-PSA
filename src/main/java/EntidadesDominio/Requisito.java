package EntidadesDominio;

public class Requisito {
	
	private String nombre;
	private String descripcion;
	private int porcentajeCompletado;
	
	public Requisito(String nombre, String descripcion){
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.porcentajeCompletado = 0;
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

	
}
