

public class Compare1
{
    /*
     * compares the lexiographic value of a string. Capitols come before lower case.
     * CAT > cat
     * 
     */
    public static String largest(String st1, String st2){
        if(st1.compareTo(st2)> 0){
            return st1;
        }
        else {
            return st2;
        }
    }
}
