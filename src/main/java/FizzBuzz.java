
public class FizzBuzz {


	private static final String TWO = "2";
	private static final String ONE = "1";

	public String fizzBuzzConvertor(int integerTobeChecked)
	{
		if(integerTobeChecked==1)
			return ONE;
	    
		if(integerTobeChecked==2)
		 return TWO;
		
		return String.valueOf(integerTobeChecked);

	}

}
