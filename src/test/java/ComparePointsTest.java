import org.junit.Assert;
import org.junit.Test;

public class ComparePointsTest {

	@Test
	public void shouldReturnNE() {
		ComparePoints underTest = new ComparePoints(); //arrange
		String result = underTest.findDirection("0,0,1,5"); //act
		Assert.assertEquals("NE", result); //assert
	}
	@Test
	public void shouldReturnHere() {
		ComparePoints underTest = new ComparePoints(); //arrange
		String result = underTest.findDirection("12,13,12,13"); //act
		Assert.assertEquals("Here", result); //assert
	}
	@Test
	public void shouldReturnN() {
		ComparePoints underTest = new ComparePoints(); //arrange
		String result = underTest.findDirection("0,1,0,5"); //act
		Assert.assertEquals("N", result); //assert
	}
	@Test
	public void shouldReturnS() {
		ComparePoints underTest = new ComparePoints(); //arrange
		String result = underTest.findDirection("0,1,0,0"); //act
		Assert.assertEquals("S", result); //assert
	}
	@Test
	public void shouldReturnNW() {
		ComparePoints underTest = new ComparePoints(); //arrange
		String result = underTest.findDirection("5,5,1,6"); //act
		Assert.assertEquals("NW", result); //assert
	}
	@Test
	public void shouldReturnSE() {
		ComparePoints underTest = new ComparePoints(); //arrange
		String result = underTest.findDirection("5,5,6,3"); //act
		Assert.assertEquals("SE", result); //assert
	}
	@Test
	public void shouldReturnSW() {
		ComparePoints underTest = new ComparePoints(); //arrange
		String result = underTest.findDirection("5,5,3,3"); //act
		Assert.assertEquals("SW", result); //assert
	}
	
	
}