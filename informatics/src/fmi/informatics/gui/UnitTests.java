package fmi.informatics.gui;

import javax.swing.*;

import fmi.informatics.gui.PersonDataGUI;

public class UnitTests {
	
	public static void checkColumns(PersonDataGUI test){
        JTable testTable = test.createAndShowGUI();
        
        for (int i = 0; i < 13; i++) {
            if(testTable.getValueAt(i, 4).equals(" - ")){
                System.out.println("The test is successful");
            }
            else{
                System.err.println("The test returns: " + testTable.getValueAt(i,4) + ", but the expected result is: " + " - ");
            }
          }
       }
            
	public static void main(String[] args) {
		PersonDataGUI test = new PersonDataGUI();
		checkColumns(test);
	}
}
