public class Ejercicio implements CharSequence {

    char[] cadena;

    public Ejercicio(char[] cadena) {
        this.cadena = cadena.clone();
    }

    @Override
    public int length() {
        return cadena.length;
    }

    @Override
    public char charAt(int index) {
        return cadena[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        if (start < 0 || start > this.length()) return "";
        if (end >= this.length() || end <= start) return "";

        char[] temp = new char[end - start];
        for (int i = start; i < end; i++) {
            temp[end - i - 1] = this.cadena[i];
        }
        return new String(temp);
    }

    public String toString(char[] cadena) {
        return new String(cadena);
    }
}
