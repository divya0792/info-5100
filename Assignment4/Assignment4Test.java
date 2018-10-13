import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;


public class Assignment4Test {
    private Assignment4 assignment4 = new Assignment4();


    @Test
    public void firstUniqCharTestForZeroIndex() {
        //Arrange
        String testString = "leetcode";
        int expectedValue = 0;

        //Assert
        assertEquals(assignment4.firstUniqChar(testString), expectedValue);
    }

    @Test
    public void firstUniqCharTestForOtherThanZeroIndex() {
        //Arrange
        String testString = "loveleetcode";
        int expectedValue = 2;

        //Assert
        assertEquals(assignment4.firstUniqChar(testString), expectedValue);
    }

    @Test
    public void firstUniqCharTestNegative() {
        //Arrange
        String testString = "lleyareyarss";
        int expectedValue = -1;

        //Assert
        assertEquals(assignment4.firstUniqChar(testString), expectedValue);
    }


    @Test
    public void addDigitsTestForTwoDigits() {
        //Arrange
        int num = 38;
        int expectedValue = 2;

        //Assert
        assertEquals(assignment4.addDigits(num), expectedValue);

    }

    @Test
    public void addDigitsTestForfourDigits() {
        //Arrange
        int num = 3890;
        int expectedValue = 2;

        //Assert
        assertEquals(assignment4.addDigits(num), expectedValue);

    }

    @Test
    public void moveZeros() {
        //Arrange
        int[] actualArr = {0,1,2,0,5,0,2,6};
        int[] expectedArr = {1,2,5,2,6,0,0,0};

        //Act
        assignment4.moveZeroes(actualArr);

        //Assert
        assertArrayEquals(actualArr, expectedArr);
    }

    @Test
    public void longestPalindromeTest() {
        //Arrange
        String s = "palindrome";
        String expected = "p";

        //Act
        String actual = assignment4.longestPalindromeUsingMap(s);

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void longestPalindrome() {
        //Arrange
        String s = "pa";
        String expected = "p";

        //Act
        String actual = assignment4.longestPalindrome(s);

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void matrix() {

        int[][] matrix = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};

        assignment4.rotate(matrix);
        System.out.println(matrix);
    }


}
