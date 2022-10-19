import java.util.Arrays;

public class ArraysDemo {
    int ee=10;
    static int dd=12;
    public static void main(String[] args) {

        int telugu=80;
        int eng=80;
        int maths=80;
       // System.out.println("Student Avg marks::"+avg(sum(telugu,eng,maths)));
      
       ArraysDemo obj=new ArraysDemo();

       System.out.println(obj.marksMultiply(telugu,eng,maths));
       System.out.println(obj.sum(telugu,eng,maths));
       System.out.println(obj.avg(telugu));
    }
    // this method is used to mulitpp---
    //@Shivad
    private  int sum(int num1,int num2,int num3){
        return  num1+num2+num3;
    }
    public  int avg(int total){

        return total/3;
    }
     int marksMultiply(int a,int b,int c){


       return a*b*c;
    }
}
