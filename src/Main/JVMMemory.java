package Main;

public class JVMMemory {
    public static void main(String[] args) {
        // Total memory currently available to JVM
        long totalMemory = Runtime.getRuntime().totalMemory();
        // Maximum memory JVM can attempt to use
        long maxMemory = Runtime.getRuntime().maxMemory();
        // Free memory within the total memory
        long freeMemory = Runtime.getRuntime().freeMemory();

        System.out.println("Total Memory: " + totalMemory*0.0000001 + " bytes");
        System.out.println("Max Memory: " + maxMemory*0.0000001 + " bytes");
        System.out.println("Free Memory: " + freeMemory*0.0000001 + " bytes");
    }
}
