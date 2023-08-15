package ua.hillel.lessons.lesson6;

public class ReverseExample {

    public static void main(String[] args) {
        reverseExample();

    }
    public static void reverseExample(){
        //n-i-1
        String [] str= {"Привет", "меня", "зовут", "Макс"};
        int n= str.length;
        String temp;

        for (int i =0; i<n/2; i++) {
            temp= str[n-i-1]; // str[4-0-1]= zovut
            str[n-i-1] = str[i]; // Maks= menya
            str[i] = temp;
            //Maks menya zovyt Privet

        }
        for (String i : str) {
            System.out.println(i + "");
        }
    }
}
