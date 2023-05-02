package com.cursoceat.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.cursoceat.modell.Libros;

import com.cursoceat.servicios.Validacion;

/**
 * Servlet implementation class Controller
 */
public class Controller extends HttpServlet implements Validacion{
	private static final long serialVersionUID = 1L;
     String mensg=null;
     List<Libros> todLibros = new ArrayList<Libros>() ;
	
	
	
    /**
     * @see HttpServlet#HttpServlet()
     */
   
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String titulo=request.getParameter("titulo");
		String autor=request.getParameter("autor");	
		String isbn=request.getParameter("isbn");
		String descripcion=request.getParameter("descripcion");
		if (validarCant(request.getParameter("cantidad"))) {
			int cantidad=Integer.parseInt(request.getParameter("cantidad"));
			Libros libroN=new Libros(titulo.toUpperCase(),autor.toUpperCase(),isbn,cantidad,descripcion);
			todLibros.add(libroN);
			mensg="El producto se ha creado correctamente";
			request.getSession().setAttribute("mensg", mensg);
			request.getSession().setAttribute("titulo", todLibros);
			
			response.sendRedirect("index.jsp");
		}else {
			mensg="La cantidad debes ser numérica";
			request.setAttribute("mensg", mensg);
		
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
