package model;

public class Paciente {
	
	private String nombres;
	private String apellidos;
	private String fechaInicio;
	private Boolean privado;
	
	public Paciente(String nombres, String apellidos, String fechaInicio, Boolean privado) {
		super();
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.fechaInicio = fechaInicio;
		this.privado = privado;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Boolean getPrivado() {
		return privado;
	}

	public void setPrivado(Boolean privado) {
		this.privado = privado;
	}
	
	
}
