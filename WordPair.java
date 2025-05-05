public class WordPair {
    private String a;
    private String b;

    /** Constructs a WordPair object. */
    public WordPair(String first, String second) {
        a = first;
        b = second; 
    }

    /** Returns the first string of this WordPair object. */
    public String getFirst() {
        return a;
    }

    /** Returns the second string of this WordPair object. */
    public String getSecond() {
        return b;
    }

    public String toString() {
        return "(\""+a+"\", \""+b+"\")";
    }
}