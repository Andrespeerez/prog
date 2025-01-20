public class Video {

    private String titulo;
    protected int minutos;

    public Video(String titulo, int minutos) {
        this.minutos = minutos;
        this.titulo = titulo;
    }

    public Video() {
        this.titulo = "Titanic";
        this.minutos = 180;
    }

    public String getVideo() {
        return this.titulo;
    }

    public int getMinutos() {
        return this.minutos;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }
}
