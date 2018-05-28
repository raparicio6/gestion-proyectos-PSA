package EntidadesDominio;

public class Dinero {
	
	private double monto;
	private TipoMoneda tipoMoneda;    

    public Dinero(double monto, TipoMoneda tipoMoneda){
    	this.monto = monto;
    	this.tipoMoneda = tipoMoneda;
    }    
    
    public double getMonto(){
    	return this.monto;
    }
    
    public TipoMoneda getTipoMoneda(){
    	return this.tipoMoneda;
    }
	

}
