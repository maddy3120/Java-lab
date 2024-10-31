import java.io.*;

class Readf {
    public static void main(String args[]) {
        try {
            FileInputStream fin = new FileInputStream("A.txt");
            int i;
            while ((i = fin.read()) != -1) {
                System.out.print((char) i);
            }
            fin.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}


