public class ReducedString {

    public static void main(String[] args) {
        System.out.println(reduce("aab"));
        System.out.println("====================");
        System.out.println(reduce("abba"));
        System.out.println("====================");
        System.out.println(reduce("aaabccddd"));
        System.out.println("====================");
        System.out.println(reduce("aa"));
        System.out.println("====================");
        System.out.println(reduce("baab"));
    }

    public static String reduce(String s){
        String reducedString = "";
        int index = 0;
        while (index < s.length()){
            if (index< s.length()-1 && s.charAt(index) == s.charAt(index+1)){
                index++;
            }else{
                if (!reducedString.isEmpty() && s.charAt(index) == reducedString.charAt(reducedString.length()-1)){
                    reducedString= reducedString.substring(0, reducedString.length()-1);
                }else{
                    reducedString+=s.charAt(index);
                }
            }
            index++;
        }
        return reducedString.isEmpty()?"Empty String":reducedString;
    }

    // public static String evaluate(String string){
    //     String reducedString="";
    //     String reReducedString="";
    //     do{
    //         reducedString = reReducedString;
    //         reducedString = reduce(string);
    //         reReducedString = reduce(reducedString);
    //     }while (!reducedString.equals(reReducedString));
    //     return reducedString;
    // }

    // public static String reduce(String string){
    //     String reducedString = "";
    //     for (int i = 0; i<string.length() ; i++){
    //         if (i+1<=string.length() && string.charAt(i) == string.charAt(i+1)){
    //             i++;
    //         }else{
    //             reducedString += string.charAt(i);
    //         }
    //     }
    //     return reducedString;
    // }
}
