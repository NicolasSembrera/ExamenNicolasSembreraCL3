package com.Examen.Controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Examen.Modelo.Producto;
import com.Examen.servicios.IProductoServicio;

@Controller
@RequestMapping("/ControlProducto")
public class ProductoController {
	@Autowired
	private IProductoServicio iproductoservicio;

	@GetMapping("/ListaProducto")
	public String ListaProducto(Model model) {
		List<Producto> lista = iproductoservicio.ListadoProducto();
		model.addAttribute("listaproductos", lista);
		return "Vistas/Producto/ListaProducto";
	}

	@GetMapping("/RegistrarProducto")
	public String RegistrarProducto(Model model) {
		Producto producto = new Producto();
		model.addAttribute("productito", producto);
		return "Vistas/Producto/FrmRegistraProducto";
	}

	@PostMapping("/InsertarProducto")
	public String GuardarAuto(@ModelAttribute Producto producto) {
		iproductoservicio.RegistrarProducto(producto);
		return "redirect:/ControlProducto/ListaProducto";
	}

	@GetMapping("/Editar/{id}")
	public String Editar(@PathVariable("id") Integer idProd, Model model) {

		Producto producto = iproductoservicio.BuscarProducto(idProd);

		model.addAttribute("productito", producto);

		return "Vistas/Producto/FrmRegistraProducto";

	} // fin del metodo editar..

	@GetMapping("/Eliminar/{id}")
	public String Eliminar(@PathVariable("id") Integer idProd, Model model) {

		iproductoservicio.EliminarProducto(idProd);
		List<Producto> listado = iproductoservicio.ListadoProducto();

		model.addAttribute("listaproductos", listado);

		return "Vistas/Producto/ListaProducto";

	}

}