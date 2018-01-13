package com.redtiesrobotics.scoutingapp.scoutingapp;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	SQLWorkPlz dao = new SQLWorkPlz();
        try {
			dao.readDataBase();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
