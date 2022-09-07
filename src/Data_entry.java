import java.util.Arrays;
import java.util.Scanner;

public class Data_entry {
    private String string;
    private String string2;
    private String string3;

    public String getString3() {
        return string3;
    }

    public void setString3(String string3) {
        this.string3 = string3;
    }




    public String getString2() {
        return string2;
    }

    public void setString2(String string2) {
        this.string2 = string2;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }





    public void string_data_system(){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome");
        System.out.print("Please enter your text : ");
        setString(input.nextLine());
        while (true){
            System.out.print("Please enter the word to replace : ");
            setString3(input.next());
            String[] arr= string.split(" ");
            System.out.println(Arrays.toString(arr));
            System.out.print("Replace with what? ");
            setString2(input.next());


            for (int i = 0; i < arr.length; i++) {
                if(string.contains(string2)){
                    System.out.println(string.replace(string3,string2));


                }else {
                    System.out.println("The word"+ string3+ " is not found ");
                    break;



                }
            }


        }








    }
}
