import java.io.*;

class Rewr {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("A.txt");
            BufferedReader b = new BufferedReader(fr);
            FileWriter fw = new FileWriter("CopyString.txt");
            String s;

            
            while ((s = b.readLine()) != null) {
                fw.write(s + System.lineSeparator()); 
                System.out.println(s); 
            }

            
            b.close();
            fw.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}


