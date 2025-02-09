public class Main {

    public static void main(String[] args) {

        Video ob1 = new Video("VHS", 90, 10);
        Pelicula ob2 = new Pelicula("ET", 120, 10, "Spielberg", 5);
        VideoMusical ob3 = new VideoMusical("cancion", 90, "cantante", "rock", 2);

        System.out.println(ob1);
        System.out.println();
        System.out.println(ob2);
        System.out.println();
        System.out.println(ob3);
    }
}
