public class BuilderPatternTest {
    public static void main(String[] args) {

        Computer Computer1 = new Computer.Builder()
            .setCPU("Intel i9")
            .setRAM("16GB")
            .setStorage("1TB SSD")
            .build();

        Computer Computer2 = new Computer.Builder()
            .setCPU("Intel i5")
            .setRAM("8GB")
            .setStorage("500GB HDD")
            .build();

        System.out.println("Computer-1 : " + Computer1);
        System.out.println("Computer-2 : " + Computer2);
    }
}
