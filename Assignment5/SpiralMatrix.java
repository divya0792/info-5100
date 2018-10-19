import java.util.ArrayList;
import java.util.List;

class SpiralMatrix{
    public List<Integer> arrange(int[][] matrix) {
        if(matrix == null) {
            throw new IllegalArgumentException("matrix is null");
        }
        List<Integer> spiralArr = new ArrayList<>();
        int x = 0,y = 0, verticalLimit, horizontalLimit;

        if(matrix.length == 0) {
            return spiralArr;
        }

        if(matrix.length == 1) {
            for(int value : matrix[0]) {
                spiralArr.add(value);
            }
            return spiralArr;
        }
        if(matrix[0].length == 1) {
            int counter = 0;
            while(counter != matrix.length) {
                spiralArr.add(matrix[counter][0]);
                counter++;
            }
            return spiralArr;
        }

        int counter = matrix.length * matrix[0].length;
        for(int start = 0; start < matrix.length - 1; start++) {
           x = start;
           y = start;
           verticalLimit = matrix.length - 1 - start;
           horizontalLimit = matrix[0].length - 1 - start;
           do {
               if(counter > 0) {
                   spiralArr.add(matrix[x][y]);
                   counter--;
                   if (x == start && y < horizontalLimit) {
                       y++;
                   } else if (x < verticalLimit && y == horizontalLimit) {
                       x++;
                   } else if (x == verticalLimit && y > start) {
                       y--;
                   } else if (x > start && y == start) {
                       x--;
                   }
               }
           } while(!(x == start && y == start));

        }

        return spiralArr;
    }
}