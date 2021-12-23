import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        File gmailfile= new File("grademail.txt");
        File atfile = new File("atmail.txt");
        File gradefile = new File("grades.txt");


        ArrayList <String> gmaillist = new ArrayList<>();
        ArrayList <String> atlist = new ArrayList<>();
        ArrayList<String> gradelist = new ArrayList<>();
        File complete = new File("complete.txt");
        PrintStream out = new PrintStream(complete);

       gmaillist = filetolist(gmailfile);
       atlist = filetolist(atfile);
       gradelist = filetolist(gradefile);


        System.out.println(gmaillist);
        System.out.println(atlist);
        System.out.println(gradelist);

        //remove the @'s
        for(int i = 0; i < atlist.size(); i ++){
            String current = atlist.get(i);
            int n = current.indexOf("@");
            atlist.set(i, current.substring(0, n));
        }
        System.out.println(atlist);

        //fix the order and print
        for(int i = 0; i < gradelist.size(); i++){
            String cgmail = gmaillist.get(i);
            //if(cgmail.equals("tul23787")){cgmail = "khushipatel";}//the patel exception
            //the new patel exemption ... baum baum baum *scary noises*
            if(cgmail.equals("tun17440")){cgmail = "swtirisrobnano";}//the patel exception
            int index = atlist.indexOf(cgmail);
            String catmail = atlist.get(index);
            String cgrades = gradelist.get(index);
            //cgrades.i

            System.out.println(cgmail+"\t"+ catmail + "\t" + cgrades);
            out.println(cgmail.trim() +"\t"+ catmail.trim() + "\t" + cgrades);
        }

    }

    public static ArrayList<String> filetolist(File A)throws FileNotFoundException{
        ArrayList <String> done = new ArrayList<>();
        Scanner in = new Scanner (A);
        while(in.hasNextLine()){
            String current = (String) in.nextLine();
            done.add(current);
        }
        return done;

    }


}
