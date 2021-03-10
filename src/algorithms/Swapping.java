package algorithms;

public class Swapping {

    public static void main(String[] args) {

        int twenty = 20;
        int sixty = 60;

        System.out.println("Before the swap: ");
        System.out.println("Twenty equals: "+twenty);
        System.out.println("Sixty equals: "+ sixty);

        int takeOver = twenty;
        twenty = sixty;
        sixty = takeOver;

        System.out.println("After the swap:");
        System.out.println("Twenty equals: "+ twenty);
        System.out.println("Sixty equals: "+ sixty);
    }
}
