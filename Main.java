package sk.lukas;


import java.util.Scanner;


class Mena {
  int euro, dolar, forint, ceskaKoruna;
  
  
  public void menu(){
    System.out.print("              VITAJ V ZMENÁRNI\n");
   }
   
   
   public void vyber(){
   System.out.println(" Vyber si aku menu chceš zmenit:\n                1. euro\n                2. dolar\n                3. forint\n                4. česká koruna");
  }   
 
   public void zadajCislo(){
     System.out.print("Zadaj číslo a stlač enter: ");
 
  
   }
}

public class Main {

  public static void main(String[] args) {
   Mena mena = new Mena();
   mena.menu();
   mena.vyber();
   mena.zadajCislo();
   
   Scanner sc = new Scanner(System.in);
   int number = sc.nextInt();
   System.out.println("Vyber si druhu menu,\nzadaj cislo a stlac enter:");
   Scanner sc1 = new Scanner(System.in);
   int number1 = sc.nextInt();
   System.out.println("Super a kolko chces vymenit:");
   double number2 = sc.nextDouble();
   
    if(number == 1 && number1 == 2 || number == 2 && number1 == 1){
      System.out.println(number2*1.02);
  } if(number == 1 && number1 == 3 || number == 3 && number1 == 1){
      System.out.println(number2*339.5);
  } if(number == 1 && number1 == 4 || number == 4 && number1 == 1){
      System.out.println(number2*24.493);
  } if(number == 2 && number1 == 3 || number == 3 && number1 == 2){
      System.out.println(number2*391.71);
  } if(number == 2 && number1 == 4 || number == 4 && number == 2){
      System.out.println(number2*24.02);
  } if(number == 3 && number1 == 4 || number == 4 && number1 == 3){
    System.out.println(number2*0.06); 
   } 
   sc.close();
  }
 }

