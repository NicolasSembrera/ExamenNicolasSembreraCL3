package com.Examen.Modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="TBL_PRODUCTOCL3")
public class Producto {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int IDPRODUCTOCL3;
	private String NOBRECL3;
	private double PRECIOVENTACL3;
	private int STOCK;
	private double PRECIOCOMPCL3;
	private String ESTADOCL3;
	private String DESCRIPCL3;
	
	public Producto() {}
	
	public Producto(int IDPRODUCTOCL3, String NOBRECL3, double PRECIOVENTACL3, int STOCK, double PRECIOCOMPCL3,
			String ESTADOCL3, String DESCRIPCL3) {
		super();
		this.IDPRODUCTOCL3 = IDPRODUCTOCL3;
		this.NOBRECL3 = NOBRECL3;
		this.PRECIOVENTACL3 = PRECIOVENTACL3;
		this.STOCK = STOCK;
		this.PRECIOCOMPCL3 = PRECIOCOMPCL3;
		this.ESTADOCL3 = ESTADOCL3;
		this.DESCRIPCL3 = DESCRIPCL3;
	}
	@Override
	public String toString() {
		return "Producto [IDPRODUCTOCL3=" + IDPRODUCTOCL3 + ", NOBRECL3=" + NOBRECL3 + ", PRECIOVENTACL3="
				+ PRECIOVENTACL3 + ", STOCK=" + STOCK + ", PRECIOCOMPCL3=" + PRECIOCOMPCL3 + ", ESTADOCL3=" + ESTADOCL3
				+ ", DESCRIPCL3=" + DESCRIPCL3 + "]";
	}

	public int getIDPRODUCTOCL3() {
		return IDPRODUCTOCL3;
	}
	public void setIDPRODUCTOCL3(int IDPRODUCTOCL3) {
		this.IDPRODUCTOCL3 = IDPRODUCTOCL3;
	}
	public String getNOBRECL3() {
		return NOBRECL3;
	}
	public void setNOBRECL3(String NOBRECL3) {
		this.NOBRECL3 = NOBRECL3;
	}
	public double getPRECIOVENTACL3() {
		return PRECIOVENTACL3;
	}
	public void setPRECIOVENTACL3(double PRECIOVENTACL3) {
		this.PRECIOVENTACL3 = PRECIOVENTACL3;
	}
	public int getSTOCK() {
		return STOCK;
	}
	public void setSTOCK(int STOCK) {
		this.STOCK = STOCK;
	}
	public double getPRECIOCOMPCL3() {
		return PRECIOCOMPCL3;
	}
	public void setPRECIOCOMPCL3(double PRECIOCOMPCL3) {
		this.PRECIOCOMPCL3 = PRECIOCOMPCL3;
	}
	public String getESTADOCL3() {
		return ESTADOCL3;
	}
	public void setESTADOCL3(String ESTADOCL3) {
		this.ESTADOCL3 = ESTADOCL3;
	}
	public String getDESCRIPCL3() {
		return DESCRIPCL3;
	}
	public void setDESCRIPCL3(String DESCRIPCL3) {
		this.DESCRIPCL3 = DESCRIPCL3;
	}
	
}
