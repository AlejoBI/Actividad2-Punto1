
package com.uao.actividad2.punto1;


import controller.Controller;
import model.Competencia;
import view.View;

public class Main {
	public static void main(String[] args) {
		// Inicializar MVC
		Competencia competencia = new Competencia("Mundial Pista - Cali");
		Controller controller = new Controller(competencia);
		View view = new View();
		// Delegar interacción con el usuario a la vista
		view.iniciarMenu(controller);
	}
}
