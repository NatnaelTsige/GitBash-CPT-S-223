public class HelloWorld {

    public static void tempChange(double feran){
        double celc = 5 * (feran - 32) / 9;
        System.out.println("feranheit: " + feran + "\n celcius" + celc + "\n");
    }

    public static void main(String[] args){
        System.out.println("Hello World!\n");

        double f = 2.4;
        tempChange(5.6);
        tempChange(f);
    }

}
