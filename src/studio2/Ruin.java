package studio2;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int startAmount = 10;
		double winChance = 0.5;
		int winLimit = 20;
		int dayRuin = 0;
		int winTime=0;
		int loseTime=0;
		
		while ((startAmount < winLimit) && (startAmount > dayRuin))
		{

			double num = Math.random();
			if (num< winChance)
			{
				//System.out.print("Win!\n");
				startAmount += 1;
				winTime +=1;
			}
			else
			{
				//System.out.print("Lose!\n");
				startAmount -= 1;
				loseTime +=1;
			}
					  
		 }//while
		
		  if (startAmount<=dayRuin)
		  {
			 System.out.print("Day Ruined!Stop Playing!"+"\n");
			 System.out.print("Money Left:"+startAmount+"\n");
			 System.out.print("Total win:"+winTime+"\n");
			 System.out.print("Total lose:"+loseTime+"\n"); 
		  }
		  else
		  {	 
			System.out.print("Total win:"+winTime+"\n");
			System.out.print("Total lose:"+loseTime+"\n");
			System.out.print("Money Left:"+startAmount);
		  }
		  
		  
	} // public void

} // public class
