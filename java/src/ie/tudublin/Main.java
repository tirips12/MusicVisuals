package ie.tudublin;
import D20123882.AlkimV; 
public class Main
{	
	public void startUI()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new AlkimV());		
	}

	public static void main(String[] args)
	{
		Main main = new Main();
		main.startUI();			
	}
}