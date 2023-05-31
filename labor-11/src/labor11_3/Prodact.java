package labor11_3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

class Product implements Comparable<Product> {
    private int id;
    private String name;
    private int amount;
    private int price;

    public Product(int id, String name, int amount, int price) {
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public int getPrice() {
        return price;
    }

    public void increaseAmount(int newAmount) {
        amount += newAmount;
    }

    @Override
    public int compareTo(Product other) {
        return Integer.compare(id, other.id);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", amount=" + amount +
                ", price=" + price +
                '}';
    }
}

class Storage {
    private Set<Product> products;

    public Storage(String filename) {
        products = new TreeSet<>();
        readProductsFromFile(filename);
    }

    private void readProductsFromFile(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\s+");
                int id = Integer.parseInt(parts[0]);
                String name = parts[1];
                int amount = Integer.parseInt(parts[2]);
                int price = Integer.parseInt(parts[3]);
                products.add(new Product(id, name, amount, price));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void update(String updateFile) {
        int successfulUpdates = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(updateFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\s+");
                int id = Integer.parseInt(parts[0]);
                int newAmount = Integer.parseInt(parts[1]);

                for (Product product : products) {
                    if (product.getId() == id) {
                        product.increaseAmount(newAmount);
                        successfulUpdates++;
                        break;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Number of products successfully updated: " + successfulUpdates);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Product product : products) {
            sb.append(product.toString()).append("\n");
        }
        return sb.toString();
    }
}

