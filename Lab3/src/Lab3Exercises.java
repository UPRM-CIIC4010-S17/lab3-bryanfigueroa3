import javax.swing.JFrame;

public class Lab3Exercises
{
	public static void main(String[] args)
	{
		JFrame myFrame = new JFrame("Bryan Figueroa");
		myFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		myFrame.setLocation(850, 400);
		myFrame.setSize(300, 300);
        MyPanelClass myPanel = new MyPanelClass();
        myFrame.getContentPane().add(myPanel);
		myFrame.setVisible(true);
		
	}
}