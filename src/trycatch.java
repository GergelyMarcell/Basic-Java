public class trycatch {

    public static int masodfokuMegoldasokSzama(double a, double b, double c) throws IllegalArgumentException
    {
        if(a == 0) throw new IllegalArgumentException("Nem másodfokú a függvény!");
        double d = (b * b) + 4 * a * c;
        if(d > 0) return 2;
        else if (d == 0) return 1;
        else return 0;
    }

    public static String masodfokuGyokok(double a, double b, double c){
        return "";
    }
    public static void main(String[] args){
        System.out.println("Másodfokú megoldások:");
        try {
            System.out.println(masodfokuMegoldasokSzama(0,6,5));
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        try {
            System.out.println(masodfokuMegoldasokSzama(0,1,1));
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        try {
            System.out.println(masodfokuMegoldasokSzama(1,3,4));
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        try {
            System.out.println(masodfokuMegoldasokSzama(2,4,3));
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Másodfokú gyökök:");
        try {
            System.out.println(masodfokuGyokok(3,-4,2));
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        try {
            System.out.println(masodfokuGyokok(1,-2,1));
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        try {
            System.out.println(masodfokuGyokok(1,0,-4));
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        try {
            System.out.println(masodfokuGyokok(2,2,-2));
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
