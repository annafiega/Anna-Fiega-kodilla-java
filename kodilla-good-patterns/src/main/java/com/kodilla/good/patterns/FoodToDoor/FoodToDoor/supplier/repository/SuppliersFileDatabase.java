package com.kodilla.good.patterns.FoodToDoor.FoodToDoor.supplier.repository;


import com.kodilla.good.patterns.FoodToDoor.FoodToDoor.product.Product;
import com.kodilla.good.patterns.FoodToDoor.FoodToDoor.supplier.Supplier;
import com.kodilla.good.patterns.FoodToDoor.FoodToDoor.supplier.SupplierClassCreator;
import com.kodilla.good.patterns.FoodToDoor.FoodToDoor.supplier.SupplierNotFoundException;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*public class SuppliersFileDatabase implements SupplierRepository {

    private static final String DELIMITER = ";";

    @Override
    public Supplier getSupplier(String name) {
        ArrayList<Product> products = new ArrayList<>();
        try {
            products = readProducts(name);
        } catch (IOException e) {
            System.out.println("File for selected supplier not found.");
        }
        SupplierClassCreator supplierCreator = new SupplierClassCreator(name);
        try {
            return supplierCreator.constructClass(products);
        } catch (SupplierNotFoundException e) {
            System.out.println("Supplier not found");
            return null;
        }
    }

    private ArrayList<Product> readProducts(String supplierName) throws IOException {
        ClassLoader classLoader = getClass().getClassLoader();
        try {
            File file = new File(classLoader.getResource("food2door/" + supplierName + ".txt").getFile());

            try (Stream<String> fileLines = Files.lines(Paths.get(file.getPath()))) {
                return fileLines.map(this::lineToProduct).collect(Collectors.toCollection(ArrayList::new));
            }
        } catch (NullPointerException e) {
            System.out.println("File for selected supplier not exists");
            return new ArrayList<>();
        }
    }

    private Product lineToProduct(String line) {
        StringTokenizer tokenizer = new StringTokenizer(line, DELIMITER);
        ArrayList<String> strings = new ArrayList<>();

        while (tokenizer.hasMoreElements()) {
            strings.add(tokenizer.nextToken());
        }
        return new Product(strings.get(1), strings.get(0), new BigDecimal(strings.get(2)), Integer.parseInt(strings.get(3)));
    }
}*/

public class SuppliersFileDatabase implements SupplierRepository {

    private static final String DELIMITER = ";";

    @Override
    public Supplier getSupplier(String name) {
        ArrayList<Product> products = new ArrayList<>();
        try {
            products = readProducts(name);
        } catch (IOException e) {
            System.out.println("File for selected supplier not found.");
        }catch (URISyntaxException e){
            System.out.println("Incorrect path");
        }
        SupplierClassCreator supplierCreator = new SupplierClassCreator(name);
        try {
            return supplierCreator.constructClass(products);
        } catch (SupplierNotFoundException e) {
            System.out.println("Supplier not found");
            return null;
        }
    }

    private ArrayList<Product> readProducts(String supplierName) throws IOException, URISyntaxException {
        ClassLoader classLoader = getClass().getClassLoader();

        /*File file = new File(classLoader.getResource("food2door/" + supplierName + ".txt").getFile());
        //File file = new File("C:\\Users\\Fiega XPS\\Documents\\Development\\Projects\\kodilla-course\\kodilla-good-patterns\\out\\production\\resources\\food2door\\ExtraFoodShop.txt");
        //System.out.println(file);
        String str=file.toString().replaceAll("%20"," " );
        System.out.println(str);*/

        try {
            //File file1 = new File(classLoader.getResource("food2door/" + supplierName + ".txt").getFile());
            File file = new File("C:\\Users\\Fiega XPS\\Documents\\Development\\Projects\\kodilla-course\\kodilla-good-patterns\\out\\production\\resources\\food2door\\ExtraFoodShop.txt");


            try(Stream<String>s=Files.lines(Paths.get(file.getPath()))){
                s.forEach(System.out::println);}
            catch( Exception e){
                System.out.println("chuj nie działa");
            }

            try (Stream<String> fileLines = Files.lines(Paths.get(file.getPath()))) {
                return fileLines.map(this::lineToProduct).collect(Collectors.toCollection(ArrayList::new));

            }
        } catch (NullPointerException e) {
            System.out.println("File for selected supplier not exists");
            return new ArrayList<>();
        }
    }

    private Product lineToProduct(String line) {
        StringTokenizer tokenizer = new StringTokenizer(line, DELIMITER);
        ArrayList<String> strings = new ArrayList<>();

        while (tokenizer.hasMoreElements()) {
            strings.add(tokenizer.nextToken());
        }
        return new Product(strings.get(1), strings.get(0), new BigDecimal(strings.get(2)), Integer.parseInt(strings.get(3)));
    }
}
