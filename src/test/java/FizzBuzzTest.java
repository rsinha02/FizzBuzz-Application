import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;


import org.junit.runner.RunWith;


import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class FizzBuzzTest {

	FizzBuzz fizzBuzz= new FizzBuzz();


	
	 @Test
	@Parameters({"4,4"})
	public void shouldReturnSameOutputAsInput(int input, String output)
	{
	 Assert.assertEquals( output, fizzBuzz.fizzBuzzConvertor(input));
	}


}