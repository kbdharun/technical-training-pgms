// Q12. Antakshari is a popular parlor game played in India. Many word games are
// similar to antakshari. One such game is wordakshari. The game can be played by two
// or more people. The first player has to recite a word. The last letter of the word
// is then used by the next player to recite another word starting with that letter.
// The winner or winning team is decided by a process of elimination. The person or the
// team that cannot come up with a word with the right consonant is eliminated. - The
// following rules need to be followed while playing this game.

// - (i) All other words except the first word have to begin with the last letter of the previous word
// - (ii) No words can be repeated. write a program to print the wordakshari chain.

// Input Format:
// Input consists of n+1 lines.
// The first n lines contain strings corresponding to the words in the chain.
// The last line of input contains the string #### to mark the end of the input.

// Output Format:
// The output consists of the valid wordakshari chain.

// Sample Input:
// oracle
// error
// rohit
// ####

// Sample Output:
// oracle
// error
// rohit

// Explanation:
// In oracle the last letter is e and so the next word will be error since it starts with e and it goes on like that and hence the output is
// - oracle
// - error
// - rohit

import java.util.*;

public class Wordakshari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> words = new ArrayList<>();
        String word = scanner.nextLine();

        while (!word.equals("####")) {
            words.add(word);
            word = scanner.nextLine();
        }

        String lastWord = words.get(0);
        System.out.println(lastWord);

        for (int i = 1; i < words.size(); i++) {
            if (lastWord.charAt(lastWord.length() - 1) == words.get(i).charAt(0)) {
                System.out.println(words.get(i));
                lastWord = words.get(i);
            }
        }

        scanner.close();
    }
}

// Output:

// ➜  Day1 git:(main) ✗ java Wordakshari      
// oracle
// error
// rohit
// ####
// oracle
// error
// rohit
