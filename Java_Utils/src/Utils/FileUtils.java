package Utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileUtils {
    /**
     * 
     * Reads the content of a file into a single string.
     * 
     * @param filePath The path of the file to read.
     * @return The content of the file as a string.
     */
    public static String readTextFile(String filePath) {
        try {
            StringBuilder sb = new StringBuilder();
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line = br.readLine();
            while (line != null) {
                sb.append(line).append("\n");
                line = br.readLine();
            }
            br.close();
            return sb.toString();
        } catch (FileNotFoundException e) {
            System.out.println("Error: file " + filePath + " not found");
        } catch (IOException e) {
            System.out.println("Error: cannot read file");
        }
        return null;
    }

    /**
     * 
     * Writes a string to a file. If the file already exists and overwrite is false,
     * the contents will be appended to the end of the file. If overwrite is true,
     * the file will be overwritten.
     * 
     * @param filePath  The path of the file to write to.
     * @param contents  The string to write to the file.
     * @param overwrite Whether to overwrite the file if it already exists.
     */
    public static void writeTextFile(String filePath, String contents, boolean overwrite) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(filePath, !overwrite));
            bw.write(contents);
            bw.newLine();
            bw.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: file " + filePath + " not found");
        } catch (IOException e) {
            System.out.println("Error: cannot write to file");
        }
    }
}
