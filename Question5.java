public class Question5 {
    public static void main(String[] args) {
    System.out.println("n n^2 n^3 n^4");
    for(int number = 1; number<6; number++){
        int power2 = (int)Math.pow(number,2);
        int power3 = (int)Math.pow(number,3);
        int power4 = (int)Math.pow(number,4);
    System.out.println(number+"  "+power2+"   "+power3+"  "+power4);
    }
    }
}