package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

class StringCalculatorShould {

	private StringCalculator Sc;
	@BeforeEach
	void init() {
		Sc=new StringCalculator();
	}
	
    @Test
    void empty_string_should_return_0() {    
        assertEquals(0, Sc.add(""));
    }

    @Test
    void string_with_single_number_should_return_number_as_int() {     
        assertEquals(1, Sc.add("1"));
    }
    
    @Test
    void string_with_two_number_should_return_number_as_sum() {
        assertEquals(3, Sc.add("1,2"));
    }
    
    @Test
    void string_with_multiple_number_should_return_number_as_sum() {
        assertEquals(13, Sc.add("1,2,10"));
    }
    
    @Test
    void string_with_newline_delimeter_should_return_number_as_sum() {
        assertEquals(13, Sc.add("1,2\n10"));
    }
}
