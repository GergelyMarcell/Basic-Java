public class Kasztolas {
    static void main() {
        byte mybyte = 100;
        short myshort = 5000;
        long mylong = 15000000000L;
        float f = 5.75f;
        double d = 19.99d;
        char myGrade = 'B';
        boolean mybool = true;
        String greeting = "Hello World!";


        System.out.println(mybyte);
        System.out.println(myshort);
        System.out.println(mylong);
        System.out.println(f);
        System.out.println(d);
        System.out.println(myGrade);
        System.out.println(mybool);
        System.out.println(greeting);
        System.out.println("------------------------------------");


        double kasztproba = 19.23d;
        float dtof = (float) kasztproba;
        long dtol = (long) kasztproba;
        int dtoi = (int) kasztproba;
        short dtos = (short) kasztproba;
        byte dtob = (byte) kasztproba;

        System.out.println(kasztproba);
        System.out.println(dtof);
        System.out.println(dtol);
        System.out.println(dtoi);
        System.out.println(dtos);
        System.out.println(dtob);

        float f2 = 4.86f;
        long ftol = (long) f;
        int ftoi = (int) f;
        short ftos = (short) f;
        byte ftob = (byte) f;

        System.out.println(f2);
        System.out.println(ftol);
        System.out.println(ftoi);
        System.out.println(ftos);
        System.out.println(ftob);

        long l = 15000000000L;
        int ltoi = (int) l;
        short ltos = (short) l;
        byte ltob = (byte) l;

        System.out.println(l);
        System.out.println(ltoi);
        System.out.println(ltos);
        System.out.println(ltob);

        int i = 1930;
        short itos = (short) i;
        byte itob = (byte) i;

        System.out.println(i);
        System.out.println(itos);
        System.out.println(itob);

        short s = 199;
        byte stob = (byte) s;

        System.out.println(s);
        System.out.println(stob);
    }
}
