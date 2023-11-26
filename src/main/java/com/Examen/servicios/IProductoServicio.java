package com.Examen.servicios;

import java.util.List;

import com.Examen.Modelo.Producto;

public interface IProductoServicio {

	public List<Producto> ListadoProducto();
	public void RegistrarAuto(Producto producto);
	public Producto BuscarProducto(Integer Id);
	public void EliminarAuto(Integer Id);
}
