public class Main
{
    public static void main(String[] args) {
        ClienteVip myVip = new ClienteVip();
        System.out.println("Cliente " + myVip.getNombre() + " con email: " + myVip.getEmail());
        System.out.println("Credito: " + myVip.getLimiteCredito() + " tipo cliente: " + myVip.getTipoVip());
        myVip.setEmail("aaa@bb.com");
        myVip.setNombre("Andres");
        myVip.setLimiteCredito(60.00);
        myVip.setTipoVip(TipoVip.SILVER);
        System.out.println("Cliente " + myVip.getNombre() + " con email: " + myVip.getEmail());
        System.out.println("Credito: " + myVip.getLimiteCredito() + " tipo cliente: " + myVip.getTipoVip());

        ClienteVip myVip2 = new ClienteVip("Pedro", "pedro@gmail.com");
        System.out.println("Cliente " + myVip2.getNombre() + " con email: " + myVip2.getEmail());
        System.out.println("Credito: " + myVip2.getLimiteCredito() + " tipo cliente: " + myVip2.getTipoVip());

        ClienteVip myVip3 = new ClienteVip("Maria", 4939, "maria@gmail.com", TipoVip.GOLD);
        System.out.println("Cliente " + myVip3.getNombre() + " con email: " + myVip3.getEmail());
        System.out.println("Credito: " + myVip3.getLimiteCredito() + " tipo cliente: " + myVip3.getTipoVip());

    }
}
