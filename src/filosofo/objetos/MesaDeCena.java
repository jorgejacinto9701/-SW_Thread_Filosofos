package filosofo.objetos;

import filosofo.gui.Formulario;
import filosofo.util.Constantes;

public class MesaDeCena {

	private Utencilio[] utencilios = new Utencilio[5];

	public MesaDeCena(Formulario formulario) {
		for (int i = 0; i < utencilios.length; i++) {
			utencilios[i] = new Utencilio(i, formulario);
		}
	}

	public void cenar(Filosofo filosofo) {
		if (getExisteUtencilioLibre(filosofo.getIdFilosofo())) {
			chapaCubiertos(filosofo);
			comer(filosofo);
			liberaCubiertos(filosofo);
		}
	}

	private synchronized void chapaCubiertos(Filosofo filosofo) {
		System.out.println("Chapa cubierto " + filosofo.getIdFilosofo());
		//Cambia el estado del Filosofo
		filosofo.setEstado(Constantes.FILOSOFO_HAMBRIENTO);
				
		//Coge un utencilio
		Utencilio utencilio = getUtencioLibre(filosofo.getIdFilosofo());
		utencilio.setIdFilosofo(filosofo.getIdFilosofo());
		utencilio.setEstado(Constantes.UTENCILIO_OCUPADO);
		
		notifyAll();
		
	}

	private synchronized void comer(Filosofo filosofo) {
		System.out.println("comer " + filosofo.getIdFilosofo());
		
		//Cambia su estado a comiendo
		filosofo.setEstado(Constantes.FILOSOFO_COMIENDO);
				
		//Come durante un tiempo
		try {
			Thread.sleep(50 + (int) (Math.random() * 4000.0));
		} catch (Exception e) {
			System.out.println(e);
		}
		
		notifyAll();
	}

	private synchronized void liberaCubiertos(Filosofo filosofo) {
		System.out.println("libera cubierto " + filosofo.getIdFilosofo());
		
		filosofo.setEstado(Constantes.FILOSOFO_PENSANDO);
				
		Utencilio utencilio = getUtencioOcupado(filosofo.getIdFilosofo());
		utencilio.setIdFilosofo(-1);
		utencilio.setEstado(Constantes.UTENCILIO_LIBRE);
		
		
		notifyAll();
		
	}

	private Boolean getExisteUtencilioLibre(Integer idFilosofo) {
		String izquierda = utencilios[(idFilosofo + 4) % 5].getEstado();
		String derecha = utencilios[idFilosofo].getEstado();

		if (izquierda.equals(Constantes.UTENCILIO_OCUPADO)
				&& derecha.equals(Constantes.UTENCILIO_OCUPADO)) {
			return false;
		} else {
			return true;
		}

	}

	private Utencilio getUtencioLibre(Integer idFilosofo) {
		String izquierda = utencilios[(idFilosofo + 4) % 5].getEstado();

		if (izquierda.equals(Constantes.UTENCILIO_LIBRE))
			return utencilios[(idFilosofo + 4) % 5];
		else
			return utencilios[idFilosofo];

	}
	
	private Utencilio getUtencioOcupado(Integer idFilosofo) {
		String estadoIzquierda = utencilios[(idFilosofo + 4) % 5].getEstado();
		Integer idFilosofoIzquierda = utencilios[(idFilosofo + 4) % 5].getIdFilosofo();
		
		String estadoDerecha = utencilios[idFilosofo].getEstado();
		Integer idFilosofoDerecha= utencilios[idFilosofo].getIdFilosofo();
		

		if (estadoIzquierda.equals(Constantes.UTENCILIO_OCUPADO) && idFilosofoIzquierda == idFilosofo )
			return utencilios[(idFilosofo + 4) % 5];
		else if (estadoDerecha.equals(Constantes.UTENCILIO_OCUPADO) && idFilosofoDerecha == idFilosofo )
			return utencilios[idFilosofo];
		else
			return null;

	}
}
