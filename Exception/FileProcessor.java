package Exception;
import java.io.*;
import java.nio.file.*;
import java.util.*;

 public class FileProcessor {


    public void processFiles(List<String> filePaths) {

        for (String path : filePaths) {


            try (BufferedReader br = Files.newBufferedReader(Paths.get(path))) {

                String line;
                System.out.println("----- Reading: " + path + " -----");

                while ((line = br.readLine()) != null) {

                    System.out.println(line);
                }

            } catch (IOException e) {
                System.out.println("Error reading file: " + path);
                System.out.println("Reason: " + e.getMessage());
            }

        }
    }
}



class main   {
        public static void main(String[] args) {

            FileProcessor fp = new FileProcessor();

            List<String> files = Arrays.asList(
                    "data1.txt",
                    "data2.txt",
                    "missing.txt"
            );

            fp.processFiles(files);
        }
    }

