/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csvmanager;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author GCONAM
 */
public class CSVReader {
    public static final String delimiter = ",";
    public static void read(String csvFile){
        try(BufferedReader br = new BufferedReader(new FileReader(new File(csvFile)))){
            String line = "";
            String[] tempArr;
            
            while((line = br.readLine()) != null){
                tempArr = line.split(delimiter);
                for(String tempStr : tempArr){
                    System.out.print(tempStr + "");
                }
                System.out.println();
            }
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
    }
    
}
