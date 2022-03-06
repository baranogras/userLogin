package Lesson3;
import java.util.Scanner;
public class userLogin {
    public static void main(String[] args) {
        String username,password,newPassword;
        int select;

        Scanner input = new Scanner(System.in);

        System.out.print("Username : ");
        username = input.nextLine();
        System.out.print("Password : ");
        password = input.nextLine();

        if(username.equals("Patika") && password.equals("java123")){
            System.out.println("Logging in...");
        }else if (!password.equals("java123")){
            System.out.println("Please Check Your Information!");
            System.out.println("Would you like to change your password?\n1-Yes\n2-No");
            select = input.nextInt();

            if(select ==1){
                    System.out.print("Please Enter Your New Password : " + input.nextLine());
                    newPassword = input.nextLine();

                    if (newPassword.equals("java123")){
                        System.out.println("Failed to Create Password. Please Enter Another Password.");
                    }else{
                        System.out.println("Password Changed Successfully.");
                    }
                }
            else if(select == 2){
                System.out.println("Please Try Again.");
            }else{
                System.out.println("Please Enter a Valid Value.");
            }
        }

    }
}
