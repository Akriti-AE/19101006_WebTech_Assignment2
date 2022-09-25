public class Question3 {
    public static void main(String[] args) {
    int month_number = 7;
    int year = 2003;
    switch (month_number)
    {
    case 1:
        System.out.println("Month name: January");
        System.out.println("Number of days: 31");
        break;
    case 2:
        System.out.println("Month name: February");
        if ((year%4==0 && year%100 !=0) || year%400 == 0){
        System.out.println("Number of days: 29");
        }
        else {
        System.out.println("Number of days: 28");
        }
        break;
    case 3:
        System.out.println("Month name: March");
        System.out.println("Number of days: 31");
        break;
    case 4:
        System.out.println("Month name: April");
        System.out.println("Number of days: 30");
        break;
    case 5:
        System.out.println("Month name: May");
        System.out.println("Number of days: 31");
        break;
    case 6:
        System.out.println("Month name: June");
        System.out.println("Number of days: 30");
        break;
    case 7:
        System.out.println("Month name: July");
        System.out.println("Number of days: 31");
        break;
    case 8:
        System.out.println("Month name: August");
        System.out.println("Number of days: 31");
        break;
    case 9:
        System.out.println("Month name: September");
        System.out.println("Number of days: 30");
        break;
    case 10:
        System.out.println("Month name: October");
        System.out.println("Number of days: 31");
        break;
    case 11:
        System.out.println("Month name: November");
        System.out.println("Number of days: 30");
        break;
    case 12:
        System.out.println("Month name: December");
        System.out.println("Number of days: 31");
        break;
    default:
        System.out.println("Please enter number between 1 to 12");
        break;
    }
    }
}