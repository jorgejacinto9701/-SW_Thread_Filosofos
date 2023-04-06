package filosofo.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import filosofo.proceso.ProcesoListener;

public class Formulario extends JFrame {

	private static final long serialVersionUID = 1L;

	private JPanel pnlSur;

	private JPanel pnlNorte;

	private JPanel pnlCentro;

	private JPanel pnlIzquierda;

	private JPanel pnlDerecha;

	public JButton btnSalir;

	public JButton btnEmpezarComer;

	private JLabel jLabel4;

	private JLabel jLabel5;

	private JLabel lblOcupado;

	private JLabel lblLibre;

	private JLabel lblHambriento;

	private JLabel lblPensando;

	private JLabel lblComiendo;

	private JLabel jLabel3;

	private JLabel jLabel2;

	private JLabel jLabel1;

	private JLabel lblTitulo;

	private JPanel pnlOeste;

	private JLabel[] lblFilosofo;
	
	private JLabel[] lblUtencilio;
	
	private ProcesoListener procesoListener;
	
	public Formulario() {

		this.setSize(625, 453);

		pnlSur = new JPanel();
		GridLayout pnlSurLayout = new GridLayout(1, 2);
		pnlSurLayout.setColumns(2);
		pnlSur.setLayout(pnlSurLayout);
		getContentPane().add(pnlSur, BorderLayout.SOUTH);

		pnlDerecha = new JPanel();
		GridLayout pnlDerechaLayout = new GridLayout(2, 3);
		pnlDerechaLayout.setHgap(10);
		pnlDerechaLayout.setVgap(10);
		pnlDerechaLayout.setColumns(3);
		pnlDerechaLayout.setRows(2);
		pnlDerecha.setLayout(pnlDerechaLayout);
		pnlSur.add(pnlDerecha);
		pnlDerecha.setBorder(BorderFactory.createTitledBorder(new LineBorder(
				new java.awt.Color(0, 0, 255), 1, false),
				"Los Filosofos puede estar", TitledBorder.LEADING,
				TitledBorder.TOP, new java.awt.Font("Dialog", 1, 12),
				new java.awt.Color(0, 0, 255)));
		pnlDerecha.setBackground(new java.awt.Color(255, 255, 255));

		jLabel1 = new JLabel();
		pnlDerecha.add(jLabel1);
		jLabel1.setText("Comiendo");
		jLabel1.setForeground(new java.awt.Color(0, 0, 255));
		jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11));

		jLabel2 = new JLabel();
		pnlDerecha.add(jLabel2);
		jLabel2.setText("Pensando");
		jLabel2.setForeground(new java.awt.Color(0, 0, 255));
		jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11));

		jLabel3 = new JLabel();
		pnlDerecha.add(jLabel3);
		jLabel3.setText("Hambriento");
		jLabel3.setForeground(new java.awt.Color(0, 0, 255));
		jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11));

		lblComiendo = new JLabel();
		pnlDerecha.add(lblComiendo);
		lblComiendo.setBorder(BorderFactory
				.createBevelBorder(BevelBorder.LOWERED));
		lblComiendo.setBackground(new java.awt.Color(0, 255, 0));
		lblComiendo.setOpaque(true);

		lblPensando = new JLabel();
		pnlDerecha.add(lblPensando);
		lblPensando.setBorder(BorderFactory
				.createBevelBorder(BevelBorder.LOWERED));
		lblPensando.setBackground(new java.awt.Color(255, 255, 0));
		lblPensando.setOpaque(true);

		lblHambriento = new JLabel();
		pnlDerecha.add(lblHambriento);
		lblHambriento.setBorder(BorderFactory
				.createBevelBorder(BevelBorder.LOWERED));
		lblHambriento.setBackground(new java.awt.Color(255, 0, 0));
		lblHambriento.setOpaque(true);

		pnlIzquierda = new JPanel();
		GridLayout pnlIzquierdaLayout = new GridLayout(2, 2);
		pnlIzquierdaLayout.setHgap(10);
		pnlIzquierdaLayout.setVgap(10);
		pnlIzquierdaLayout.setColumns(2);
		pnlIzquierdaLayout.setRows(2);
		pnlIzquierda.setLayout(pnlIzquierdaLayout);
		pnlSur.add(pnlIzquierda);
		pnlIzquierda.setEnabled(false);
		pnlIzquierda.setBorder(BorderFactory.createTitledBorder(new LineBorder(
				new java.awt.Color(0, 0, 255), 1, true), "TENEDOR",
				TitledBorder.LEADING, TitledBorder.TOP, new java.awt.Font(
						"Dialog", 1, 12), new java.awt.Color(0, 0, 255)));
		pnlIzquierda.setBackground(new java.awt.Color(255, 255, 255));

		jLabel4 = new JLabel();
		pnlIzquierda.add(jLabel4);
		jLabel4.setText("Libre");
		jLabel4.setBackground(new java.awt.Color(255, 255, 255));
		jLabel4.setForeground(new java.awt.Color(0, 0, 255));
		jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11));

		lblLibre = new JLabel();
		pnlIzquierda.add(lblLibre);
		lblLibre.setText("-");
		lblLibre.setForeground(new java.awt.Color(255, 255, 255));
		lblLibre.setFont(new java.awt.Font("Tahoma", 1, 28));
		lblLibre.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
		lblLibre.setHorizontalTextPosition(SwingConstants.RIGHT);
		lblLibre.setHorizontalAlignment(SwingConstants.CENTER);
		lblLibre.setBackground(new java.awt.Color(0, 0, 255));
		lblLibre.setOpaque(true);

		jLabel5 = new JLabel();
		pnlIzquierda.add(jLabel5);
		jLabel5.setText("Ocupado");
		jLabel5.setBackground(new java.awt.Color(255, 255, 255));
		jLabel5.setForeground(new java.awt.Color(0, 0, 255));
		jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11));

		lblOcupado = new JLabel();
		pnlIzquierda.add(lblOcupado);
		lblOcupado.setText("*");
		lblOcupado.setForeground(new java.awt.Color(255, 255, 255));
		lblOcupado.setFont(new java.awt.Font("Tahoma", 1, 28));
		lblOcupado.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
		lblOcupado.setHorizontalTextPosition(SwingConstants.RIGHT);
		lblOcupado.setHorizontalAlignment(SwingConstants.CENTER);
		lblOcupado.setBackground(new java.awt.Color(0, 0, 255));
		lblOcupado.setOpaque(true);

		pnlNorte = new JPanel();
		BorderLayout pnlNorteLayout = new BorderLayout();
		pnlNorte.setLayout(pnlNorteLayout);
		getContentPane().add(pnlNorte, BorderLayout.NORTH);
		pnlNorte.setPreferredSize(new java.awt.Dimension(581, 36));
		pnlNorte.setFocusable(false);
		pnlNorte.setOpaque(false);
		pnlNorte.setBackground(new java.awt.Color(255, 255, 255));

		lblTitulo = new JLabel();
		pnlNorte.add(lblTitulo, BorderLayout.CENTER);
		lblTitulo.setText("CENA DE LOS FILOSOFOS");
		lblTitulo.setBackground(new java.awt.Color(255, 255, 255));
		lblTitulo.setOpaque(true);
		lblTitulo.setForeground(new java.awt.Color(0, 0, 255));
		lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 28));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setHorizontalTextPosition(SwingConstants.CENTER);
		lblTitulo.setBorder(new LineBorder(new java.awt.Color(0, 0, 255), 1,false));

		pnlCentro = new JPanel();
		pnlCentro.setLayout(null);
		getContentPane().add(pnlCentro, BorderLayout.CENTER);
		pnlCentro.setBackground(new java.awt.Color(0, 0, 255));
		pnlCentro.setBorder(new LineBorder(new java.awt.Color(0, 0, 255), 1,true));
		pnlCentro.setEnabled(false);

		pnlOeste = new JPanel();
		getContentPane().add(pnlOeste, BorderLayout.EAST);

		btnEmpezarComer = new JButton();
		pnlOeste.add(btnEmpezarComer);
		btnEmpezarComer.setText("Empezar a Comer");
		btnEmpezarComer.setBounds(14, 63, 140, 56);
		btnEmpezarComer.setFont(new java.awt.Font("Tahoma", 1, 12));
		btnEmpezarComer.setForeground(new java.awt.Color(0, 0, 255));
		btnEmpezarComer.setBackground(new java.awt.Color(255, 255, 255));

		btnSalir = new JButton();
		pnlOeste.add(btnSalir);
		btnSalir.setText("Salir");
		btnSalir.setBounds(14, 147, 140, 49);
		btnSalir.setFont(new java.awt.Font("Tahoma", 1, 12));
		btnSalir.setForeground(new java.awt.Color(0, 0, 255));
		btnSalir.setBackground(new java.awt.Color(255, 255, 255));

		pnlOeste.setLayout(null);
		pnlOeste.setPreferredSize(new java.awt.Dimension(161, 301));
		pnlOeste.setBackground(new java.awt.Color(255, 255, 255));
		pnlOeste.setBorder(new LineBorder(new java.awt.Color(0, 0, 255), 1,
				false));

		lblFilosofo = new JLabel[5];
		for (int i = 0; i < lblFilosofo.length; i++) {
			lblFilosofo[i] = new JLabel();
			lblFilosofo[i].setOpaque(true);
			lblFilosofo[i].setHorizontalAlignment(0);
			lblFilosofo[i].setText(String.valueOf(i));
			lblFilosofo[i].setBounds(189, 21, 63, 28);
			lblFilosofo[i].setBackground(Color.YELLOW);
			lblFilosofo[i].setFont(new java.awt.Font("Tahoma", 1, 28));
			pnlCentro.add(lblFilosofo[i]);
		}

		lblFilosofo[0].setBounds(189, 21, 63, 28);
		lblFilosofo[1].setBounds(49, 105, 63, 28);
		lblFilosofo[2].setBounds(105, 196, 63, 28);
		lblFilosofo[3].setBounds(273, 196, 63, 28);
		lblFilosofo[4].setBounds(308, 105, 63, 28);
		
		lblUtencilio = new JLabel[5];
		for (int i = 0; i < lblUtencilio.length; i++) {
			lblUtencilio[i] = new JLabel();
			lblUtencilio[i].setOpaque(true);
			lblUtencilio[i].setText("-");
			lblUtencilio[i].setHorizontalAlignment(0);
			lblUtencilio[i].setBackground(new java.awt.Color(0, 0, 255));
			lblUtencilio[i].setFont(new java.awt.Font("Tahoma", 1, 28));
			lblUtencilio[i].setForeground(new java.awt.Color(255, 255, 255));
			lblUtencilio[i].setBorder(BorderFactory.createCompoundBorder(null, null));
			pnlCentro.add(lblUtencilio[i]);
		}
		lblUtencilio[0].setBounds(91, 49, 80, 28);
		lblUtencilio[1].setBounds(56, 147, 80, 28);
		lblUtencilio[2].setBounds(182, 238, 80, 28);
		lblUtencilio[3].setBounds(308, 147, 80, 28);
		lblUtencilio[4].setBounds(273, 49, 80, 28);
		
		procesoListener = new ProcesoListener(this);
		btnEmpezarComer.addActionListener(procesoListener);
		
		setVisible(true);
		setResizable(false);
	}

	
	public void cambioEstadoFilosofo(Integer filosofo,Color color){
		lblFilosofo[filosofo].setBackground(color);
		System.out.println(filosofo + " - "+ color);
	}

	public void cambioEstadoUtencilio(Integer cubierto,Integer idFilososofo, String estado){
		if(idFilososofo ==-1)
			lblUtencilio[cubierto].setText(estado);
		else
			lblUtencilio[cubierto].setText(idFilososofo+ " "+ estado);
		
		System.out.println(cubierto + " - "+ estado);
	}

	public static void main(String[] args) {
		new Formulario();
	}
}
