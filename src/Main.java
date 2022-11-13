import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp=new Scanner(System.in);
        while(true){

            int no,control,tempNo,digit=0,dValue=1;

            System.out.print("Bir sayı giriniz (Çıkmak için negatif bir değer giriniz): ");
            no=inp.nextInt();
            control=no;
            tempNo=no;
            if (no<0)
                break;

            while(tempNo!=0) // Basamak sayısı bulma
            {
                tempNo=tempNo/10;
                digit++;
            }
            for (int i=0; i<digit-1; i++)
            {
                dValue*=10;
            }
            for (int i=0; i<digit; i++)
            {
                tempNo+=(no%10)*dValue;
                no/=10;
                dValue/=10;

            }
            if (control==tempNo)
            {
                System.out.println(control+" sayısı palindrom sayıdır.");
            }else
                System.out.println(control+" sayısı palindrom sayı değildir.");

        }
    }
}