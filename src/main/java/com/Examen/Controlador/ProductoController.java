package com.Examen.Controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Examen.Modelo.Producto;
import com.Examen.servicios.IProductoServicio;

@Controller
@RequestMapping("/ControlProducto")
public class ProductoController {

	@Autowired
	private IProductoServicio iproductoservicio;

	@GetMapping("/ListaProducto")
	public String ListadoProducto(Model model) {
		List<Producto> lista = iproductoservicio.ListadoProducto();

		model.addAttribute("listaproductos", lista);
		return "Vistas/Producto/ListaProducto";
	}

	@GetMapping("/RegistrarProducto")
	public String RegistrarProducto(Model model) {
		Producto producto = new Producto();
		model.addAttribute("RegistraProducto", producto);
		return "Vistas/Auto/FrmRegistraProducto";
	}

}
