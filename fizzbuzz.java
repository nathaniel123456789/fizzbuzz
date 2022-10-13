public class fizzbuzz { //2 if else, 1 else 
    public static void main (String[]args) {
        double b;
        double c;
    
        for (int a = 1; a <= 100 ; a++) {
            b = (double) a / 3; 
            c = (double) a / 5;
            if (b == Math.round(b) && c == Math.round(c)) {
                System.out.println("fizzbuzz");
                }
            else if (b == Math.round(b)) {
                System.out.println("fizz");
                }
            else if (c == Math.round(c)) {
                System.out.println("buzz");
                }
            else {
                System.out.println(a);
            }
        }
    }
}