public  class Car implements AutoCloseable {

    @Override
    public void close() {
        System.out.println("car is closing.");
    }
    public static void drive()
    {
        System.out.println("car is driving.");
    }
}
