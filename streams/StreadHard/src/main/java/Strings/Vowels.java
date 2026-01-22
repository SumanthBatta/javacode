package Strings;

public class Vowels {
    public static void main(String[] args) {
        String a = "Success";
        countMaxFreq(a);
    }
    public static void countMaxFreq(String a){
   a = a.toLowerCase();
        int vowelCount = 0;
        int consonentCount = 0;
        for(char ch : a.toCharArray()){
            if(ch>='a' && ch<='z'){

                if(ch=='a' || ch=='e' || ch=='i' || ch=='o'|| ch=='u'){
                    vowelCount++;
                } else{
                    consonentCount++;
                }

            }

        }
        System.out.println("vowelCount count: " + vowelCount);
        System.out.println("Consonants count: " + consonentCount);

    }
}
