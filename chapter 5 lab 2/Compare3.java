
/**
 * Write a description of class Compare3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Compare3
{
    public static Comparable largest(Comparable i1, Comparable i2){
        if(i1.compareTo(i2) > 0) {
            return i1;
        }
        else{
            return i2;
        }
    }
}
