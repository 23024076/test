import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author madia
 */
public class FindProductIndex {
    
    

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        
        // TODO code application logic here
    int[] productIDs={104,105,106,107,101,102,103};
    System.out.println(FindProductIndex(productIDs,101));
    
    }
    private static int FindProductIndex(int[] productIDs, int targetID) {
        int low = 0;
        int high = productIDs.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (productIDs[mid] == targetID) {
                return mid;
            }

            if (productIDs[low] <= productIDs[mid]) {
                if (productIDs[low] <= targetID && targetID < productIDs[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (productIDs[mid] < targetID && targetID <= productIDs[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }

            }
        }


        return -1;
    }
}
