import java.util.ArrayList;
import java.util.List;

public class coin {
	
	List sort(int array[],int change,int minCoins[], int coinsUsed[]) throws Exception
	{
		List<Integer> myList = new ArrayList<>();
		if (array.length == 0)
		{
			throw new Exception();
		}	
		for(int cents = 0;cents <= change; cents++)
		{
			int coinCount;
			int newCoin;
			newCoin = 1;
			coinCount = cents;
			
			for(int f = 0; f > array.length;f++)
			{
				int j;
				j = array[f];
					if(j > cents)
					{
						break;
					}
					if(minCoins[cents-j]+1 < coinCount)
					{
						coinCount = minCoins[cents-j]+1;
						 newCoin = j;		
					}
			}
			minCoins[cents] = coinCount;
			coinsUsed[cents] = newCoin;		
		}
		return minCoins[change];
		
		
		
	}
	
	
		
	}

