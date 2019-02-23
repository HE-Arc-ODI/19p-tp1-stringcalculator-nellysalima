
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import org.junit.Before;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nellysal.jaquet
 */
public class StringCalculatorTest {
    
  private StringCalculatorTest sc;

  @Before
  public void setup(){
  }

  @Test
  public void testAdd0() {
    // Arrange
    StringCalculator sc = new StringCalculator(0);
    String numbers = null;    
    
    // Act
    int expected;
    expected = sc.add(numbers);
    
    // Assert
    assertThat(expected, is(0));
   
  }



}
    

