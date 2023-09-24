package org.example;

/*

Kullanıcıdan alınan boy ve kilo değerlerine göre beden kitle indeksini aşağıdaki verilere göre hesaplarız.

    Beden Kitle İndeksi (BMI) : Kilo(kg) / (Boy(m)*Boy(m))

    BMI < 18,5 ise -----------> Zayıf
    18,5 < BMI < 25 ise ------> Normal
    25 < BMI < 30 ise --------> Fazla Kilolu
    BMI > 30 ise -------------> Obez

 */

import java.util.Scanner;

class BMI_Calculator{
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);

        double kilo;
        double boy;

        System.out.println("Lütfen Boyunuzu Giriniz: ");
        boy = scanner.nextDouble();
        System.out.println("Lütfen Kilonuzu Giriniz: ");
        kilo = scanner.nextDouble();

        double BMI = (kilo / (boy*boy))*10000;

        if (BMI < 18.5){

            System.out.println("BMI'a göre zayıfsınız. Sağılınız için kilo almalısınız.");

        }

        else if (BMI > 18.5 && BMI <= 25) {

            System.out.println("BMI'a göre kilonuz normal. Kilonuzu korumalısınız.");

        }
        else if (BMI > 25 && BMI <= 30) {

            System.out.println("BMI'a göre fazla kilolusunuz. Sağılınız için biraz kilo vermelisiniz.");

        }
        else if (BMI > 30) {

            System.out.println("BMI'a göre obezsiniz. Sağılınız için acilen kilo vermelisiniz.");

        }

        //System.out.println(BMI);


    }

}
