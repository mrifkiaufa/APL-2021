public class Main {
    public static void main(String[] args) {
        // Membuat objek untuk kucing dan bebek
        Cat tom = new Tom();
        Duck donald = new Donald();

        // Membuat objek catAdapter
        Duck catAdapter = new CatAdapter(tom);

        // Perilaku kucing
        System.out.println(">TOM");
        tom.meow();
        tom.jump();
        System.out.println();

        // Perilaku bebek
        System.out.println(">DONALD");
        donald.squeak();
        System.out.println();

        // Perilaku kucing dengan catAdapter
        System.out.println(">CAT ADAPTER");
        catAdapter.squeak();
    }
}
