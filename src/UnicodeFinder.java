public class UnicodeFinder {

    public StringBuilder unicodeAtIndex(String myString, int index) {
        StringBuilder result = new StringBuilder();

        char character = myString.charAt(index);

        result.append("Il carattere al indice ")
                .append(index)
                .append(" è: ")
                .append("\\u") // u unicode
                .append(String.format("%04x", (int)character)); //%04x formatta esadecimale

        return result;
    }

}
