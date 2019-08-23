package ECUtb_java;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTestTest {

        //Arrange - sätta upp testet.
        //Act - Anropa metoden som skall testas
        //Assert - Junit testar resultatet av metodanropet.
        @Test
        public void test_addition(){
            double num1 = 0, num2 = 0;
            double expectedResult = num1+num2;//Arrange

            double actualResult = Calculator.addition(num1, num2);//Act

            Assert.assertEquals(expectedResult, actualResult, 0);//Assert
        }
        @Test
        public void test_minus(){
            double num1 = 0, num2 = 0;
            double expectedResult = num1-num2;
            double actualResult = Calculator.minus(num1, num2);
            Assert.assertEquals(expectedResult, actualResult, 0);
        }
        @Test
        public void test_multi(){
            double num1 = 0, num2 = 0;
            double expectedResult = num1*num2;
            double actualResult = Calculator.multi(num1, num2);
            Assert.assertEquals(expectedResult, actualResult, 0);
        }
        @Test
        public void test_divided(){
            double num1 = 0, num2 = 0;
            double expectedResult = num1/num2;
            double actualResult = Calculator.divided(num1, num2);
            Assert.assertEquals(expectedResult, actualResult, 0);
        }

}
