import java.nio.file.*;
import java.io.IOException;
import java.util.*;

public class Lexer {
    public void readFile(String filePath) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(filePath));
        Map<String, String> token_map = new HashMap<>();

        token_map.put("int", "INT");
        token_map.put("float", "FLOAT");
        token_map.put("string", "STRING");
        token_map.put("bool", "BOOL");
        token_map.put("=", "EQUAL");
        token_map.put("let", "LET");
        token_map.put("+", "PLUS");
        token_map.put("-", "MINUS");
        token_map.put("*", "MULIPLY");
        token_map.put("/", "DIVIDE");
        token_map.put("%", "MODULE");
        token_map.put("==", "DOUBLE_EQUAL");
        token_map.put("!=", "NOT_EQUAL");
        token_map.put("<", "LESS_THAN");
        token_map.put(">", "GREATER_THAN");
        token_map.put(">=", "GREATER_THAN_EQUAL");
        token_map.put("<=", "LESS_THAN_EQUAL");
        token_map.put("&&", "AND_AND");
        token_map.put("||", "OR_OR");
        token_map.put("!", "NOT");
        token_map.put("if", "IF");
        token_map.put("else", "ELSE");
        token_map.put("while", "WHILE");
        token_map.put("for", "FOR");
        token_map.put("func", "FUNC");
        token_map.put("//", "DOUBLE_SLASH");
        token_map.put("(", "BRACE_OPEN");
        token_map.put(")", "BRACE_CLOSE");
        token_map.put("{", "BLOCK_OPEN");
        token_map.put("}", "BLOCK_CLOSE");
        token_map.put("\"", "APOSTROPHE");
        token_map.put(";", "COMMA");

        List<Token> tokens = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (String line : lines) {
            char current_stream[] = line.toCharArray();

            for (char ch : current_stream) {
                if (Character.isWhitespace(ch)) {
                    if (sb.length() > 0) {
                        processBuffer(sb, token_map, tokens);
                    }
                    sb.setLength(0); 
                } else if (token_map.containsKey(Character.toString(ch))) {
                    if (sb.length() > 0) {
                        processBuffer(sb, token_map, tokens);
                    }
                    tokens.add(new Token(token_map.get(Character.toString(ch)), Character.toString(ch)));

                    sb.setLength(0);
                } else {
                    sb.append(ch); 
                }
            }

            if (sb.length() > 0) {
                processBuffer(sb, token_map, tokens);
                sb.setLength(0);
            }
        }

        for (Token curr : tokens) {
            System.out.println(curr);
        }
    }

    private void processBuffer(StringBuilder sb, Map<String, String> token_map, List<Token> tokens) {
        String buffer = sb.toString();
        if (token_map.containsKey(buffer)) {
            tokens.add(new Token(token_map.get(buffer), buffer));
        } else {
            tokens.add(new Token("IDENTIFIER", buffer));
        }
    }
}
