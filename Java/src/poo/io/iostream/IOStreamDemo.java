package poo.io.iostream;

import java.io.*;

public class IOStreamDemo {

    public static void main(String[] args) {

        try( InputStream is = new BufferedInputStream( new FileInputStream("./ressources/write.txt"))){
            int octet = -1;
            while( (octet = is.read()) != -1 ){
                System.out.print( (char)octet );
            }

        }
        catch(IOException ex){
            ex.printStackTrace();
        }

        try(OutputStream os = new BufferedOutputStream(new FileOutputStream("./ressources/write.txt", true))){

            os.write('W');

        }
        catch (IOException ignored){}

    }

}
