package Java.Exeption.HW3;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateAndSave {
    public boolean isFileExists(File file) {
        return file.exists() && !file.isDirectory();
    }
    
    public void save(String args, UserDate text)
    {
        String filePath = args + ".txt";
        File file = new File(filePath);
    
        if (isFileExists(file)) {
            try(FileWriter writer = new FileWriter(filePath, false)) {
                String text1 = text.toString();
                writer.write(text1);
                writer.append('\n');             
                writer.flush();
                writer.close();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        } 
        }
        else {            
            try {
                creatFile(file);
                FileWriter writer = new FileWriter(filePath, false);
                String text1 = text.toString();
                writer.write(text1);
                writer.append('\n');             
                writer.flush();
                writer.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public void creatFile(File file) throws IOException{
        file.createNewFile();
    }
    
}
