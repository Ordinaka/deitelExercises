package chapterSeven;

public class PracticeSevenDotSix {
    public static void main (String[] args) {
        int[] array = {0,0,0,0,0,0,1,2,4,2,1};
        System.out.println ("Grade distribution");
        for (int counter = 0; counter < array.length; counter++) {
            if (counter == 10){
                System.out.print ("  " + 100+": ");
            }
            else{
                System.out.print (counter * 10 + "-" + counter * 1+9+": ");
            }
            for (int stars = 0; stars < array[counter]; stars++) {
                System.out.print ("*");
            }
            System.out.println ();
        }
    }
}
