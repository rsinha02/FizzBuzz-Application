import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

	FizzBuzz fizzBuzz= new FizzBuzz();

	@Test
	public void shouldReturnOneWhenInputIsOne() 
	{
		Assert.assertEquals("1",fizzBuzz.fizzBuzzConvertor(1));

	}	

	@Test
	public void shouldReturnTwoWhenInputIsTwo() 
	{
		Assert.assertEquals("2",fizzBuzz.fizzBuzzConvertor(2));

	}

}
