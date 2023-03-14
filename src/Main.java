import java.util.Arrays;
import java.util.*;

public class Main {
    public static void main(String[] args) {

// --------------------------------------------------------------------------------------
//1. Skapa en array av heltal med 5 element. Skriv ut alla elementen på skärmen.
/*
        int heltal5[] = {1, 2, 3, 4, 5};

        for (int i = 0; i < heltal5.length; i++) {
        System.out.print(heltal5[i] + " ");
        }
*/
// --------------------------------------------------------------------------------------
//2. Skapa en array av strängar med 3 element och skriv ut det första och sista elementet på skärmen.
/*
        String bilar[] = {"Volvo", "BMW", "Ford"};
        System.out.println(bilar[0]);
        System.out.println(bilar[2]);
    }
*/
// --------------------------------------------------------------------------------------
//3. Skapa en array av heltal med 7 element och beräkna summan av alla element i arrayen. Skriv ut alla elementen och summan på skärmen.
/*
        int heltal5[] = {1, 2, 3, 4, 5, 6, 7};
        {
        int sum = 0;
        for (int value : heltal5) {
        sum += value;
        }
        System.out.println(sum);
        {

        for (int i = 0; i < heltal5.length; i++) {
        System.out.print(heltal5[i] + " ");
        }
*/
// --------------------------------------------------------------------------------------
//4. Skapa en array av booleska värden med 4 element och byt ut det andra elementet till motsatsen (t.ex. om det andra elementet är true, byt ut det till false). Skriv ut alla elementen på skärmen.
/*
        boolean[] myArray = {true, false, true, false}; // Change the second value to its opposite
        System.out.println ("originalArray Är :" + Arrays.toString(myArray) +"\n");

        myArray[1] = !myArray[1];     //vänder det andra värdet till det motsatta (!)
        System.out.print ("array Med 2:a booleska värdet ändrat är:");

        for (int i = 0; i < myArray.length; i++) {            //printar den nya arrayen
        System.out.print (myArray[i] + ", ");
        }
*/
// --------------------------------------------------------------------------------------
//5. Skapa en array av strängar med 5 element och sortera den i bokstavsordning. Använd valfri metod. Skriv ut alla elementen på skärmen.
/*
        String bilar[] = {"Volvo", "BMW", "Ford", "Datsun", "Opel"};
        Arrays.sort(bilar);

        for (int i = 0; i < bilar.length; i++) {
        System.out.print(bilar[i] + " ");
*/
// --------------------------------------------------------------------------------------
//6. Skapa en array av heltal med 6 element och beräkna det högsta värdet i arrayen.
/*
        int heltal6[] = {1, 2, 3, 4, 5, 6};
        System.out.println(largestPairSum(heltal6, heltal6.length));
        }

//metod
        private static int largestPairSum (int[] heltal6, int n) {
        int j = 0;
        int max = n == 1 ? heltal6[0] + heltal6[1] : heltal6[0];
        for (int i = 0; i < n; i++) {
        int sum = heltal6[j] + heltal6[i];
        if (sum > max) {
        max = sum;
        if (heltal6[j] < heltal6[i]) {
        j = i;
        }
        }
        }
        return max;
*/
// --------------------------------------------------------------------------------------
//7. Skriv ut alla elementen på skärmen, sedan det högsta värdet.
/*
        int heltal5[] = {1, 2, 3, 4, 5};

        for (int i = 0; i < heltal5.length; i++) {
        System.out.print(heltal5[i] + " ");
        }

        int max = heltal5[0];
        for(int i=0; i<heltal5.length; i++) {
        if(max < heltal5[i]) {
        max = heltal5[i];
        }
        }
        System.out.println("\n" + max);
*/
// --------------------------------------------------------------------------------------
//8. Skapa en array av strängar med 4 element och skriv ut dem i omvänd ordning på skärmen.
/*
        String bilar[] = {"Volvo", "BMW", "Ford", "Datsun"};
        System.out.println("grundArray Är : " + Arrays.toString(bilar));
        reverseArray(bilar);   // Calling method to swap elements
        }

//metod
        public static void reverseArray(String[] arr) {  // Converting Array to List
        List<String> list = Arrays.asList(arr); // Reversing the list using Collections.reverse() method
        Collections.reverse(list); // Converting list back to Array
        String[] reversedArray = list.toArray(arr); // Printing the reverse Array
        System.out.print("omvänd Array Är : " + Arrays.toString(reversedArray));
*/
// --------------------------------------------------------------------------------------
//9. Skapa en array med tio olika tal. Skapa nu två arrayer för fem tal och kopiera vartannat tal till den första och vartannat till den andra. Skriv ut första arrayen, sedan skriver du ut mini array 1 och 2.
// Får inte kopieringen att fungera helt emellan arrayerna riktigt, vad är det som gör fel + är fel? i övrigt fungerar.

/*
        int[] heltal10 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] miniArray1 = new int [5];
        int[] miniArray2 = new int [5];

        for (int i = 0; i < 5; i += 2) {
        miniArray1[i] = heltal10[i += 0];
        }

        for (int i = 0; i < 5; i++) {
        miniArray2[i] = heltal10[i += 1];
        }

        System.out.println("10-tals arrayen är: " + Arrays.toString(heltal10));
        System.out.println("Mini array 1 + varannan ifrån 10-tals array kopierad till den andra: " + Arrays.toString(miniArray1));
        System.out.println("Mini array 2 + varannan ifrån 10-tals array kopierad till den andra: " + Arrays.toString(miniArray2));
 */
// --------------------------------------------------------------------------------------
    }
}

