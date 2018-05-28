package EntidadesDominio;

public interface RolUsuarioEmpresaVendedora {
	// Los distintos tipos de usuarios lado empresa que vende productos que intervienen en todo el sistema.
	// Cualquiera de los mismos debe tener una implementación de estos métodos.
	
	public String getLegajo();
	public Cargo getCargo();
	public Area getArea();
	public void modificarSeniority(Seniority seniority);
	public Seniority getSeniority();	

}
