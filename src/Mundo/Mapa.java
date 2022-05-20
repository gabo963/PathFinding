package Mundo;

public class Mapa 
{
	private Cell[][] mapa;
	
	public Mapa( int pFilas, int pCols )
	{
		mapa = new Cell[pFilas][pCols];
		
		int iS = Utilities.randInt(0, pFilas-1);
		int jS = Utilities.randInt(0, pCols-1);
		
		mapa[iS][jS] = new Cell( true, false);
		
		int iE = Utilities.randInt(0, pFilas-1);
		int jE = Utilities.randInt(0, pCols-1);
		
		while( (iE == iS) && (jE == jS) )
		{
			iE = Utilities.randInt(0, pFilas-1);
			jE = Utilities.randInt(0, pCols-1);
		}
		
		mapa[iE][jE] = new Cell( false, true);
		
		for( int i = 0; i < mapa.length; i++ )
		{
			for( int j = 0; j < mapa[0].length; j++ )
			{
				if( mapa[i][j] == null )
				{
					mapa[i][j] = new Cell( false, false);
				}
			}
		}
	}
	
	public void convertirBarrera( int pI, int pJ )
	{
		mapa[pI][pJ].volverBarrera();
	}
	
	public boolean esBarrera( int pI, int pJ )
	{
		return mapa[pI][pJ].esBarrera();
	}
	
	public boolean esStart( int pI, int pJ )
	{
		return mapa[pI][pJ].esStart();
	}
	
	public boolean esEnd( int pI, int pJ )
	{
		return mapa[pI][pJ].esEnding();
	}
	
	public Cell[][] darMapa()
	{
		return mapa;
	}

}
