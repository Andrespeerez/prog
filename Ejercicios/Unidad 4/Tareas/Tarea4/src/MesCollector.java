public class MesCollector {

    int mes;
    int anyo;
    int diasMes;

    int[] temperatura;

    public MesCollector(int mes, int anyo) {
        this.mes = mes;
        this.anyo = anyo;

        switch (mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                this.diasMes = 31;
                break;
            case 4: case 6: case 9: case 11:
                this.diasMes = 30;
                break;
            case 2:
                this.diasMes = 28;
                break;
            default:
                this.diasMes = 0;
        }

        temperatura = new int[diasMes];

    }

    public int getTemperatura(int dia) {
        // dia {1:31}, indiceTemperatura {0:30}
        int indiceTemperatura = dia - 1;

        if(indiceTemperatura < 0 || indiceTemperatura >= this.diasMes) return -1; // fuera de rango

        return this.temperatura[indiceTemperatura];
    }

    public void setTemperatura(int dia, int temperatura) {
        if(dia < 0 || dia >= this.diasMes) return; // fuera de rango, no asigna nada

        this.temperatura[dia - 1] = temperatura;
    }

    @Override
    public String toString() {
        String result = "Mes: " + this.mes + "\n"+
                "Anyo: " + this.mes + "\n" +
                "Dias Mes: " + this.diasMes + "\n" +
                "Temperatura:\n";

        for(int i = 0; i < this.diasMes; i++) {

            if(this.temperatura[i] == 0) {
                result += "  Dia: " + (i + 1) + " Temperatura: No hay datos\n";
            }
            else {
                result += "Dia: " + (i + 1) + " Temperatura: " + this.temperatura[i] + "\n";
            }

        }

        return result;
    }

}
