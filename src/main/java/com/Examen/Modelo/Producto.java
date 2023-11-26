package com.Examen.Modelo;

public class Producto {

	private int IDPRODUCTOCL3;
	private String NOBRECL3;
	private double PRECIOVENTACL3;
	private int STOCK;
	private double PRECIOCOMPCL3;
	private String ESTADOCL3;
	private String DESCRIPCL3;
	
	public Producto() {}
	
	public Producto(int iDPRODUCTOCL3, String nOBRECL3, double pRECIOVENTACL3, int sTOCK, double pRECIOCOMPCL3,
			String eSTADOCL3, String dESCRIPCL3) {
		super();
		IDPRODUCTOCL3 = iDPRODUCTOCL3;
		NOBRECL3 = nOBRECL3;
		PRECIOVENTACL3 = pRECIOVENTACL3;
		STOCK = sTOCK;
		PRECIOCOMPCL3 = pRECIOCOMPCL3;
		ESTADOCL3 = eSTADOCL3;
		DESCRIPCL3 = dESCRIPCL3;
	}
	public int getIDPRODUCTOCL3() {
		return IDPRODUCTOCL3;
	}
	public void setIDPRODUCTOCL3(int iDPRODUCTOCL3) {
		IDPRODUCTOCL3 = iDPRODUCTOCL3;
	}
	public String getNOBRECL3() {
		return NOBRECL3;
	}
	public void setNOBRECL3(String nOBRECL3) {
		NOBRECL3 = nOBRECL3;
	}
	public double getPRECIOVENTACL3() {
		return PRECIOVENTACL3;
	}
	public void setPRECIOVENTACL3(double pRECIOVENTACL3) {
		PRECIOVENTACL3 = pRECIOVENTACL3;
	}
	public int getSTOCK() {
		return STOCK;
	}
	public void setSTOCK(int sTOCK) {
		STOCK = sTOCK;
	}
	public double getPRECIOCOMPCL3() {
		return PRECIOCOMPCL3;
	}
	public void setPRECIOCOMPCL3(double pRECIOCOMPCL3) {
		PRECIOCOMPCL3 = pRECIOCOMPCL3;
	}
	public String getESTADOCL3() {
		return ESTADOCL3;
	}
	public void setESTADOCL3(String eSTADOCL3) {
		ESTADOCL3 = eSTADOCL3;
	}
	public String getDESCRIPCL3() {
		return DESCRIPCL3;
	}
	public void setDESCRIPCL3(String dESCRIPCL3) {
		DESCRIPCL3 = dESCRIPCL3;
	}
	
}
