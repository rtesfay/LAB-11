class CharactersQ1 {
    public static void main(String[] args) {
    }
        public static int countNumberOfChar (String text){

            if (text.isEmpty()) {
                return 0;
            } else {
                return 1 + countNumberOfChar(text.substring(1));
            }
        }
    }
