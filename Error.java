public class Error {

    public static boolean extension_mismatch(String filename){
        

        int index = filename.indexOf('.');
        String extension = filename.substring(index, filename.length());

        if(!extension.equals(".rr")){
            return false;
        }

        return true;

    }
    
}
