import java.util.*;
/**
 * Fill in your solutions for the PreLab in
 * the corresponding methods.
 * 
 * @author Barne Kleinen
 */
public class PreLab
{
    public void printMultiplesOf5()
    {
        for (int i = 10; i <= 95; i++) {
            // Check if the number is a multiple of 5
            if (i % 5  ==  0) {
                // Print the multiple of 5
                System.out.println( i + " is a multiple of 5" );
            }

        }
    }
    public int sumBetween(int a, int b){ 
    int sum = 0;
        /*Check if a != b and increase a’s counter by one after one run. b will not get included in the sum if a’s counter reaches the value of b.*/
    for(; a != b; a++) {
        sum +=  a;
    }
    return sum;
    }
    
    public void printStudentList(Collection<Student> imi1)
    {
    }
    
    public boolean isPrime(int n){
        return false;
    }
    
    public int countPrimesSmallerThan1000(){
	Collection<Integer> primes = new ArrayList<>();
        
	int i = 0;
        while(i <= 1000){
            int j = i;
            int isDevisibleCount = 0;
            while(j != 0) {
                if(i % j == 0){
                    isDevisibleCount++;
                } 
                j--;
            }
            
            if(isDevisibleCount == 2) {
                primes.add(i);
            }
            i++;
        }
        return primes.size();
    }
}
