package com.promineotech;


import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.params.provider.Arguments.arguments;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.spy;


class TestDemoJUnitTest {
	
	private TestDemo testDemo;
	
	@BeforeEach
	void setUp() throws Exception {
		testDemo = new TestDemo();
	}

	@ParameterizedTest
	 @MethodSource("com.promineotech.TestDemoJUnitTest#argumentsForAddPositive")
	void assertThatTwoPositiveNumbersAreAddedCorrectly(int a, int b, int expected, boolean expectException) {
		if(!expectException) {
			assertThat(testDemo.addPositive(a, b)).isEqualTo(expected);
		} else {
            assertThatThrownBy(() -> testDemo.addPositive(a, b))
                    .isInstanceOf(IllegalArgumentException.class);
        }
	}
	 static Stream<Arguments> argumentsForAddPositive() {
	        return Stream.of(
	                arguments(2, 4, 6, false),
	                arguments(-1, 2, 0, true),
	                arguments(0, 0, 0, true),
	                arguments(5, -3, 0, true)
	                );
	    }
	 @Test
	    void assertThatPairsOfPositiveNumbersAreAddedCorrectly() {
	        // Test cases
	        assertThat(testDemo.addPositive(4, 5)).isEqualTo(9);
	        assertThat(testDemo.addPositive(40, 50)).isEqualTo(90);
	        assertThat(testDemo.addPositive(10, 20)).isEqualTo(30);
	        // Add more test cases as needed
	    }
	 
	 // Test method to verify the correctness of cutInHalf() method
	    @Test
	    void testCutInHalf() {
	        // Given
	        int number = 10;
	        
	        // When
	        int half = testDemo.cutInHalf(number);
	        
	        // Then
	        assertThat(half).isEqualTo(number / 2);
	    }
	    
	    // Test method to verify the correctness of randomNumberSquared() method
	    @Test
	    void assertThatNumberSquaredIsCorrect() {
	    
	        TestDemo mockDemo = spy(testDemo);
	        doReturn(5).when(mockDemo).getRandomInt();

	        int fiveSquared = mockDemo.randomNumberSquared();

	    }
	}


