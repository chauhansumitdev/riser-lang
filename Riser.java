/**
 * Riser
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;


public class Riser {

    static boolean has_error = false;

    public static void main(String[] args) throws IOException{
        
        if(args.length > 1){
            System.out.println("Run using : riser <script>");
            // System.out.println(args.length);

            // this status code is to show that the usage is wrong or the usage of command-line-args is invalid 
            System.exit(64);
        }else if(args.length == 1){
            // if the args len is one we can passed the script location and thus want to execute a script
            run_file(args[0]);
        }else{
            // else we want to use the interpreter in a line by line execution by taking and executing each line from the terminal itself
            // run_prompt();
        }
    }

    private static void run_file(String path) throws IOException{
        byte[] bytes = Files.readAllBytes(Paths.get(path));
        if(has_error){
            System.exit(65);
            has_error = false;
        }
        // run(new String(butes, Charset.defaultCharset()));
    }


    private static void run_prompt() throws IOException{
        InputStreamReader input = new InputStreamReader(System.in);

        BufferedReader reader = new BufferedReader(input);

        for(;;){
            System.out.print(">");
            String line = reader.readLine();
            if(line == null){
                break;
            }
            run(line);
        }
    }

    private static void run(String source){
        Scanner scanner = new Scanner(source);
        // List<Token> tokens = scanner.scan_tokens();

        // for(Token token : tokens){
        //     System.out.println(token);
        // }
    }


    static void error(int line, String message){
        // report(line, " ", message);
    }

    private static void report(int line, String where, String message){
        System.err.println("[line " + line + "] Error" + where + ": " + message);

        has_error = true;
    }


}