public class CatAdapter implements Duck {
    // Membuat objek kucing
    Cat cat;


    // Mengisi nilai ke objek kucing
    public CatAdapter(Cat cat)
    {
        this.cat = cat;
    }

    @Override
    public void squeak()
    {
        // Mengubah suara bebek menjadi suara kucing
        cat.meow();
    }
}
