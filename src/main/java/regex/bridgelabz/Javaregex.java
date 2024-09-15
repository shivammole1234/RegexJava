package regex.bridgelabz;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Javaregex {

    public static boolean check_regex(String regex ,String str){

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher=pattern.matcher(str);
        System.out.println("sample branch");
        System.out.println("sample branch");


        return matcher.matches();

    }
    public static void main(String[] args) {

        String regex="^abc(\\.[a-zA-Z0-9_+.-]+)?@bridgelabz\\.co(\\.[a-zA-Z]{2})?$\n";
        String str="abc.xyz@bridgelabz.co.au";

        if(check_regex(regex,str))
            System.out.println("the email :- "+str+" match with the regex:-  "+regex);
        else
            System.out.println("the email :- "+str+" does not match with the regex:-  "+regex);


    }
}
