import java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

      int[] arr={1,2,3,4,5,6,7,8,9,10};


      Scanner inp= new Scanner(System.in);
        System.out.println("Lütfen indeks giriniz: ");
       int number=inp.nextInt();


        try{
            int eleman = getElemanByIndex(arr, number);
            System.out.println("Seçilen eleman : " + eleman);

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Hata : Dizi boyutunun dışında bir indeks girdiniz!");
        }
       }

    public static int getElemanByIndex(int[] arr, int number){
        if(number < 0 || number >= arr.length){
            throw new ArrayIndexOutOfBoundsException();
        }
        return arr[number];
    }
}