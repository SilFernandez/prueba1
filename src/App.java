public class App {

    public static String cualquierNombre = "ya estamos terminando";
    public static void main(String[] args) throws Exception {
        //variable hola
        String hola = "Hello, World!";
        //le paso la variable por parametro
        System.out.println(hola);

        System.out.println("televisor");

        System.out.println("otracosa");

        otroMetodo("hola y chau");
        //se imprime la primera vez "ya estamos terminando"
        otroMetodo(cualquierNombre);
        otroMetodo(cualquierNombre);
        otroMetodo("hola y chau");

        otroMetodo("estoy pasando por el metodo");

        System.out.println(hola);
    }
    
    public static void otroMetodo(String cualquierCosa) {
        //se imprime la segunda vez "ya estamos terminando" aca lo recibio por parametro
        System.out.println(cualquierCosa);
        //se imprime la tercera vez "ya estamos terminando"
        System.out.println(cualquierNombre);
        


    } 
}
