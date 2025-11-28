/*PROBLEM 3: STRING ANALYZER USING INNER 
CLASS 
(Strings + Inner Classes + Loops) */

import java.util.Scanner;

class StringTool {

    private String sentence;
    StringTool(String sentence) {
        this.sentence = sentence;
    }

  
    class Analyzer {

       
        int countVowels() {
            int count = 0;
            for (int i = 0; i < sentence.length(); i++) {
                char ch = Character.toLowerCase(sentence.charAt(i));
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    count++;
                }
            }
            return count;
        }


        int countWords() {
            if (sentence.trim().isEmpty()) {
                return 0;
            }
            String words[] = sentence.trim().split("\\s+");
            return words.length;
        }


        String reverse() {
            String rev = "";
            for (int i = sentence.length() - 1; i >= 0; i--) {
                rev += sentence.charAt(i);
            }
            return rev;
        }
    }

   
    public static void main(String[] args)
 {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        StringTool tool = new StringTool(input);
        StringTool.Analyzer analyzer = tool.new Analyzer();

        System.out.println("Vowel Count: " + analyzer.countVowels());
        System.out.println("Word Count: " + analyzer.countWords());
        System.out.println("Reversed String: " + analyzer.reverse());

        sc.close();
    }
}
