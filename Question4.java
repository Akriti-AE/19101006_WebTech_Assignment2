public class Question4 {
    public static void main(String[] args) {
    double population = 80000;
    int year = 0;
    while (population<150000){
        year++;
        population = population + population * 0.05;
    }
    System.out.println("The population will exceed after "+year+" years.");
    }
}