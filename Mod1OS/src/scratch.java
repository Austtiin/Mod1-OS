class Scratch {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

       // Overview:
        //Short utility type programs are often used to print out information about the system under review.



       // Instructions:
       // Write a Java program that:

       // prints out the operating system architecture
       // prints out the operating system name
       // prints out the operating system version
       // prints out the Java version
       // prints out the execution time of this program that also includes a loop doing something




        // Solution:


        //prints out the operating system architecture
        System.out.println("Operating System Architecture: " + System.getProperty("os.arch"));

        //prints out the operating system name
        System.out.println("Operating System Name: " + System.getProperty("os.name"));

        //prints out the operating system version
        System.out.println("Operating System Version: " + System.getProperty("os.version"));

        //prints out the Java version
        System.out.println("Java Version: " + System.getProperty("java.version"));

        //prints out the execution time of this program that also includes a loop doing something
        long startTime = System.currentTimeMillis();

        //loop doing something
        for (int i = 0; i < 1000000; i++) {
            System.out.println("Looping: " + i);
        }

        //prints out the execution time of this program that also includes a loop doing something
        long endTime = System.currentTimeMillis();

        //prints out the execution time of this program that also includes a loop doing something
        System.out.println("Execution Time: " + (endTime - startTime) + " milliseconds");

        //prints out the execution time of this program that also includes a loop doing something
        System.out.println("Execution Time: " + (endTime - startTime) / 1000 + " seconds");
    }
}