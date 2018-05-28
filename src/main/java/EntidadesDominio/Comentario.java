package EntidadesDominio;

public class Comentario {
	
	private String descripcion;
	private Usuario autor;	
	
	public Comentario(String descripcion, Usuario autor){
		this.descripcion = descripcion;
		this.autor = autor;		
	}
	
	public Usuario getAutor(){
    	return this.autor;
    }
	
	public String getDescripcion(){
    	return this.descripcion;
    }

}
