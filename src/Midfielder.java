import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.Scanner;

public class Midfielder extends Squad
{
	 public void UserMidfielders(String username) throws Exception
	  {     
			Scanner input= new Scanner(System.in);
	       	String player ;
	       	Path path = FileSystems.getDefault().getPath("Midfielders.txt");
			File Midfielders = new File(path.toString());
	       	while(Squad.midfielders.size()<5)
	       {
	       		player = input.next();
	       		String newname = check(player,Midfielders);
	       		checkPlayers(newname,Midfielders,username);
	       		if(Squad.PlayerNum<3)
	       		{
	       			checkUserBudget(newname,Midfielders,username);
		       		Squad.midfielders.add(newname);
		       		Squad.squad.add(newname);
	       		}
	       		else 
	       		{
	       			System.out.println("Error you entered the 3 players in the same club");
	       		}
	       		
	       	}
	    
	  }	
	 
	public void add(String username) throws Exception
	{
		Data myfile =new Data() ;
		System.out.println("Add Midfielders:");
		myfile.ReadToMidfielders();
        UserMidfielders(username);
	}
}
