package NormalizeText.utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author duykhanh
 */
public class Files {
    public static String readFileToString(String filePath) {
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

    public static void writeStringToFile(String filePath, String contents) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(filePath));
            bw.write(contents);
            bw.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: file " + filePath + " not found");
        } catch (IOException e) {
            System.out.println("Error: cannot write to file");
        }
    }
}
