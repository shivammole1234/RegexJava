package regex.bridgelabz;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Javaregex {

    public static boolean check_regex(String regex ,String str){

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher=pattern.matcher(str);
        return matcher.matches();
    }
    public static void main(String[] args) {

        String str="802255";
        String regex="^[1-9][0-9]{2}\\s?[0-9]{3}$";

        if(check_regex(regex,str))
            System.out.println("the string :- "+str+" match with the regex:-  "+regex);
        else
            System.out.println("the string :- "+str+" does not match with the regex:-  "+regex);


    }
}
