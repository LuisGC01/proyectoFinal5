package proyecto;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import proyecto.controller.Controlador;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(ApplicationConfig.class);
		context.refresh();
		
		Controlador controlador = (Controlador) context.getBean("controlador");
		controlador.consultaUsuarios();
		controlador.consultaArreglosPorUsuario(1);
		controlador.consultaSecuenciasPorUsuario(2);
		controlador.consultaInfoArreglo(1);
		controlador.consultaInfoSecuencia(1);
		context.close();
	}

}
