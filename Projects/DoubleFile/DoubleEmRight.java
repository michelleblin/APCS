import java.io.*;
import java.io.IOException;
import java.util.Scanner;

public class DoubleEmRight
{
  public static void main (String[] args) throws IOException
  {
        String name  = args[0].split("\\.")[0];
        File myfile = new File(name+".java");
        Scanner filereader = new Scanner(myfile);
        FileWriter fw = new FileWriter(name+"x2.java");
        PrintWriter output = new PrintWriter(fw);
        
        //try { Scanner filereader = new Scanner(myfile); }
        //catch(IOException e) { System.out.println("File not found error!"); }
        
        output.println("// this is a scale version of \""+ name+"\" by a factor of "+args[1]+"%");
        while (filereader.hasNext())
        {
            String sen = filereader.nextLine();
            if (sen.indexOf(name) != -1)           
              output.println(sen.replaceAll(name, name+"x2" ));
            else if(!onBlacklist(sen))
            {
                String newSentence = scaleEm(sen, Integer.parseInt(args[1])/100.0);
                output.println(newSentence);
            }
            else
              output.println(sen);
        } 
        filereader.close();
        output.close();
        fw.close();
  }
  public static boolean onBlacklist(String sentence)
  {
    String[] blacklist = {"Color", "sleep", "Graphics2D", "size"};
    for (String word: blacklist)
      if(sentence.matches(".*"+word+".*"))
        return true;
    return false;
  }
  public static String scaleEm (String sentence, double size)
  {
      String[] sp = sentence.split("\\D+");
      sentence =  sentence.replaceAll("\\d+", "YongJooTakeFlight");
      for(String num: sp)
      {
        String newNum;
        try{
          newNum = (int) (Integer.parseInt(num) *size) + "";
          sentence = sentence.replaceFirst("YongJooTakeFlight", newNum);
        }
        catch(Exception e){}

      }
      return sentence;
    
  }
}
