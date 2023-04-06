package filosofo.objetos;

import filosofo.gui.Formulario;
import filosofo.util.Constantes;

public class Utencilio {

	
	private Integer idUtencilio;
	
	private String estado = Constantes.UTENCILIO_LIBRE ;
	
	private Integer idFilosofo = -1;

	private Formulario formulario;
	
	public Utencilio(Integer idUtencilio, Formulario formulario) {
		this.idUtencilio = idUtencilio;
		this.formulario = formulario;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		formulario.cambioEstadoUtencilio(idUtencilio,idFilosofo,estado);
		this.estado = estado;
	}

	public Integer getIdUtencilio() {
		return idUtencilio;
	}

	public void setIdUtencilio(Integer idUtencilio) {
		this.idUtencilio = idUtencilio;
	}

	public Integer getIdFilosofo() {
		return idFilosofo;
	}

	public void setIdFilosofo(Integer idFilosofo) {
		this.idFilosofo = idFilosofo;
	}
	
}
