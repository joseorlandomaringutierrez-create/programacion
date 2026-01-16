public class App {

    public static void main(String[] args) {

        Perro perro1 = new Perro("chihuahua", "guau");
        Perro perro2 = new Perro("Doberman", "miau");

        perro2.ladrar();
        perro2.sonido = "guauuuuuuu";
        perro2.ladrar();
        
    }
}
