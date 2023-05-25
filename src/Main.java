import jdk.swing.interop.SwingInterOpUtils;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

public void run()throws IOException {
    String c;
    Scanner sc = new Scanner(System.in);
    BinarySearchTree B = new BinarySearchTree();
    Execution E = new Execution();
    System.out.println("Press to proceed:");
    System.out.println("1 : Display Bus Stops according to distance");
    System.out.println("2 : Add a new Bus Stop");
    System.out.println("3 : Enter the name of Bus Stop you want to check");
    int p;
    c = sc.next();

    switch (c) {
        case ("1"):
            long timeStart = System.currentTimeMillis();
            System.out.println("Displaying according to distance");
            E.sortByDistance(B);

            B.TraverseLNR(B.root);
            System.out.println();
            System.out.println("Please type a number corresponding to one specific bus stop to view it's routes");
            p = sc.nextInt();
            System.out.println("Displaying " + B.Distance[p].name + "'s routes");
            B.Distance[p].routes.display();


            System.out.println();
            System.out.println("TIME COMPLEXITY ");
            System.out.println("Time elapsed : " + (System.currentTimeMillis() - timeStart) + " milliseconds");
            System.out.println("Number of runtime operations for file: " + E.complexFile);
            System.out.println("Runtime operations for menu insertion: " + E.complexMenuInsert);
            System.out.println("Total number of runtime operations: " + (E.complexFile + E.complexMenuInsert));
            break;

        case ("2"):
            timeStart = System.currentTimeMillis();
            System.out.println("Adding a new bus stop to the database");
            E.addBusStop();
            System.out.println();
            System.out.println("Press 1 to return to the main menu");
            System.out.println();

            System.out.println();
            System.out.println("Added to Database successfully.");
            System.out.println("Time elapsed : " + (System.currentTimeMillis() - timeStart) + " milliseconds");
            System.out.println("Number of total runtime operations for file insertion: " + E.busInsert);
            break;

        case ("3"):
            Scanner S2 = new Scanner(System.in);
            timeStart = System.currentTimeMillis();
            NodeBus[] M = new NodeBus[50];
            E.arrayCreation(M);
            System.out.println("Enter the Bus Stop's name");
            String name = S2.nextLine();
            name = name.toUpperCase(Locale.ROOT);
            for (int l = 1; l < M.length; l++) {
                if (M[l] == null) {
                    System.out.println("The name does not exist in the directory. Terminating");
                    break;
                }
                if (name.equals(M[l].name)) {
                    System.out.println(M[l].toString());

                    break;
                }
            }
            System.out.println("Time elapsed : " + (System.currentTimeMillis() - timeStart) + " milliseconds");
            }
    }

    public static void main(String[] args) throws IOException{
        Main main = new Main();
        main.run();
    }
}
