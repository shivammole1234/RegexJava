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

        String regex="^[a-z]{3}([_+\\-.][a-z]+)?@[a-z]{10}\\.[a-z]{2}.*$";

        String str="abc.xyz@bridgelabz.co.in";

        if(check_regex(regex,str))
            System.out.println("the email :- "+str+" match with the regex:-  "+regex);
        else
            System.out.println("the email :- "+str+" does not match with the regex:-  "+regex);


    }
}
