package EntidadesDominio;

public class Comentario {
	
	private String descripcion;
	private UsuarioComprador autor;	
	
	public Comentario(String descripcion, UsuarioComprador autor){
		this.descripcion = descripcion;
		this.autor = autor;		
	}
	
	public UsuarioComprador getAutor(){
    	return this.autor;
    }
	
	public String getDescripcion(){
    	return this.descripcion;
    }

}
