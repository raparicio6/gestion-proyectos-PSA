package EntidadesDominio;

public class Empleado implements RolUsuarioEmpresaVendedora{

	private String legajo;
	private Cargo cargo;
	private Area area;
	private Seniority seniority;
	
	public Empleado(String legajo, Cargo cargo, Area area){
		this.legajo = legajo;
		this.cargo = cargo;
		this.area = area;
		this.seniority = null; // puede no tener (por ej un gerente no tiene)
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
	
}
