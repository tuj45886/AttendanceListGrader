import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class randomUsrGen {

    public static void main(String [] args) throws FileNotFoundException {
        final String emailDomain = "@random.edu";
        final String startString = "ru";

        File randAttendance = new File("randAttMail");
        PrintStream write = new PrintStream(randAttendance);
        Random rannnnnnnn;
        for(int i = 0; i < 178; i++){
            Set avoidDups = new HashSet();

            write.println(startString + 2 + emailDomain);
        }

    }
}
