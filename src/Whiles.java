public class Whiles {
    public void main(){
        double szam1 = Math.floor(Math.random()*100);
        double szam2 = Math.floor(Math.random()*100);
        int cntr = 0;
        while (szam1 < szam2 && cntr < 10){
            System.out.print(szam1 + ",");
            szam1++;
            cntr++;
            if(cntr == 10){
                cntr = 0;
                System.out.println();
            }
        }

        while (szam1 > szam2 && cntr < 10){
            System.out.print(szam2 + ",");
            szam2++;
            cntr++;
            if(cntr == 10){
                cntr = 0;
                System.out.println();
            }
        }
    }
}
