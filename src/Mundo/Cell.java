package Mundo;

public class Cell 
{
	private boolean startPos;
	private boolean endingPos;
	private boolean barrier;
	
	// Para *A pathfinding.
	private int gCost, hCost, fCost;
	
	public Cell( boolean pStartPos, boolean pEndingPos )
	{
		startPos = pStartPos;
		endingPos = pEndingPos;
		barrier = false;
		
		gCost = 0;
		hCost = 0;
		fCost = 0;
	}
	
	public void volverBarrera()
	{
		barrier = !barrier;
	}
	
	public boolean esBarrera()
	{
		return barrier;
	}
	
	public boolean esStart()
	{
		return startPos;
	}
	
	public boolean esEnding()
	{
		return endingPos;
	}
	
	// A*
	
	public int darGCost()
	{
		return gCost;
	}
	
	public int darHCost()
	{
		return hCost;
	}
	
	public int darFCost()
	{
		return fCost;
	}
	
	public void cambiarCosts( int pGCost, int pHCost )
	{
		gCost = pGCost;
		hCost = pHCost;
		fCost = gCost + hCost;
	}
	
	
	
}
