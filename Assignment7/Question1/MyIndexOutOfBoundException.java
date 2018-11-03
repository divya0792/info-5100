package Question1;

public class MyIndexOutOfBoundException extends RuntimeException {

    MyIndexOutOfBoundException(int lowerBound, int upperBound, int index) {
        super("Error Message: index= "+ index +" , but lowerbound= " + lowerBound + " upperbound= " + upperBound );
    }

}
