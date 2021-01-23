package test;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import main.Program;
public class TestProgram {

//--------------------------------------------------------
	
  @Test(dataProvider = "integerProvider")
  public void integerTest(int n, int expected) {
	  assertEquals(Program.integerTask(n), expected);
  }
  
  @DataProvider
  public Object[][] integerProvider(){
	  return new Object[][] {{3601, 60}, {-5, -1}};
  }
  
//--------------------------------------------------------
 
  @Test(dataProvider = "booleanProvider")
  public void booleanTest(int a, int b, int c, boolean expected) {
	  assertEquals(Program.booleanTask(a,b,c), expected);
  }
  
  @DataProvider
  public Object[][] booleanProvider(){
	  return new Object[][] { {-3, 3, 5, true}, {-5, 6, -1, false}};
  }
  
//-------------------------------------------------------- 
  
  @Test(dataProvider = "ifProvider")
  public void ifTest(int[] numbers, int expected) {
	  assertEquals(Program.ifTask(numbers), expected);
  }
  
  @DataProvider
  public Object[][] ifProvider(){
	  int[] case1 = {1, 2, 3, 4, 5},
			case2 = {1, 2, 3, 4},
			case3 = {1, 2, 1, 1};
	  return new Object[][] { {case1, -1}, {case2, -1}, {case3, 2}};
  }
  
//--------------------------------------------------------
  
  @Test(dataProvider = "caseProvider")
  public void caseTest(int year, String expected) {
	  assertEquals(Program.caseTask(year), expected);
  }
  
  @DataProvider
  public Object[][] caseProvider(){
	  return new Object[][] { {1980, "The year of black pig"},
		  				      {2020, "The year of yellow rabbit"},
		  				      {-5, "Invalid data"} };
  }
  
//--------------------------------------------------------
  
  @Test(dataProvider = "forProvider")
  public void forTest(int n, int expected) {
	  assertEquals(Program.forTask(n), expected);
  }
  
  @DataProvider
  public Object[][] forProvider(){
	  return new Object[][] { {-5, -1}, {0, 1}, {5, 120} };
  }
  
//--------------------------------------------------------
  
  @Test(dataProvider = "whileProvider")
  public void whileTest(int n, int expected) {
	  assertEquals(Program.whileTask(n), expected);
  }
  
  @DataProvider
  public Object[][] whileProvider(){
	  return new Object[][] { {-5, -1}, {0, 0}, {1234, 4321} };
  }
  
//--------------------------------------------------------
  
  @Test(dataProvider = "minMaxProvider")
  public void minMaxTest(int[] n, int expected) {
	  assertEquals(Program.minMaxTask(n), expected);
  }
  
  @DataProvider
  public Object[][] minMaxProvider(){
	  int[] case1 = {1, 5, 4, 7, 9, 11},
			case2 = {1, 1, 1, 4, 1, 1};
	  return new Object[][] { {case1, 1},
		  					  {case2, 5} };
  }
  
//--------------------------------------------------------  
  @Test(dataProvider = "arrayProvider")
  public void arrayTest(int[] n, int expected) {
	  assertEquals(Program.arrayTask(n), expected);
  }
  
  @DataProvider
  public Object[][] arrayProvider(){
	  int[] case1 = {1, 5, 4, 7, 9, 11},
			case2 = {11, 9, 7, 4, 5, 1},
			case3 = {1, 2, 4, 3, 11, 2};
	  return new Object[][] { {case1, 5},
		  					  {case2, -1},
		  					  {case3, -1} };
  }
  
//--------------------------------------------------------
  @Test(dataProvider = "matrixProvider")
  public void matrixTest(int[][] n, int[] expected) {
	  assertEquals(Program.matrixTask(n), expected);
  }
  
  @DataProvider
  public Object[][] matrixProvider(){
		int[][] case1 = {{ 1,  2, 3,  4, 5,  6, 7,  8, 9},
						 { 9,  8, 7,  6, 5,  4, 3,  2, 1},
						 { 1,  1, 1,  1, 1,  1, 1,  1, 1},
						 { 2, -2, 2, -2, 2, -2, 2, -2, 2 }};
		int[] expected = {45, 45, 9, 2}; 
	  return new Object[][] { {case1, expected}};
  }
  
//--------------------------------------------------------

}
