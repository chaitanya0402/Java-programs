public class String_operation {
    public static void main(String[] args){
        /*String str1="Hello";
        String str2="World";
        String str3=str1+str2;
        System.out.println(str3);
        String str4=str1.concat(str2);
        System.out.println(str4); */
        /*equals operation*/
        String str1 = "ABCD";
        String str2 = "aBcD";
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
        /*Compare*/
        System.out.println(str1.compareTo(str2));
        System.out.println(str1.compareToIgnoreCase(str2));
        /*pattern mathes*/
        String patt="[A-Z]{1,}";
        System.out.println(str1.matches(patt));


    }
}