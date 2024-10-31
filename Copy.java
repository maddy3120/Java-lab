import java.io.*;

class Copy {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("A.txt");
            FileOutputStream fo = new FileOutputStream("Copy.txt");
            int i;
            while ((i = fin.read()) != -1) {
                fo.write(i);
                System.out.print((char) i);
            }
            fo.close();
            fin.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}


