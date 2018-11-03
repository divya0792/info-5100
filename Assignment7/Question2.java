import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;


//handling exceptions in catch block instead of throwing them.

public class Question2 {
    public static void parse(File file) {
        RandomAccessFile input = null;
        String line = null;
        try {
            input = new RandomAccessFile(file, "r");
            while ((line = input.readLine()) != null) {
                System.out.println(line);
            }
            return;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("file not found", e);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("exception during reading the file", e);
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                    throw new RuntimeException("cant close file", e);
                }
            }
        }
    }

}
