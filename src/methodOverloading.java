class util{
    public static int sum(int a , int b){
        return a+b;
    }
    public static double sum(double c, double d){
        return c+d;
    }
    public static float sum(float e , float f ){
        return e+f;
    }
}

public class methodOverloading {
    public static void main(String [] args){
        int result = util.sum(2,3);
        System.out.println("Result of int sum : "+ result);
        double results = util.sum(3.3,2.5);
        System.out.println("Results of double sum : " +results);
        float result1 = util.sum(5,8);
        System.out.println("Result of float sum : " + result1);

    }
}
