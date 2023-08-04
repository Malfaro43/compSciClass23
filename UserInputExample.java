import java.util.Scanner;
import java.text.MessageFormat;
//In a small (adjective) village, there lived an excellent baker named John.
//He was known throughout the land for his (adjective) bread and pastries.
//One day, a (adjective) stranger came to town and tasted the baker's famous (noun).
//The stranger was so impressed that he offered the baker a job at his (adjective) palace.
//At first, the baker was hesitant to leave his home, but the promise of (adjective) riches convinced him to accept the offer.
//As he journeyed to the palace, the baker encountered a (noun) and used his quick thinking to defeat it.
//he arrived at the palace, he was hailed as a hero and lived (adverb) happily ever after.


public class UserInputExample
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Input 8 words in the appropriate order. Each word should be separated by the space (adjective, adjective, adjective, noun, adjective, adjective, noun, adverb)");
        
        String age = in.nextLine();
        
        String[] words = age.split("\\s+");
        
        String output = MessageFormat.format("In a small {0} village, there lived a {0} baker named {1}.\nHe was known throughout the land for his {2} bread and pastries.\nOne day, a {3} stranger came to town and tasted the baker's ", words[0], words[1], words[2], words[3]);
        String output2 = MessageFormat.format("famous {0}.\nThe stranger was so impressed that he offered the baker a job at his {1} palace.\nAt first, the baker was hesitant to leave his home, but the promise of {2} riches convinced him to accept the offer.\nAs he journeyed to the palace, the baker encountered a dragon and used his quick thinking to defeat it.\nWhen he arrived at the palace, he was hailed as a hero and lived ", words[4], words[5], words[6]);
        String final_output = output + output2;
        System.out.println(final_output + words[7] + " ever!");
    }
}