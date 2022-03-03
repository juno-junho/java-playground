import java.util.Arrays;
import java.util.Scanner;

public class BirthdayReminder {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String birth[] = new String[10];
        String names[] = new String[10];
        String a[] = new String[100];

        for(int i=0; i<10; i++)
        {
            System.out.println("Enter name");
            names[i]= input.nextLine();
            if(names[i].equals("ZZZ"))
            {
                System.out.println(i);
                System.out.println(Arrays.toString(names));
                break;
            }
            else if(i==10)
            {
                System.out.println(i+1);
                System.out.println(Arrays.toString(names));
                for(int j=0;j>0;j++)

                    break;


            }
            else
            {
                System.out.println("Enter Birthday");
                birth[i]= input.nextLine();
                System.out.println(names[i]);
            }

        }



        for(int j=0;j<10;j++){
            System.out.println("Enter name to get their Birthday");
            input = new Scanner(System.in);
            a[j]= input.nextLine();
            boolean valid = false;
            for(int k=0; k<10;k++){
                if(a[j].equals(names[k])){
                    System.out.println(birth[k]);
                    valid = true;
                }else if (k == 9 && !valid){
                    System.out.println("Name not found");
                }

            }

        }

    }
}