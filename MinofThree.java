public class MinofThree {
    public static void main(String[] args) {
        int number_1 = 48;
        int number_2 = 56;
        int number_3 = 45;
        if (number_1<number_2){
            if(number_1<number_3)
            System.out.println(number_1 + " is the minimum number");
            else if (number_2<number_3)
            System.out.println(number_2 + " is the minimum number");
            else
            System.out.println(number_3 + " is the minimum number");
        }
        else{
            if (number_2<number_3)
            System.out.println(number_2 + " is the minimum number");
            else
            System.out.println(number_3 + " is the minimum number");
        }
    }
}