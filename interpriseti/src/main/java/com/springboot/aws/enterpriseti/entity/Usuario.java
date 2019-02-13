package com.springboot.aws.enterpriseti.entity;


import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.SequenceGenerator;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;



@Entity
@Table(name = "USUARIO", schema = "CDEVAWS")
public class Usuario implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Long usuarioId;
	private String usuarioAlias;
	private String usuarioDni;
	private String usuarioEmail;
	private String usuarioNames;
	private String usuarioPassword;

	public Usuario() {
	}

	public Usuario(Long usuarioId) {
		this.usuarioId = usuarioId;
	}

	public Usuario(Long usuarioId, String usuarioAlias, String usuarioDni, String usuarioEmail,
			String usuarioNames, String usuarioPassword) {
		this.usuarioId = usuarioId;
		this.usuarioAlias = usuarioAlias;
		this.usuarioDni = usuarioDni;
		this.usuarioEmail = usuarioEmail;
		this.usuarioNames = usuarioNames;
		this.usuarioPassword = usuarioPassword;
	}

	@Id
	@SequenceGenerator(name="USUARIO_SEQUENCE",sequenceName="usuario_seq")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="USUARIO_SEQUENCE")
	@Column(name = "USUARIO_ID", unique = true, nullable = false, scale = 0)
	public Long getUsuarioId() {
		return this.usuarioId;
	}

	public void setUsuarioId(Long usuarioId) {
		this.usuarioId = usuarioId;
	}

	@Column(name = "USUARIO_ALIAS")
	public String getUsuarioAlias() {
		return this.usuarioAlias;
	}

	public void setUsuarioAlias(String usuarioAlias) {
		this.usuarioAlias = usuarioAlias;
	}

	@Column(name = "USUARIO_DNI")
	public String getUsuarioDni() {
		return this.usuarioDni;
	}

	public void setUsuarioDni(String usuarioDni) {
		this.usuarioDni = usuarioDni;
	}

	@Column(name = "USUARIO_EMAIL")
	public String getUsuarioEmail() {
		return this.usuarioEmail;
	}

	public void setUsuarioEmail(String usuarioEmail) {
		this.usuarioEmail = usuarioEmail;
	}

	@Column(name = "USUARIO_NAMES")
	public String getUsuarioNames() {
		return this.usuarioNames;
	}

	public void setUsuarioNames(String usuarioNames) {
		this.usuarioNames = usuarioNames;
	}

	@Column(name = "USUARIO_PASSWORD")
	public String getUsuarioPassword() {
		return this.usuarioPassword;
	}

	public void setUsuarioPassword(String usuarioPassword) {
		this.usuarioPassword = usuarioPassword;
	}

}
