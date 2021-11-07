public class Tom implements Cat {
    
    @Override
    public void meow()
    {
        // Kucing mengeluarkan suara
        System.out.println("Meong meong...");
    }

    @Override
    public void jump()
    {
        // Kucing melompat
        System.out.println("Jump!!!");
    }
}
