package proyecto.controller;

import java.util.List;

import proyecto.service.ArregloServicio;
import proyecto.service.SecuenciaServicio;
import proyecto.service.UsuarioServicio;
import proyecto.service.dto.ArregloMedicion;
import proyecto.service.dto.DerivadaModeloMatematico;
import proyecto.service.dto.Imagen;
import proyecto.service.dto.MagnitudArreglo;
import proyecto.service.dto.MagnitudDetalle;
import proyecto.service.dto.ModeloMatematico;
import proyecto.service.dto.SecuenciaDetalle;
import proyecto.service.dto.SecuenciaMedicion;
import proyecto.service.dto.Usuario;

public class Controlador {
	private UsuarioServicio usuarioServicio;
	private ArregloServicio arregloServicio;
	private SecuenciaServicio secuenciaServicio;

	public Controlador(UsuarioServicio usuarioServicio, ArregloServicio arregloServicio,
			SecuenciaServicio secuenciaServicio) {
		this.usuarioServicio = usuarioServicio;
		this.arregloServicio = arregloServicio;
		this.secuenciaServicio = secuenciaServicio;
	}

	public void consultaUsuarios() {
		List<Usuario> usuarios = usuarioServicio.obtenerUsuarios();
		if (usuarios != null) {
			for (Usuario u : usuarios) {
				System.out.println(u);
			}
		}else {
			System.out.println("No hay usuarios definidos");
		}
	}

	public void consultaArreglosPorUsuario(Integer idUsuario) {
		Usuario u = usuarioServicio.obtenerUsuario(idUsuario);
		List<ArregloMedicion> arreglos = arregloServicio.obtenerArreglosMedicion();
		if (arreglos.size() > 0) {
			for (ArregloMedicion a : arreglos) {
				if (a.getIdUsuario().equals(u.getIdUsuario())) {
					System.out.println(a);
				}
			}
		} else {
			System.out.println("El usuario no tiene definiciones");
		}
	}

	public void consultaSecuenciasPorUsuario(Integer idUsuario) {
		Usuario u = usuarioServicio.obtenerUsuario(idUsuario);
		List<SecuenciaMedicion> secuencias = secuenciaServicio.obtenerSecuenciasMedicion();
		if (secuencias.size() > 0) {
			for (SecuenciaMedicion s : secuencias) {
				if (s.getIdUsuario().equals(u.getIdUsuario())) {
					System.out.println(s);
				}
			}
		} else {
			System.out.println("El usuario no tiene definiciones");
		}
	}

	public void consultaInfoArreglo(Integer idArreglo) {
		ArregloMedicion a = arregloServicio.obtenerArregloMedicion(idArreglo);
		if (a != null) {
			System.out.println(a);
			Imagen ia = arregloServicio.obtenerImagen(a.getIdImagen());
			System.out.println(ia);
			ModeloMatematico m = arregloServicio.obtenerModelo(a.getIdArregloMedicion());
			System.out.println(m);
			for (DerivadaModeloMatematico dm : arregloServicio.obtenerDerivadas(m.getIdModeloMatematico())) {
				System.out.println(dm);
			}
			List<MagnitudArreglo> magnitudes = arregloServicio.obtenerMagnitudes(m.getIdModeloMatematico());
			for (MagnitudArreglo ma : magnitudes) {
				System.out.println(ma);
				MagnitudDetalle md = arregloServicio.obtenerMagnitudDetalle(ma.getIdMagnitudArreglo());
				if (md != null) {
					System.out.println(md);
					Imagen id = arregloServicio.obtenerImagen(md.getIdImagen());
					System.out.println(id);
				} else {
					System.out.println("No tiene detalle");
				}
			}
		} else {
			System.out.println("No existe el arreglo");
		}
	}

	public void consultaInfoSecuencia(Integer idSecuencia) {
		SecuenciaMedicion s = secuenciaServicio.obtenerSecuenciaMedicion(idSecuencia);
		if (s != null) {
			System.out.println(s);
			List<SecuenciaDetalle> detalles =secuenciaServicio.obtenerDetallesSecuencia(s.getIdSecuenciaMedicion());
			if (detalles != null) {
				for (SecuenciaDetalle sd : detalles) {
					System.out.println(sd);
				}				
			}else {
				System.out.println("No tiene detalles");
			}
		} else {
			System.out.println("No existe la secuencia");
		}
	}

}
