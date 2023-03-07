import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.*;

public class test
{
	
	testing_class test_case = new testing_class();
	
	//					   [0]    [1]    [2]      [3]
	String[] nameList = {"John","David","Matt","Nicholas"};
	
	String[] nameListAllUpperCase = {"JOHN","DAVID","MATT","NICHOLAS"};

	@Test
	public void testCases1() 
	{
		int indexNumber = 0;
		String name = "John";
		assertEquals(indexNumber, test_case.lastOccuredAt(nameList, name));
	}
	@Test
	public void testCases2() 
	{
		int indexNumber = 0;
		String name = "john";
		assertEquals(indexNumber, test_case.lastOccuredAt(nameList, name));
	}
	@Test
	public void testCases3() 
	{
		int indexNumber = 1;
		String name = "David";
		assertEquals(indexNumber, test_case.lastOccuredAt(nameList, name));
	}	
	@Test
	public void testCases4() 
	{
		int indexNumber = 1;
		String name = "david";
		assertEquals(indexNumber, test_case.lastOccuredAt(nameList, name));
	}
	@Test
	public void testCases5() 
	{
		int indexNumber = 2;
		String name = "Matt";
		assertEquals(indexNumber, test_case.lastOccuredAt(nameList, name));
	}	
	@Test
	public void testCases6() 
	{
		int indexNumber = 2;
		String name = "matt";
		assertEquals(indexNumber, test_case.lastOccuredAt(nameList, name));
	}	
	@Test
	public void testCases7() 
	{
		int indexNumber = 3;
		String name = "Nicholas";
		assertEquals(indexNumber, test_case.lastOccuredAt(nameList, name));
	}	
	@Test
	public void testCases8() 
	{
		int indexNumber = 3;
		String name = "nicholas";
		assertEquals(indexNumber, test_case.lastOccuredAt(nameList, name));
	}	
	
	@Test
	public void testCases1Upper() {
		int indexNumber = 0;
		String name = "John";
		assertEquals(indexNumber, test_case.lastOccuredAt(nameListAllUpperCase, name));
	}
	@Test
	public void testCases2Upper() {
		int indexNumber = 0;
		String name = "john";
		assertEquals(indexNumber, test_case.lastOccuredAt(nameListAllUpperCase, name));
	}
	@Test
	public void testCases3Upper() {
		int indexNumber = 1;
		String name = "David";
		assertEquals(indexNumber, test_case.lastOccuredAt(nameListAllUpperCase, name));
	}
    @Test
	public void testCases4Upper() {
		int indexNumber = 1;
		String name = "david";
		assertEquals(indexNumber, test_case.lastOccuredAt(nameListAllUpperCase, name));
	}
	@Test
    public void testCases5Upper() {
		int indexNumber = 2;
		String name = "Matt";
		assertEquals(indexNumber, test_case.lastOccuredAt(nameListAllUpperCase, name));
	}
	@Test
	public void testCases6Upper() {
		int indexNumber = 2;
		String name = "matt";
		assertEquals(indexNumber, test_case.lastOccuredAt(nameListAllUpperCase, name));
	}
	@Test
	public void testCases7Upper() {
		int indexNumber = 3;
		String name = "Nicholas";
		assertEquals(indexNumber, test_case.lastOccuredAt(nameListAllUpperCase, name));
	}
	@Test
	public void testCases8Upper() {
		int indexNumber = 3;
		String name = "nicholas";
		assertEquals(indexNumber, test_case.lastOccuredAt(nameListAllUpperCase, name));
	}

}
	