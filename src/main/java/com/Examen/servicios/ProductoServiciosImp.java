package com.Examen.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Examen.Modelo.Producto;
import com.Examen.Repositorio.IProducto;
@Service
public class ProductoServiciosImp implements IProductoServicio{
	
	@Autowired
	private IProducto iproducto;
	
	@Override
	public List<Producto> ListadoProducto() {
		// TODO Auto-generated method stub
		return  (List<Producto>) iproducto.findAll();
	}

	@Override
	public void RegistrarAuto(Producto producto) {
		// TODO Auto-generated method stub
		iproducto.save(producto);
	}

	@Override
	public Producto BuscarProducto(Integer Id) {
		// TODO Auto-generated method stub
		return iproducto.findById(Id).orElse(null);
	}

	@Override
	public void EliminarProducto(Integer Id) {
		iproducto.deleteById(Id);		
	}

}
