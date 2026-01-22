package lambda;

interface StringFunction {
    String run(String str);
}

//lambda as method refer473276ence
 class Main {
    public static void main(String[] args) {
   StringFunction exclaim  = (x->x+'!');
   StringFunction ask = (x->x+'?');
        printFormatted("Hello", exclaim);
        printFormatted("Hello", ask);
    }

    public static void printFormatted(String str, StringFunction format) {
        String result = format.run(str);
        System.out.println(result);
    }
}