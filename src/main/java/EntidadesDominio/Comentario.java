package EntidadesDominio;

public class Comentario {
	
	private String descripcion;
	private UsuarioEmpresaVendedora autor;	
	
	public Comentario(String descripcion, UsuarioEmpresaVendedora autor){
		this.descripcion = descripcion;
		this.autor = autor;		
	}
	
	public UsuarioEmpresaVendedora getAutor(){
    	return this.autor;
    }
	
	public String getDescripcion(){
    	return this.descripcion;
    }

}
