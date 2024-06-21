import java.util.Scanner;

class Ascii{
    public static void main(String[] args){
        for (int i=65;i<=90;i++){
            System.out.println("VALUE OF "+ i +"is "+(char) i);
        }
System.out.println("\n ");

for ( int k=97;k<=122; k++){
    System.out.println("VALUE OF "+ k +"is "+(char) k);
}

System.out.println("\n ");
////ascii by input method

Scanner s=new Scanner(System.in);
System.out.println("ENTER YOUR ALPHABET ");
char val=s.next().charAt(0);
System.out.println((int) val);


    }
}