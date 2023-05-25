import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class Execution {

    int complexMenuInsert = 0;
    int complexFile = 0;
    int busInsert = 0;

    public void sortByDistance(BinarySearchTree B) {

        String[] word;
        String[] routes;
        int i;
        NodeBus L;
        BufferedReader reader;
        int count = 1;
        try {
            reader = new BufferedReader(new FileReader("morp.txt"));
            String line = reader.readLine();    //read the first line
            complexFile += 10;
            while (line != null) {
                if (line.length() <= 1) {
                    complexFile++;
                } else {
                    i = line.indexOf('%');
                    word = line.substring(0, i).split("@");
                    routes = line.substring(i + 1).split("@");

                    L = new NodeBus(word[0], word[1], Double.parseDouble(word[2]) );

                    for (int o = 0; o <routes.length; o++) {
                        L.routes.insert(routes[o]);
                        complexMenuInsert++;
                    }
                    B.insertByDistance(L);
                    complexFile = complexFile + 8;
                }
                line = reader.readLine();
                count++;

            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addBusStop() throws IOException {
        String[] S = new String[3];

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name");

        S[0] = sc.nextLine();

        System.out.println("Enter the location");

        S[1] = sc.nextLine();

        System.out.println("Enter the distance");

        S[2] = sc.nextLine();

        System.out.println("Entering Routes. Press 1 to proceed");
        linklist L = new linklist();
        busInsert = 14;
        while (!sc.nextLine().isEmpty()) {
            System.out.println("Enter Route Details and Time");

            L.insert(sc.nextLine());
            System.out.println("Press 1 to add another route, press 0 to proceed");
            String m = sc.nextLine();

            if (m.equals("1")) {
                continue;
            } else if (m.equals("0")) {
                break;
            }
            busInsert = busInsert + 7;
        }
        sc.close();

        Path path = Paths.get("morp.txt");

        try (BufferedWriter fileWriter = Files.newBufferedWriter(path, StandardCharsets.UTF_8, StandardOpenOption.APPEND)) {

            fileWriter.write(S[0] + "@" + S[1] + "@" + S[2] + "@" + " % " + L.fileFormat());
            fileWriter.newLine();
        }
        busInsert += 5;

    }

    public NodeBus[] arrayCreation(NodeBus[] temp) {
        String[] word;
        String[] routes;
        int i;
        NodeBus L;
        BufferedReader reader;
        int count = 1;
        try {
            reader = new BufferedReader(new FileReader("morp.txt"));
            String line = reader.readLine();
            complexFile += 10;
            while (line != null) {
                if (line.length() <= 1) {
                    complexFile++;
                } else {
                    i = line.indexOf('%');
                    word = line.substring(0, i).split("@");
                    routes = line.substring(i + 1).split("@");

                    L = new NodeBus(word[0], word[1], Double.parseDouble(word[2]));

                    for (int o = 0; o < routes.length; o++) {
                        L.routes.insert(routes[o]);
                        complexMenuInsert++;//remove
                    }
                    temp[count] = L;
                    complexFile = complexFile + 8;
                }
                line = reader.readLine();
                count++;

            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return temp;
    }
}
