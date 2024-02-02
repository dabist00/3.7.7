import java.util.Scanner;  


public class CerealRunner {
    public static void main(String[] args) {
        Scanner in = new Scanner(new File("C:/Users/P4/Desktop/CSA Work Documents/PLTW Stuff/3.7.7/Copy of Cereal.csv"));
        in.useDelimiter(",");
        
        while (in.hasNextLine()){
            System.out.println(in.next());
        }
    }
}
