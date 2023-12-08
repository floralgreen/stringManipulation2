public class UnicodeFinder {

    public StringBuilder unicodeAtIndex(String myString, int index) {
        StringBuilder result = new StringBuilder();
        result.append("Il codice Unicode di '" + myString.charAt(index) + "' è: ");

        char character = myString.charAt(index);
        int code = ((int) character);

        result.append(code);
        return result;
    }

}
