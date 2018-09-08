package solid;

import static org.junit.Assert.assertTrue;


import org.junit.Test;

public class TempTest {


	@Test
	public void option1() {
	      System.out.println("Conversion de celsius a fahrenheit");
	      Celsius cn= new Celsius();
			assertTrue(cn.cTof(50)==122);
	
	}

	@Test
	public void option2(){
	 System.out.println("Conversion de celsius a kelvin");
    Celsius cn= new Celsius();
		assertTrue(cn.cTok(100)==373.15);

}
	@Test
	public void option3() {
		 System.out.println("Conversion de fahrenheit a celsius");
		    Fahrenheit cn= new Fahrenheit();
				assertTrue(cn.fToc(100)==37.77777777777778);
	}
	
	@Test
	public void option4() {
		 System.out.println("Conversion de fahrenheit a kelvin");
		    Fahrenheit cn= new Fahrenheit();
				assertTrue(cn.fTok(1996)==1364.261111111111);
			}
	
	@Test
	public void option5() {
		 System.out.println("Conversion de kelvin a celsius");
		    Kelvin cn= new Kelvin();
				assertTrue(cn.kToc(1825)==1551.85);
	}
	
	@Test
	public void option6() {
		 System.out.println("Conversion de kelvin a fahrenheit");
		    Kelvin cn= new Kelvin();
				assertTrue(cn.kTof(2595)== 4211.33);
	}
}