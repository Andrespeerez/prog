public class Main {

    public static void main(String[] args) {
        System.out.println(insideParen("xyz (abc) 123", true));
        System.out.println(insideParen("xyz (abc) 123", false));
    }

    /*
    Dada una cadena que contiene UN solo par de paréntesis, calcula recursivamente una nueva cadena compuesta
    solo por el paréntesis y su contenido, por lo que "xyz (abc) 123" produce "(abc)"
    */
    public static String insideParen(String str) {
        if (str.isEmpty()) return "";

        char letra = str.charAt(0);
        if('(' == letra) {
            int indexEndParen = str.indexOf(')');
            return str.substring(0, indexEndParen + 1);
        }

        return insideParen(str.substring(1));
    }

    public static String insideParen(String str, boolean isInside) {
        if(str.isEmpty()) return "";
        if(isInside && str.charAt(0) == ')') return ")";

        if(str.charAt(0) == '(') isInside = true;
        if (isInside) return str.charAt(0) + insideParen(str.substring(1), true);
        return insideParen(str.substring(1), false);
    }

}
