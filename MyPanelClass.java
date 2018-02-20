//
// MyPanelClass
// the purpose of this method is to represent  information in the MyPannel class
//
// Author: Nekesa Mercy
// Date: 12/01/16
//
package lab7Package;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyPanelClass extends JPanel implements ActionListener
{
	private BorderLayout borderLayout;
	
	private JButton b1;
	private JButton b2;
	private Color currentColor;
	
	private JLabel northLabel;
	private JLabel southLabel;
	private JLabel centerLabel;
	
	

	
	//
	//	MyPanelClass
	//
	//	The purpose of this method is to initialize all attributes.
	//	Attributes in this class and also inherited attributes must
	//	be initialized.
	//
	//	Input:	none
	//	Return:	none
	//
	public MyPanelClass()
	{
		// create the layout manager and assign it to the panel
		borderLayout = new BorderLayout();
		setLayout(borderLayout);
		
		// create the first button and put it on the panel
		b1 = new JButton("B1");
		add(b1);
		
		// specify the properties of the first button
		b1.setBackground(Color.red);
		b1.setForeground(Color.white);
		
		// create the second button and put it on the panel
		b2 = new JButton("B2");
		add(b2);
		
		// specify the properties of the second button
		b2.setBackground(Color.blue);
		b2.setForeground(Color.white);
		
		//specify where the buttons should be 
		add(b1,BorderLayout.EAST);
		add(b2,BorderLayout.WEST);
		
		// create your labels
		northLabel = new JLabel("North Section");
		southLabel = new JLabel("South Section");
		centerLabel = new JLabel("Center Section");
		
		// add the labels
		add(northLabel, BorderLayout.NORTH);
		add(southLabel, BorderLayout.SOUTH);		
		add(centerLabel, BorderLayout.CENTER);

		// add an action listener for button 1
		b1.addActionListener(this);
		
		// add an action listener for button 2
		b2.addActionListener(this);
		
		//initialize the color attribute 
		currentColor = Color.green;

		
	}// end MyPanelClass constructor
	
	//
	//	actionPerformed
	//
	//	This is the event handler for the ActionEvents
	//
	//	Input:	e		the action event
	//	Return:	none
	//
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == b1)
		{
			System.out.println("B1 was pushed!");
		}

		else if (e.getSource() == b2)
		{
			System.out.println("B2 was pushed!");
			
			toggleColor( );
		}
		else
		{
			System.out.println("Unexpected Action Event in MyPanelClass");
		}

	}// end actionPerformed
	
	//
	//	toggleColor
	//
	//	the purpose of this method is to toggle the background
	//	color of the panel between green and blue
	//
	//	Input:	none
	//	REturn:	none
	//
	
	public void toggleColor()
	{
		if (currentColor == Color.green)
		{
			currentColor = Color.blue;
			
			
		}
		else
		{
			currentColor = Color.green;
			
			
		}
		
		setBackground(currentColor);
		
		
		
	}// end toggleColor
	



	
}// end MyPanelClass


