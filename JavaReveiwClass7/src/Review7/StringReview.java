package Review7;

public class StringReview {
    public static void main(String[] args) {
        String str = "Today is Thursday and it is Java Review";

        boolean empty = str.isEmpty();
        System.out.println("My string is empty =" + empty);

        // str.full():
        // the method full () is undifined for the type string// }

        int length=str.length();
        System.out.println("Length of the String is"+length);

        // instead of thursday I want to see monday

        str=str.replace("Thursday", "Monday");
        System.out.println(str);

        //how many words my string has?

        String [] allWords=str.split(" ");

        System.out.println("In my string I have  "+allWords.length+"words");
        //I want to print all the words 1 by 1
for (String word:allWords){
    System.out.print(word+", ");
}
// how would reverse a String
        String give="Hello";
StringBuilder sb=new StringBuilder(give);
      sb.reverse();
        System.out.println(sb);
//how would you reverse a string without using reverse
String reverse="";

        for (int i = give.length()-1; i>=0; i--){
          reverse+=give.charAt(i);
        }
        System.out.println(reverse);

        //substring
        String s="Today I am happy";
        System.out.println(s);
        s=s.substring(6);
        System.out.println(s);    // I am happy
        s=s.substring(0,4);
        System.out.println(s); //I am
    }
}


