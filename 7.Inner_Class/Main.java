class CPU {
    double price=54000;
    // nested class
    class Processor{

        // members of nested class
        double cores=10;
        String manufacturer="Intel";

        double getCache(){
            return 4.3;
        }
    }
}

public class Main {
    public static void main(String[] args) {

        CPU cpu = new CPU();

        CPU.Processor processor = cpu.new Processor();

        System.out.println("Cores = "+processor.cores);
        System.out.println("Manufacturer = "+processor.manufacturer);
        System.out.println("Cache = "+processor.getCache());
        System.out.println("Price = "+cpu.price);
    }
}
