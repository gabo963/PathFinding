package Interfaz;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.UIManager;

import Mundo.Mapa;

@SuppressWarnings("serial")
public class InterfazPathFinding extends JFrame
{

	private Mapa mundo;
	
	public InterfazPathFinding() throws Exception
	{
		setTitle("Path Finding") ;
		setSize(1000,1000);
		setResizable(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
	}
	
	public void iniciarMapa( int pFilas, int pCols)
	{
		mundo = new Mapa( pFilas, pCols );
	}
	
	public static void main(String[] args) 
	{
		try
		{
			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
			InterfazPathFinding interfaz = new InterfazPathFinding();
			interfaz.setVisible(true);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

	}

}
