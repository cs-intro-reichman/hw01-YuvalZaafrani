public class GenThree {
    public static void main(String args[]) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int num1 =(int) (Math.random()*(b-a))+a;
        int num2 = (int) (Math.random()*(b-a))+a;
        int num3 = (int) (Math.random()*(b-a))+a;
        int min = Math.min (num1, (Math.min(num2,num3)));
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println("The minimal generated number was " + min); 
    }
}