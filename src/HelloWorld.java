public class HelloWorld {
    public static void main(String[] args){
        tempChange(50);
    }
    public static void tempChange(double feran){
        double celc = 5 * (feran - 32) / 9;
        System.out.println("feran: " + feran + "\n celc" + celc);
    }
    public static void tempChange2(double feran){
        double celc = 5 * (feran - 32) / 9;
        System.out.println("feran: " + feran + "\n celc" + celc);
        double undo = ( (celc + 32) / 5 ) * 9;
        System.out.println(undo);
    }
}
