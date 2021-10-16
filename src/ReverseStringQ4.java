public class ReverseStringQ4 {
    public static void main(String[] args) {
        reversStringQ4("love");
    }
        public static String reversStringQ4(String text) {
            if (text == null || text.length() == 0) {
                return text;
            } else
                return reversStringQ4(text.substring(1)) + text.charAt(0);
        }
    }

