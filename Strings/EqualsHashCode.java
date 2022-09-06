package Strings;

public class EqualsHashCode {

    public static void main(String[] args){
        String s=new String("shivakrishna");
        String s1=new String("shivakrishna");
        String s2="shivakrishna";
        System.out.println("s HashCode ::"+s.hashCode());
        System.out.println("s1 HashCode ::"+s1.hashCode());
        System.out.println("s2 HashCode ::"+s2.hashCode());
        System.out.println(s1.equals(s2));
    }
    
}
