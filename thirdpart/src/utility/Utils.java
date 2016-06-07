package utility;

import model.Cricket;

public class Utils 
{

	
	public static Cricket doWork(String name)
	{
		
		Cricket cricketer = new Cricket();
		cricketer.setPlayerName(name);
		if(name.equals("sachin"))
		{
			cricketer.setIplScore(100);

			cricketer.setOneDayScore(200);
			
			cricketer.setTestScore(248);
		}
		else if(name.equals("kohli"))
		{
			
			cricketer.setIplScore(200);
			cricketer.setOneDayScore(180);
			cricketer.setTestScore(150);
		}
		else
		{
			return null;
		}
		
		
		return cricketer;
	}
	
}
