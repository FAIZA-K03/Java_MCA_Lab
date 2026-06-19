import java.io.*;
public class DataProcessor{
    public static void main(String[] args) {
        try{
            FileInputStream fis=new FileInputStream("C:\\Users\\Faiza\\Desktop\\Java Lab\\Week 7\\input.txt");
            BufferedReader br=new BufferedReader(new InputStreamReader(fis));
            String line=br.readLine();
if(line==null || line.trim().isEmpty()){
System.out.println("Exception: IllegalArgumentException - No numeric values found in the file.");
}
            String[] numbers=line.split(" ");
            double sum=0;
            for(String num: numbers){
                 try{
            sum+=Double.parseDouble(num);
                 }
                 catch(NumberFormatException e){
System.out.println("Exception: InvalidDataException: "+num+ " is not a valid number");
}
            }
            double avg=sum/numbers.length;
            FileOutputStream fos=new FileOutputStream("output.txt");
            fos.write(String.valueOf(avg).getBytes());
            br.close();
            fos.close();
            System.out.println("Ouput Written to file");
        }
catch(FileNotFoundException e){
System.out.println("Exception: FileNotFoundException - The file input.txt does not exist.");
}
       catch(Exception e){
            System.out.println(e);   
        }
    }    
}
