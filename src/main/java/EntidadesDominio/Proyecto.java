package EntidadesDominio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Proyecto {	
 	
    private String identificacion;
    private Date fechaInicio;
    private Date fechaEstimadaFin;
    private List<Comentario> comentarios;
    private List<Fase> fases;
    private List<Requisito> requisitos;
    private Cliente cliente;
    private List<InformacionEmpleado> informacionEmpleados;   
    private Dinero presupuesto;
    private int horasAsignadas;
    private EstadoProyecto estado;
    

    public Proyecto(String identificacion, Date fechaInicio, Date fechaEstimadaFin, Cliente cliente, 
    		Dinero presupuesto, int horasAsignadas, EstadoProyecto estadoInicial) {
        this.identificacion = identificacion;
        this.fechaInicio = fechaInicio;
        this.fechaEstimadaFin = fechaEstimadaFin;
        this.cliente = cliente;
        this.comentarios = new ArrayList<Comentario>();
        this.fases = new ArrayList<Fase>();
        this.requisitos = new ArrayList<Requisito>();
        this.informacionEmpleados = new ArrayList<InformacionEmpleado>();
        this.presupuesto = presupuesto;
        this.horasAsignadas = horasAsignadas;
        this.estado = estadoInicial;
    }    
	
    public String getIdentificacion() {
        return this.identificacion;
    }
    
    public Date getFechaInicio() {
        return this.fechaInicio;
    }
    
    public Date getFechaEstimadaFin() {
        return this.fechaEstimadaFin;
    }
    
    public Cliente getCliente() {
        return this.cliente;
    }
    
    public Dinero getPresupuesto() {
        return this.presupuesto;
    }
    
    public int getHorasAsignadas() {
        return this.horasAsignadas;
    }
    
    public EstadoProyecto getEstado() {
        return this.estado;
    }
    
    public List<Comentario> getComentarios() {
        return this.comentarios;
    }
    
    public List<Fase> getFases() {
        return this.fases;
    }
    
    public List<Requisito> getRequisitos() {
        return this.requisitos;
    }
    
    public List<InformacionEmpleado> getInformacionEmpleados() {
        return this.informacionEmpleados;
    }
    
    public void agregarComentario(Comentario comentario){
    	this.comentarios.add(comentario);
    }
    
    public void agregarFase(Fase fase){
    	this.fases.add(fase);
    }
    
    public void agregarRequisito(Requisito requisito){
    	this.requisitos.add(requisito);
    }
    
    public void agregarInformacionEmpleado(InformacionEmpleado informacionEmpleado){
    	this.informacionEmpleados.add(informacionEmpleado);
    }
    
    public void modificarEstado(EstadoProyecto nuevoEstado){
    	this.estado = nuevoEstado;
    }
    

}
