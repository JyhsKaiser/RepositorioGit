package repositoriogit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author jyhsk
 */
public class Ventana extends JFrame
{

	JLabel nombre;
	JTextField tnombre;

	public Ventana()
	{
		setTitle("Ejemplo");
		setSize(100, 300);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);		
		componentes();
		setVisible(true);

	}

	public void componentes()
	{
		nombre = new JLabel("Nombre");
		nombre.setBounds(50, 50, 100, 30);

		tnombre = new JTextField();
		tnombre.setBounds(150, 50, 100, 30);

		add(nombre);
		add(tnombre);
	}

	public static void main(String[] args)
	{
		new Ventana(); // Añadir el método main para ejecutar la ventana
	}

}
