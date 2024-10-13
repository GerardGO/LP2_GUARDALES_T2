package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the tbl_proveedorcl2 database table.
 * 
 */
@Entity
@Table(name="tbl_proveedorcl2")
@NamedQuery(name="TblProveedorcl2.findAll", query="SELECT t FROM TblProveedorcl2 t")
public class TblProveedorcl2 implements Serializable {
	private static final long serialVersionUID = 1L;

	private String emailProveedor;

	@Temporal(TemporalType.DATE)
	private Date fecIngresoProveedor;

	@Id
	private int idProveedor;

	private String nomProveedor;

	private String rSocialProveedor;

	private String rucProveedor;

	public TblProveedorcl2() {
	}

	public String getEmailProveedor() {
		return this.emailProveedor;
	}

	public void setEmailProveedor(String emailProveedor) {
		this.emailProveedor = emailProveedor;
	}

	public Date getFecIngresoProveedor() {
		return this.fecIngresoProveedor;
	}

	public void setFecIngresoProveedor(Date fecIngresoProveedor) {
		this.fecIngresoProveedor = fecIngresoProveedor;
	}

	public int getIdProveedor() {
		return this.idProveedor;
	}

	public void setIdProveedor(int idProveedor) {
		this.idProveedor = idProveedor;
	}

	public String getNomProveedor() {
		return this.nomProveedor;
	}

	public void setNomProveedor(String nomProveedor) {
		this.nomProveedor = nomProveedor;
	}

	public String getRSocialProveedor() {
		return this.rSocialProveedor;
	}

	public void setRSocialProveedor(String rSocialProveedor) {
		this.rSocialProveedor = rSocialProveedor;
	}

	public String getRucProveedor() {
		return this.rucProveedor;
	}

	public void setRucProveedor(String rucProveedor) {
		this.rucProveedor = rucProveedor;
	}

}