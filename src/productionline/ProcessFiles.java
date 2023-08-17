/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package productionline;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;

/**
 *
 * @author Clutz
 */
public class ProcessFiles {

    private Path p;
    private Path p2;
    private Path p3;

    public ProcessFiles() throws IOException {
        p = Paths.get("C:\LineTests");
        p2 = Paths.get("TestResults.txt");
        p3 = p.resolve(p2);
        CreateDirectory();
    }

    private void CreateDirectory() throws IOException {
        if (!Files.exists(p)) {
            Files.createDirectory(p);
        }
    }

    public void WriteFile(EmployeeInfo emp) throws IOException {
        BufferedWriter writer = Files.newBufferedWriter(p3, StandardCharsets.UTF_8);
        writer.write("Employee info: code=" + emp.getCode() + ", deptId=" + emp.getDeptId() + "\n");
        writer.close();
    }

    public void WriteFile(ArrayList<Product> products) throws IOException {
        BufferedWriter writer = Files.newBufferedWriter(p3, StandardCharsets.UTF_8);
        for (Product product : products) {
            writer.write(product.toString() + "\n");
        }
        writer.close();
    }
}