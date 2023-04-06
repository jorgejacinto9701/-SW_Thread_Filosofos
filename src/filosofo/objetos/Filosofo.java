package filosofo.objetos;

import java.awt.Color;

import filosofo.gui.Formulario;
import filosofo.util.Constantes;

public class Filosofo implements Runnable {

	private Integer idFilosofo;

	private MesaDeCena mesaDeCena;
	
	private Formulario formulario;
	
	private Integer estado = Constantes.FILOSOFO_PENSANDO;

	public Integer getEstado() {
		return estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
		if(estado == Constantes.FILOSOFO_PENSANDO)
			formulario.cambioEstadoFilosofo(idFilosofo,Color.YELLOW);
		else if(estado == Constantes.FILOSOFO_COMIENDO)
			formulario.cambioEstadoFilosofo(idFilosofo,Color.GREEN);
		else if(estado == Constantes.FILOSOFO_HAMBRIENTO)
			formulario.cambioEstadoFilosofo(idFilosofo,Color.RED);
	}

	public Filosofo(Integer idFilosofo, 
					MesaDeCena mesaDeCena, 
					Formulario formulario) {
		this.idFilosofo = idFilosofo;
		this.mesaDeCena = mesaDeCena;
		this.formulario = formulario;
	}

	public void pensando() {
		setEstado(Constantes.FILOSOFO_PENSANDO);
		try {
			Thread.sleep(50 + (int) (Math.random() * 2500.0));
		} catch (Exception e) {
		}
	}

	public void run() {
		for (int i = 0; i < 3; i++) {
			pensando();
			mesaDeCena.cenar(this);
		}
	}

	public Integer getIdFilosofo() {
		return idFilosofo;
	}

	public void setIdFilosofo(Integer idFilosofo) {
		this.idFilosofo = idFilosofo;
	}


}