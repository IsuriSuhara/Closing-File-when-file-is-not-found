package file.not;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Found {

    //public Found() throws IOException {}

    public static void main(String[] args) throws IOException{
        FileReader file1 = null;
        try{
            file1 = new FileReader("blaaa.txt");
            //Found f = new Found();
        }
        catch (FileNotFoundException e){}
        catch (IOException e)  {e.printStackTrace();}
        finally {
            try{file1.close();}
            catch (NullPointerException e){
            }
            finally {
                System.out.println("Thank you,please try again");
            }
        }
    }
}
