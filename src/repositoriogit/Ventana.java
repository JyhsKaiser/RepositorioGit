package repositoriogit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author jyhsk
 */
public class Ventana extends JFrame
{

	JPanel panelMain;
	JLabel nombre;
	JTextField tnombre;

	public Ventana()
	{
		setTitle("Ejemplo");
		setSize(300, 300);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);		
		setResizable(false);
		componentes();
		setVisible(true);

	}

	public void componentes()
	{
		panelMain = new JPanel();
		panelMain.setBounds(300,300,300,300);
		panelMain.setLayout(null);
		
		nombre = new JLabel("Nombre");
		nombre.setBounds(50, 50, 100, 30);

		tnombre = new JTextField();
		tnombre.setBounds(150, 50, 100, 30);

		add(panelMain);
		add(nombre);
		add(tnombre);
		
	}

	public static void main(String[] args)
	{
		new Ventana(); // Añadir el método main para ejecutar la ventana
	}

}
