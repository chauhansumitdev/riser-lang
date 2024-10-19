/**
 * Riser
 */
public class Riser {

    public static void main(String[] args){ 

        if(args.length < 1){
            System.out.println("Usage: riser <filename>");
            System.exit(64);
        }else if(args.length == 1){
            Lexer lexer = new Lexer();
            try{
                lexer.readFile(args[0]);
            }catch(Exception e){
                e.printStackTrace();
            }
        }else{
            System.out.println("Usage: riser <filename>");
        }
    }
}