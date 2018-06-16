package EntidadesDominio;

public class Tarea {
	
	private Requisito requisito;
	private String descripcion;
	private EstadoTarea estado;
	private Empleado empleadoAlQueSeAsigno;
	private long numeroTarea;
	
	private static long NUMERO_TAREA = 1;	
	
	public Tarea(Requisito requisito, String descripcion){
		this.requisito = requisito;
		this.descripcion = descripcion;
		this.estado = EstadoTarea.SIN_RESOLVERSE;
		this.empleadoAlQueSeAsigno = null;
		this.numeroTarea = NUMERO_TAREA;
	}
	
	public String getDescripcion(){
		return this.descripcion;
	}
	
	public EstadoTarea getEstado(){
		return this.estado;
	}
	
	public void modificarEstado(EstadoTarea estado){
		this.estado = estado;
	}
	
	public Requisito getRequisito(){
		return this.requisito;
	}
	
	public Empleado getEmpleadoAlQueSeAsigno(){
		return this.empleadoAlQueSeAsigno;
	}
	
	public void asignarEmpleado(Empleado empleado){
		if (this.empleadoAlQueSeAsigno != null)
			throw new TareaYaAsignadaException();
			
		this.empleadoAlQueSeAsigno = empleado;		 	
	}
	
	public long getNumeroTarea(){
		return this.numeroTarea;
	}

}
