package Interfaz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import Mundo.Cell;

@SuppressWarnings("serial")
public class PanelMapa extends JPanel implements ActionListener
{
	
	private InterfazPathFinding main;
	
	public PanelMapa( InterfazPathFinding pMain, Cell[][] mapa )
	{
		main = pMain;
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		
		
	}

}
