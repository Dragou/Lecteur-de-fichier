import java.io.*;

public class LecteurFichier {
	
//	public LecteurFichier () throws IOException
//	{
//		FileInputStream in = null ;
//		File f = new File (monChemin) ;
//		try 
//		{
//			in = new FileInputStream(f); // ouverture du fichier
//			
//			System.out.println();
//		}
//		finally 
//		{
//			if ( in != null ) 
//			{
//				in.close();
//			}
//		}
//	}
	
	protected String source;
	public LecteurFichier(String source) 
	{
		this.source = source;
	}
	public void lecture() 
	{
		try 
		{
			String ligne ;
			BufferedReader fichier = new BufferedReader(new FileReader(source));
			while ((ligne = fichier.readLine()) != null) 
			{
				System.out.println(ligne);
			}
			fichier.close();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
