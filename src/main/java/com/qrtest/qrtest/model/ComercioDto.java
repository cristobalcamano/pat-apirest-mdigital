package com.qrtest.qrtest.model;

public class ComercioDto {
	
	public ComercioDto() {}

	public ComercioDto(Integer commerceId, String imagen, String nombre, String rut, String[] presupuestoPesos,
			String[] presupuestoUF, String tipoDeMonedaPeso, String tipoDeMonedaUF, String montoMaximoPeso,
			String montoMaximoUF) {
		super();
		this.commerceId = commerceId;
		this.imagen = imagen;
		this.nombre = nombre;
		this.rut = rut;
		this.presupuestoPesos = presupuestoPesos;
		this.presupuestoUF = presupuestoUF;
		this.tipoDeMonedaPeso = tipoDeMonedaPeso;
		this.tipoDeMonedaUF = tipoDeMonedaUF;
		this.montoMaximoPeso = montoMaximoPeso;
		this.montoMaximoUF = montoMaximoUF;
	}

	private Integer commerceId;
	private String imagen;
	private String nombre;
	private String rut;
	private String[] presupuestoPesos;
	private String[] presupuestoUF;
	private String tipoDeMonedaPeso;
	private String tipoDeMonedaUF;
	private String montoMaximoPeso;
	private String montoMaximoUF;
	
	public Integer getCommerceId() {
		return commerceId;
	}
	public void setCommerceId(Integer commerceId) {
		this.commerceId = commerceId;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	public String[] getPresupuestoUF() {
		return presupuestoUF;
	}
	public void setPresupuestoUF(String[] presupuestoUF) {
		this.presupuestoUF = presupuestoUF;
	}
	public String getTipoDeMonedaPeso() {
		return tipoDeMonedaPeso;
	}
	public void setTipoDeMonedaPeso(String tipoDeMonedaPeso) {
		this.tipoDeMonedaPeso = tipoDeMonedaPeso;
	}
	public String getTipoDeMonedaUF() {
		return tipoDeMonedaUF;
	}
	public void setTipoDeMonedaUF(String tipoDeMonedaUF) {
		this.tipoDeMonedaUF = tipoDeMonedaUF;
	}

	public String[] getPresupuestoPesos() {
		return presupuestoPesos;
	}

	public void setPresupuestoPesos(String[] presupuestoPesos) {
		this.presupuestoPesos = presupuestoPesos;
	}

	public String getMontoMaximoPeso() {
		return montoMaximoPeso;
	}

	public void setMontoMaximoPeso(String montoMaximoPeso) {
		this.montoMaximoPeso = montoMaximoPeso;
	}

	public String getMontoMaximoUF() {
		return montoMaximoUF;
	}

	public void setMontoMaximoUF(String montoMaximoUF) {
		this.montoMaximoUF = montoMaximoUF;
	}
	

}
