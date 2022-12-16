import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

public class CalculatorParameterizedTest {

    @ParameterizedTest
    @ValueSource(strings ={"Java","Js","Ts"})
    void case1( String arg){

        Assertions.assertFalse(arg.isEmpty());
    }

    @ParameterizedTest
    @ValueSource(ints = {3,6,9})
    void case1( int num){

        Assertions.assertEquals(0, num % 3);
    }

    @ParameterizedTest
    @ValueSource(strings ={"Java","Js","Ts"})
 //  @EmptySource   //""
 //  @NullSource   //null
    @NullAndEmptySource
    void case3( String arg){

        Assertions.assertFalse(arg.isEmpty());
    }

    @ParameterizedTest
    @MethodSource("stringProvider")
    void case2( String arg){

        Assertions.assertFalse(arg.isEmpty());
    }

    static String[] stringProvider(){
        return new String[] {"Java","Js", "Ts"};
    }


    @ParameterizedTest
    @CsvSource({
            "10, 20, 30",
            "20, 30, 50",
            "100, 200, 500"
    })
    void testCase5(int num1, int num2, int result){
     Assertions.assertEquals(result, Calculator.add(num1,num2));
    }


    @ParameterizedTest
    @CsvFileSource(resources="/sample-data.csv",numLinesToSkip = 1)
    void testCase6(int num1, int num2, int result){
        Assertions.assertEquals(result, Calculator.add(num1,num2));
    }

}
