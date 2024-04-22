    import java.util.*;

    public class TextProcessing {
        public static void main(String[] args) {
            String text = "Hello, I am Aakansha Singh";
            System.out.println("Word count: " + countWords(text));
            System.out.println("Line count: " + countLines(text));
            System.out.println("Reversed text: " + reverseText(text));
            System.out.println("Text without duplicates: " + removeDuplicates(text));
        }

            // Method to count words in the text
            private static int countWords(String text) {
                if (text == null || text.isEmpty()) {
                    return 0;
                }

                String[] words = text.trim().split("\\s+");
                return words.length;
            }


            // Method to count lines in the text
            private static int countLines(String text) {
                if (text == null || text.isEmpty()) {
                    return 0;
                }

                String[] lines = text.split("\\n");
                return lines.length;
            }


            // Method to reverse the text
            private static String reverseText(String text) {
                if (text == null) {
                    return null;
                }

                StringBuilder revText = new StringBuilder();
                for (int i = text.length() - 1; i >= 0; i--) {
                    revText.append(text.charAt(i));
                }

                return revText.toString();
            }


            // Method to remove duplicate words from the text
            private static String removeDuplicates(String text) {
                if (text == null) {
                    return null;
                }

                LinkedHashSet<Character> charSet = new LinkedHashSet<>();
                for (char c : text.toCharArray()) {
                    charSet.add(c);
                }

                StringBuilder result = new StringBuilder();
                for (char c : charSet) {
                    result.append(c);
                }

                return result.toString();
            }

        }


