package ControlDeVersiones;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class ADAControlDeVersiones extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtProducto;
	private JTextField txtCantidad;
	private JTextField txtPrecio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ADAControlDeVersiones frame = new ADAControlDeVersiones();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ADAControlDeVersiones() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 540, 319);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(247, 247, 247));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblProducto = new JLabel("Producto:");
		lblProducto.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblProducto.setBounds(50, 68, 106, 14);
		contentPane.add(lblProducto);
		
		JLabel lblCantidad = new JLabel("Cantidad:");
		lblCantidad.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblCantidad.setBounds(50, 113, 106, 14);
		contentPane.add(lblCantidad);
		
		JLabel lblPrecio = new JLabel("Precio:");
		lblPrecio.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblPrecio.setBounds(50, 154, 106, 14);
		contentPane.add(lblPrecio);
		
		JLabel lblInventario = new JLabel("Inventario de Papelería \"Plumin S.A de C.V\"");
		lblInventario.setBackground(new Color(204, 255, 204));
		lblInventario.setFont(new Font("Wide Latin", Font.PLAIN, 14));
		lblInventario.setBounds(0, 0, 524, 57);
		contentPane.add(lblInventario);
		
		txtProducto = new JTextField();
		txtProducto.setBounds(136, 66, 165, 20);
		contentPane.add(txtProducto);
		txtProducto.setColumns(10);
		
		txtCantidad = new JTextField();
		txtCantidad.setColumns(10);
		txtCantidad.setBounds(136, 111, 165, 20);
		contentPane.add(txtCantidad);
		
		txtPrecio = new JTextField();
		txtPrecio.setColumns(10);
		txtPrecio.setBounds(136, 152, 165, 20);
		contentPane.add(txtPrecio);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.setBackground(new Color(255, 204, 255));
		btnAgregar.setFont(new Font("Arial Black", Font.PLAIN, 12));
		btnAgregar.setBounds(97, 230, 130, 23);
		contentPane.add(btnAgregar);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBackground(new Color(102, 255, 255));
		btnBuscar.setFont(new Font("Arial Black", Font.PLAIN, 12));
		btnBuscar.setBounds(288, 230, 130, 23);
		contentPane.add(btnBuscar);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\JAVIER DURAN\\Downloads\\plimun.jpg"));
		lblNewLabel_2.setBounds(350, 48, 112, 151);
		contentPane.add(lblNewLabel_2);
	}
}
