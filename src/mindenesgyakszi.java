import java.util.Arrays;

public class mindenesgyakszi {
    public static String partyValidation(int lany, int fiu){
        if(lany == fiu && lany + fiu >= 20){
            return "The party is excellent!";
        }
        else if(lany + fiu >= 20 && lany != fiu){
            return "Quite a cool party!";
        }
        else if(lany == 0){
            return "Sausage party";
        }
        else return "Average party...";
    }

    public static int[] add(int[]arr, int num){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                int[] newArr = arr.clone();
                newArr[i] = num;
                return newArr;
            }
        }

        int[] newArr = Arrays.copyOf(arr, arr.length+1);
        newArr[arr.length] = num;
        return newArr;
    }

    public static int[] insert(int[] arr, int index, int num)
    {
        //ujtomb[arr+1], ind = 0; for(i=0,i<arr;i++){if(i==index){ujtomb[ind] = szam, ind++} ujtomb[ind] = array[i], ind++}
        int[] newArr = new int[arr.length+1];
        int ind = 0;
        for(int i = 0; i < arr.length; i++){
            if(i == index){
                newArr[ind] = num;
                ind++;
            }
            newArr[ind] = arr[i];
            ind++;
        }
        return newArr;
    }

    public static int[] remove(int[] arr, int num)
    {
        //ujarray, egyel kevesebb mint a regi; index = 0, isremoved=false for(i=0; i<array.length;i++){ if(isremoved&&arr[i] != num){ ujarraj[index] = arr[i], index ++, isremoved=true}}
        int[] newArr = new int[arr.length-1];
        int ind = 0;
        boolean isRemoved = false;
        for(int i = 0; i < arr.length; i++){
            if(!isRemoved && arr[i] != num){
                newArr[ind] = arr[i];
                ind ++;
            }
        }
        return newArr;
    }

    public static int[] pop(int[]arr, int index)
    {
        //ujtomb[-1], ind=0; for(i<arr.length){if(i == index){continue}else{newarr[ind] = array[i]; ind++}} return newarr
        int[] newArr = new int[arr.length-1];
        int ind = 0;
        for(int i = 0; i < arr.length; i++){
            if(i == index){
                continue;
            }else{
                newArr[ind] = arr[i];
                ind++;
            }
        }
        return newArr;
    }

    public static int dividable(int num, int fizz, int buzz){
        if(num % fizz == 0){
            return fizz;
        }
        else if(num % buzz == 0){
            return buzz;
        }
        else if(num % fizz ==0 && num % buzz == 0){
            return fizz * buzz;
        }
        else return -1;
    }

    public static void main(String[] args) {
        System.out.println("PartyValidation");
        System.out.println(partyValidation(11, 11).equals("The party is excellent!"));
        System.out.println(partyValidation(11, 12).equals("Quite a cool party!"));
        System.out.println(partyValidation(9, 9).equals("Average party..."));
        System.out.println(partyValidation(9, 10).equals("Average party..."));
        System.out.println(partyValidation(0, 25).equals("Sausage party"));
        System.out.println("Arrays");
        System.out.println(Arrays.toString(add(new int[] {1,2,0,4,5}, 3)).equals("[1, 2, 3, 4, 5]"));
        System.out.println(Arrays.toString(add(new int[] {1,0,0,4,5}, 3)).equals("[1, 3, 0, 4, 5]"));
        System.out.println(Arrays.toString(add(new int[] {}, 3)).equals("[3]"));
        System.out.println(Arrays.toString(add(new int[] {1,2,3,4,5}, 6)).equals("[1, 2, 3, 4, 5, 6]"));
        System.out.println(Arrays.toString(insert(new int[] {1,2,3,4,5}, 0, 6)).equals("[6, 2, 3, 4, 5]"));
        System.out.println(Arrays.toString(insert(new int[] {1,2,3,4,5}, 2, 6)).equals("[1, 2, 6, 4, 5]"));
        System.out.println(Arrays.toString(insert(new int[] {1,2,3,4,5}, 6, 2)).equals("[1, 2, 3, 4, 5, 2]"));
        System.out.println(Arrays.toString(remove(new int[] {1,2,3,2,1}, 5)).equals("[1, 2, 3, 2, 1]"));
        System.out.println(Arrays.toString(remove(new int[] {1,2,3,2,1}, 2)).equals("[1, 3, 2, 1]"));
        System.out.println(Arrays.toString(remove(new int[] {1,2,3,2,1}, 3)).equals("[1, 2, 2, 1]"));
        System.out.println(Arrays.toString(pop(new int[] {1,2,3,4,5}, 5)).equals("[1, 2, 3, 4]"));
        System.out.println(Arrays.toString(pop(new int[] {1,2,3,4,5}, 3)).equals("[1, 2, 3, 5]"));
        System.out.println(Arrays.toString(pop(new int[] {}, 5)).equals("[]"));
        System.out.println("Dividable");
        System.out.println(dividable(24, 4, 5) == 4);
        System.out.println(dividable(30, 4, 5) == 5);
        System.out.println(dividable(40, 4, 5) == 20);
        System.out.println(dividable(54, 4, 5) == -1);
    }
}
