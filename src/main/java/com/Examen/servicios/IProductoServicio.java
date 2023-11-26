package com.Examen.servicios;

import java.util.List;

import com.Examen.Modelo.Producto;

public interface IProductoServicio {

	public List<Producto> ListadoProducto();
	public void RegistrarProducto(Producto producto);
	public Producto BuscarProducto(Integer Id);
	public void EliminarProducto(Integer Id);
}
