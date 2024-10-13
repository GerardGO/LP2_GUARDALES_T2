package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tbl_usuariocl2 database table.
 * 
 */
@Entity
@Table(name="tbl_usuariocl2")
@NamedQuery(name="TblUsuariocl2.findAll", query="SELECT t FROM TblUsuariocl2 t")
public class TblUsuariocl2 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idUsuario;

	private String password;

	private String usuario;

	public TblUsuariocl2() {
	}

	public int getIdUsuario() {
		return this.idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsuario() {
		return this.usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

}