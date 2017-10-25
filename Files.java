/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Santosh Goteti
 */
public class Files {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {

        String fname = "random.txt";
        File Filename = new File("C:\\Users\\S528130\\Documents\\NetBeansProjects\\Files\\random.txt");

        String wd = System.getProperty("user.dir");
        System.out.println(wd);
        String fullpath = wd + File.separator + fname;
        //  String fullpath = wd + File.separator + Filename;

        try {
            String text;
            BufferedReader br = new BufferedReader(new FileReader(fullpath));
            while ((text = br.readLine()) != null) {
                System.out.println(text);

            }
        } catch (FileNotFoundException fe) {
            fe.printStackTrace();
        } catch (IOException io) {
            io.printStackTrace();
        }

    }

}
