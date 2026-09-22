public class Matek {
    static void main(){
        double rnd1 = (int)(Math.random()*200);
        double rnd2 = (int)(Math.random()*200);
        //1.
        System.out.println(rnd1 > rnd2 ? "Első szám nagyobb! "+ rnd1 + ">" + rnd2 : "Második szám nagyobb!"+rnd2 + ">" + rnd1);
        //2.
        System.out.println(rnd1 < rnd2 ? "Első szám kisebb!" + rnd1 + "<" + rnd2 : "Második szám kisebb!" + rnd1 + "<" + rnd2);
        //3.
        System.out.println("Két szám négyzetgyöke: " + Math.pow(rnd1,2) + "," + Math.pow(rnd2,2));
        //4.
        System.out.println("Két szám különbsége: " + (rnd1-rnd2));
        //5.
        System.out.println("Két szám köbe: " + Math.pow(rnd1,3) + "," + Math.pow(rnd2,3));
        //6.
        System.out.println("Két szám hányadosa lefelé kerekítve: " + Math.round(rnd1/rnd2));
        //7.
        System.out.println("Két szám hányadosa lefelé kerekítve: " + Math.floor(rnd1 / rnd2));
        //8.
        System.out.println("Két szám hányadosa felfelé kerekítve: " + Math.ceil(rnd1 / rnd2));
    }

}
