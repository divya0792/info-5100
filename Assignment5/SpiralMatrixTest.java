import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertArrayEquals;

public class SpiralMatrixTest {

    @Test
    public void arrangeTestForThree() {
        //Arrange
        int[][] matrix = {{1,2,3},{4,5,6}, {7,8,9}} ;
        Object[] expectedArr = {1,2,3,6,9,8,7,4,5};
        SpiralMatrix spiralMatrix = new SpiralMatrix();

        //Act
        List<Integer> actualList  = spiralMatrix.arrange(matrix);
        Object[] actualArr = actualList.toArray();

        //Assert
        assertArrayEquals(actualList.toArray(), expectedArr);
    }


    @Test
    public void arrangeTestForFour() {
        //Arrange
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}} ;
        Object[] expectedArr = {1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10};
        SpiralMatrix spiralMatrix = new SpiralMatrix();

        //Act
        List<Integer> actualList = spiralMatrix.arrange(matrix);
        Object[] actualArr = actualList.toArray();

        //Assert
        assertArrayEquals(expectedArr, actualArr);
    }

    @Test
    public void arrangeTestForVertical() {
        //Arrange
        int[][] matrix = {{1},{2},{3},{4},{5},{6}} ;
        Object[] expectedArr = {1,2,3,4,5,6};
        SpiralMatrix spiralMatrix = new SpiralMatrix();

        //Act
        List<Integer> actualList = spiralMatrix.arrange(matrix);
        Object[] actualArr = actualList.toArray();

        //Assert
        assertArrayEquals(actualArr, expectedArr);
    }

    @Test
    public void arrangeTestForHorizontal() {
        //Arrange
        int[][] matrix = {{1,2,3,4,5,6}} ;
        Object[] expectedArr = {1,2,3,4,5,6};
        SpiralMatrix spiralMatrix = new SpiralMatrix();

        //Act
        List<Integer> actualList = spiralMatrix.arrange(matrix);
        Object[] actualArr = actualList.toArray();

        //Assert
        assertArrayEquals(expectedArr, actualArr);
    }
    @Test
    public void arrangeTestForDifferent() {
        //Arrange
        int[][] matrix = {{2,5},{8,4},{0,-1}} ;
        Object[] expectedArr = {2,5,4,-1,0,8};
        SpiralMatrix spiralMatrix = new SpiralMatrix();

        //Act
        List<Integer> actualList = spiralMatrix.arrange(matrix);
        Object[] actualArr = actualList.toArray();

        //Assert
        assertArrayEquals(actualArr, expectedArr);
    }
}
