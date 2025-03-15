public class stringManipulator {
    public String concatenate(String a, String b) {
        return a + b;
    }

    public int findlength(String a){
        return a.length();
    }

    public String convertToUpperCase(String str){
        return str.toUpperCase();
    }

    public String convertToLowerCase(String str){
        return str.toLowerCase();
    }

    public boolean containsSubstring(String str, String subStr){
        return str.contains(subStr);
    }
}
