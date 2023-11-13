/* Ijenna Okonkwo
 * iso2108
 * Minutes.java asks a user for a number of hours, days, weeks, and years and computes the equivalent number of minutes
 */
import java.util.Scanner;

public class Minutes {
    
    public static final void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("How many years? ");
        int years = sc.nextInt();

        System.out.print("How many weeks? ");
        int weeks = sc.nextInt();

        System.out.print("How many days? ");
        int days = sc.nextInt();

        System.out.print("How many hours? ");
        int hours = sc.nextInt();

        int min = (years*525600) + (weeks*10080) + (days*1440) + (hours*60);

        System.out.println("In total, this is equivalent to " + min + " minutes!");
        
        
    }
    
    
}
