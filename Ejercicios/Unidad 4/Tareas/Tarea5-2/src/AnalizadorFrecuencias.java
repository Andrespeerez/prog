public class AnalizadorFrecuencias {

    FrecuenciaLetra[] frecuencia = new FrecuenciaLetra[26];

    public AnalizadorFrecuencias() {

        for (int i = 0; i < frecuencia.length; i++) {
            char letra = (char) ('A' + i);
            frecuencia[i] = new FrecuenciaLetra(letra);
        }
    }

    public void contarLetras(String textoRaw) {

        String texto = textoRaw.toUpperCase();

        for (int i = 0; i < textoRaw.length(); i++) {
            if(texto.charAt(i) == ',') continue;
            if(texto.charAt(i) == '.') continue;
            if(texto.charAt(i) == ' ') continue;

            int index = (int) (texto.charAt(i) - 'A');
            this.frecuencia[index].increaseFrecuencia();
        }

        System.out.println("Fin Conteo");
    }

    public void imprimirArray() {

        for(int i = 0; i < this.frecuencia.length; i++) {
            System.out.println("letra: " + this.frecuencia[i].letra +
                    " frecuencia: " + this.frecuencia[i].getFrecuencia() );
        }
    }

}
