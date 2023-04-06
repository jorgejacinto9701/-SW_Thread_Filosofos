package filosofo.proceso;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import filosofo.gui.Formulario;
import filosofo.objetos.Filosofo;
import filosofo.objetos.MesaDeCena;

public class ProcesoListener implements ActionListener {

	private Formulario formulario;
	
	public ProcesoListener(Formulario formulario) {
		this.formulario = formulario;
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == formulario.btnEmpezarComer){
			
			MesaDeCena dr = new MesaDeCena(formulario);

			Filosofo filosofos[] = { 
					new Filosofo(0, dr, formulario), 
					new Filosofo(1, dr, formulario),
					new Filosofo(2, dr, formulario), 
					new Filosofo(3, dr, formulario),
					new Filosofo(4, dr, formulario) 
					};
			
			
			for (int i = 0; i < filosofos.length; i++)
				new Thread(filosofos[i]).start();
		}
		if(e.getSource() == formulario.btnSalir){
			System.exit(0);
		}
		
	}

}
