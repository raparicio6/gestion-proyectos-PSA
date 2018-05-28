package EntidadesDominio;

import java.util.ArrayList;
import java.util.List;

public class InformacionEmpleado {
	
	private Empleado empleado;
	private List<RolEnProyecto> rolesEnProyecto;
	
	public InformacionEmpleado(Empleado empleado){
		this.empleado = empleado;
		this.rolesEnProyecto = new ArrayList<RolEnProyecto>();
	}
	
	public Empleado getEmpleado(){
		return this.empleado;
	}
	
	public List<RolEnProyecto> getRolesEnProyecto(){
		return this.rolesEnProyecto;
	}
	
	public void agregarRol(RolEnProyecto rol){
		this.rolesEnProyecto.add(rol);
	}

}
