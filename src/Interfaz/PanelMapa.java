package Interfaz;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import Mundo.Cell;

@SuppressWarnings("serial")
public class PanelMapa extends JPanel implements ActionListener
{
	
	private InterfazPathFinding main;
	private JButton[][] botones;
	
	public PanelMapa( InterfazPathFinding pMain )
	{
		main = pMain;
	}
	
	public void inicializar( Cell[][] mapa )
	{
		
		setLayout( new GridLayout( mapa.length, mapa[0].length ) );
		botones = new JButton[mapa.length][mapa[0].length];
		
		for( int i = 0; i < botones.length; i++ )
		{
			for( int j = 0; j < botones[0].length; j++ )
			{
				botones[i][j] = new JButton();
				botones[i][j].setActionCommand( i+","+j);
				botones[i][j].addActionListener(this);
				
				// Formato Botones.
				
				botones[i][j].setBackground( Color.white );
				
				if( mapa[i][j].esStart() )
				{
					botones[i][j].setText("Start");
					botones[i][j].setBackground( Color.CYAN );
				}
				
				if( mapa[i][j].esEnding() )
				{
					botones[i][j].setText("Ending");
					botones[i][j].setBackground( Color.CYAN );
				}
				
				add(botones[i][j]);
			}
		}
		
		updateUI();
		revalidate();
		repaint();
		
	}
	
	public void actualizar( Cell[][] mapa )
	{
		
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		
		
	}

}
