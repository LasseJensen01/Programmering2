package Ex01;

public class Exercises {
    private static int counter1 = 0;
    private static int counter2 = 0;
    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(power(5,5));
        System.out.println(power2(5,5));
        System.out.println(prod(5,5));
        System.out.println(prodRus(5,5)); // This is faster and counter proves it
        System.out.println("Prod en bliver kaldt " + counter1 + " gange og prodRus bliver kaldt " + counter2 + " gange");
        System.out.println(reverse("RANSLIRPA"));
    }

    /**
     * Reee mine metoder er dårlige
     * @param n > 0
     */
    public static int factorial(int n){
        int result = 0;
        if (n == 1){
            return 1;
        } else{
            result = n * factorial(n-1);
        }
        return result;
    }



    /**
     * Power of metode reeee it just works Todd gib me starfield
     * @param n>0
     * @param p>0
     * @return n^p as int
     */
    public static int power(int n, int p){
        int result = 0;
        if (p == 0){
            return 1;
        } else{
            result = n * power(n,p-1);
        }
        return result;
    }

    public static int power2(int n, int p){
        int result = 0;
        if (p == 0){
            return 1;
        }else if (p%2 == 0){
            result = power2((n*n),p/2);
        } else{
            result = n * power2(n,p-1);
        }
        return result;
    }

    public static int prod(int a, int b){
        counter1++;
        int result = 0;
        if (b == 0){
            return 0;
        } else{
            result = a + prod(a,b-1);
        }
        return result;
    }

    public static int prodRus(int a, int b){
        counter2++;
        int result = 0;
        if (b == 0){
            return 0;
        } else if (b%2 == 0){
            result = prodRus(a*2,b/2);
        } else {
            result = a + prodRus(a,b-1);
        }
        return result;
    }
    public static String reverse(String s){
        String result = "";
        if (s.length() == 0){
            return "";
        } else {
            result += s.substring(s.length()-1) + reverse(s.substring(0,s.length()-1));
        }
        return result;
    }

}
