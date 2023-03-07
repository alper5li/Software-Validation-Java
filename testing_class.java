import java.util.Locale;
import java.util.*;
public class testing_class {


	Locale ENGLISH = Locale.forLanguageTag("en");
	
	public int lastOccuredAt(String[]names, String name)
	{
		for (int i=0;i<=names.length-1;i++) 
		{
			
			if (names[i].toLowerCase(ENGLISH).equals(name.toLowerCase(ENGLISH)))
			{
				
				return i;
			}	
		}
		
		
		return -1;
	}
	

}



