import java.util.*;


public class Scanner {
    private final String source;
    private final List<Token> tokens = new ArrayList<>();

    private int start = 0;
    private int current = 0;
    private int line = 1;

    Scanner(String source){
        this.source = source;
    }

    List<Token> scan_token(){

        while (!is_at_end()) {
            start = current;
            scan_token();
        }

        tokens.add(new Token(EOF, "", null, line));
    }

    private boolean is_at_end(){
        return current >= source.length();
    }

}
