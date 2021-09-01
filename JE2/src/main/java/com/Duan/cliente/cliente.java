package com.Duan.cliente;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="clie")
public class cliente {
	@Id
	@Column(name="cliente_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer cliente_id;
	@Column(name="nombre_Usuario",nullable=false)
	private String nombre_Usuario;
	@Column(name="contrasenia",nullable=false)
	private String contrasenia;
	@Column(name="nombre",nullable=false)
	private String nombre;
	@Column(name="apellidos",nullable=false)
	private String apellidos;
	@Column(name="correo_electronico",nullable=false)
	private String correo_electronico;
	@Column(name="edad",nullable=false)
	private Integer edad;
	@Column(name="estatura",nullable=false)
	private float estatura;
	@Column(name="peso",nullable=false)
	private float peso;
	@Column(name="imc",nullable=false)
	private float imc;
	@Column(name="geb",nullable=false)
	private float geb;
	@Column(name="eta",nullable=false)
	private float eta;
	@Column(name="fecha_creacion",nullable=false)
	private Date fecha_creacion;
	@Column(name="actualizacion",nullable=false)
	private Date actualizacion;
	
	public Integer getCliente_id() {
		return cliente_id;
	}
	public void setCliente_id(Integer cliente_id) {
		this.cliente_id = cliente_id;
	}
	public String getNombre_Usuario() {
		return nombre_Usuario;
	}
	public void setNombre_Usuario(String nombre_Usuario) {
		this.nombre_Usuario = nombre_Usuario;
	}
	public String getContrasenia() {
		return contrasenia;
	}
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getCorreo_electronico() {
		return correo_electronico;
	}
	public void setCorreo_electronico(String correo_electronico) {
		this.correo_electronico = correo_electronico;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	public float getEstatura() {
		return estatura;
	}
	public void setEstatura(float estatura) {
		this.estatura = estatura;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public float getImc() {
		return imc;
	}
	public void setImc(float imc) {
		this.imc = imc;
	}
	public float getGeb() {
		return geb;
	}
	public void setGeb(float geb) {
		this.geb = geb;
	}
	public float getEta() {
		return eta;
	}
	public void setEta(float eta) {
		this.eta = eta;
	}
	public Date getFecha_creacion() {
		return fecha_creacion;
	}
	public void setFecha_creacion(Date fecha_creacion) {
		this.fecha_creacion = fecha_creacion;
	}
	public Date getActualizacion() {
		return actualizacion;
	}
	public void setActualizacion(Date actualizacion) {
		this.actualizacion = actualizacion;
	}
}
