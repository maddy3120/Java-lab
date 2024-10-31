
import java.io.*;

class Merge {
    public static void main(String[] args) {
        try {
            FileInputStream fin1 = new FileInputStream("A.txt");
            FileInputStream fin2 = new FileInputStream("Copy.txt");
            FileOutputStream fout = new FileOutputStream("Merge.txt");

            int i;
            
            while ((i = fin1.read()) != -1) {
                fout.write(i);
                System.out.print((char) i);
            }
            fin1.close();

            
            while ((i = fin2.read()) != -1) {
                fout.write(i);
                System.out.print((char) i);
            }
            fin2.close();
            fout.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
