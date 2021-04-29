package flyWeight;

import java.io.FileWriter;
import java.io.IOException;

public class TestMain {
    public static void main(String[] args) throws IOException {
        BigString bigString = new BigString("1258355");
        System.out.println(bigString.toString());
    }
}
