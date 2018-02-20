//
// MyFrameClass
// the purpose of this method is to represetn information in the my frame class
//
// Author: Nekesa Mercy
// Date: 12/01/16
//
package lab7Package;
import javax.swing.*;
import java.awt.*;

public class MyFrameClass extends JFrame
{
	private FlowLayout frameLayout;				// an attribute that is of FlowLayout type
	private MyPanelClass firstPanel;
	
	public MyFrameClass( )
	{
        //create frame layout 
        frameLayout = new FlowLayout();
        setLayout(frameLayout);
        
        //create panel layout and add it to the framework
        firstPanel = new MyPanelClass();
        add(firstPanel);
        
		// define parameters for the frame
		setTitle("Lab7 Frame for Nekesa Mercy");
		setSize(400,300);
		setLocation(50,50);
		
        //terminate program on close of frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		
       	// show frame on screen
        setVisible(true);	
        

        
		
	}// end MyFrameClass constructor 


	
	
}// end MyFrameClass
