package org.example.HomeWork;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<NoteBook> notebooks = new ArrayList<>();

        laptops(notebooks);

        Map<String, Object> filters = new HashMap<>();

        filterSelection(filters);

        List<NoteBook> filteredNotebooks = filter(notebooks, filters);

        if (filteredNotebooks.size() == 0) {
            System.out.println("Нет ноутбуков, удовлетворяющих критерию фильтрации");
        } else {
            for (NoteBook notebook : filteredNotebooks) {
                System.out.println(notebook.getManufacturer() + " " + notebook.getModel() + " " + notebook.getScreenSize() + " "
                        + notebook.getScreenResolution() + " " + notebook.getRam() + " " + notebook.getHdd() +
                        " " + notebook.getOs() + " " + notebook.getColor() + " " + notebook.getPrice());
            }
        }
    }

    /**
     * @param notebooks
     * @apiNote Заполнение ноутов класса NoteBook и добавление в List
     */
    private static void laptops(List<NoteBook> notebooks) {
        NoteBook lap1 = new NoteBook("Acer", "AcerBook123", 17, 1024, "black", 4, "Windows", 1024, 100000.0);
        NoteBook lap2 = new NoteBook("Acer", "AcerBook125", 19, 3076, "black", 16, "Windows", 2048, 120000.0);
        NoteBook lap3 = new NoteBook("Lenovo", "E15", 17, 1024, "white", 4, "Windows", 512, 70000.0);
        NoteBook lap4 = new NoteBook("Lenovo", "E17", 17, 1024, "black", 8, "Windows", 1024, 110000.0);
        NoteBook lap5 = new NoteBook("HP", "PavilionG6", 16, 768, "black", 4, "Windows", 320, 80000.0);
        NoteBook lap6 = new NoteBook("HP", "PavilionGV7", 17, 1024, "red", 4, "Windows", 512, 150000.0);
        notebooks.add(lap1);
        notebooks.add(lap2);
        notebooks.add(lap3);
        notebooks.add(lap4);
        notebooks.add(lap5);
        notebooks.add(lap6);
    }

    /**
     * @param filters
     * @apiNote Выбор пораметра по которому будем искать ноут, заполняем Map
     */
    private static void filterSelection(Map<String, Object> filters) {
        System.out.println("Выберите критерий фильтрации:");
        System.out.println("1 - Производитель");
        System.out.println("2 - Модель");
        System.out.println("3 - Минимальный размер дисплея");
        System.out.println("4 - Минимальный разрешение дисплея");
        System.out.println("5 - Минимальное количество оперативной памяти");
        System.out.println("6 - Операционная система");
        System.out.println("7 - Минимальный объем жесткого диска");
        System.out.println("8 - Цвет");
        System.out.println("9 - Максимальныю цену");
        Scanner scanner = new Scanner(System.in);
        int filterNumber = scanner.nextInt();
        String filterKey = "";
        switch (filterNumber) {
            case 1:
                filterKey = "manufacturer";
                System.out.println("Введите производителя: ");
                String manufacturer = scanner.next();
                filters.put(filterKey, manufacturer);
                break;
            case 2:
                filterKey = "model";
                System.out.println("Введите модель: ");
                String model = scanner.next();
                filters.put(filterKey, model);
                break;
            case 3:
                filterKey = "screenSize";
                System.out.println("Введите минимальный размер дисплея: ");
                int screenSize = scanner.nextInt();
                filters.put(filterKey, screenSize);
                break;
            case 4:
                filterKey = "screenResolution";
                System.out.println("Введите минимальное разрешение дисплея: ");
                int ScreenResolution = scanner.nextInt();
                filters.put(filterKey, ScreenResolution);
                break;
            case 5:
                filterKey = "RAM";
                System.out.println("Введите минимальный объем оперативной памяти: ");
                int RAM = scanner.nextInt();
                filters.put(filterKey, RAM);
                break;
            case 6:
                filterKey = "os";
                System.out.println("Введите операционную систему: ");
                String os = scanner.next();
                filters.put(filterKey, os);
                break;
            case 7:
                filterKey = "HDD";
                System.out.println("Введите минимальный объем жесткого диска: ");
                int HDD = scanner.nextInt();
                filters.put(filterKey, HDD);
                break;
            case 8:
                filterKey = "color";
                System.out.println("Введите цвет: ");
                String color = scanner.next();
                filters.put(filterKey, color);
                break;
            case 9:
                filterKey = "price";
                System.out.println("Введите максимальную цену: ");
                double price = scanner.nextDouble();
                filters.put(filterKey, price);
                break;
        }
    }

    /**
     * @param notebooks база ноутбуков
     * @param filters параметры для поиска
     * @return список отфильтрованный
     * @apiNote Поиск по заданным параметрам
     */
    public static List<NoteBook> filter(List<NoteBook> notebooks, Map<String, Object> filters) {
        List<NoteBook> filteredNotebooks = new ArrayList<>();
        for (NoteBook notebook : notebooks) {
            for (String filterKey : filters.keySet()) {
                Object filterValue = filters.get(filterKey);
                switch (filterKey) {
                    case "manufacturer":
                        if (notebook.getManufacturer().equalsIgnoreCase((String) filterValue)) {
                            filteredNotebooks.add(notebook);
                        }
                        break;
                    case "model":
                        if (notebook.getModel().equals(filterValue)) {
                            filteredNotebooks.add(notebook);
                        }
                        break;
                    case "screenSize":
                        if (notebook.getScreenSize() >= (int) filterValue) {
                            filteredNotebooks.add(notebook);
                        }
                        break;
                    case "screenResolution":
                        if (notebook.getScreenResolution() >= (int) filterValue) {
                            filteredNotebooks.add(notebook);
                        }
                        break;
                    case "RAM":
                        if (notebook.getRam() >= (int) filterValue) {
                            filteredNotebooks.add(notebook);
                        }
                        break;
                    case "HDD":
                        if (notebook.getHdd() >= (int) filterValue) {
                            filteredNotebooks.add(notebook);
                        }
                        break;
                    case "os":
                        if (notebook.getOs().equalsIgnoreCase((String) filterValue)) {
                            filteredNotebooks.add(notebook);
                        }
                        break;
                    case "color":
                        if (notebook.getColor().equals(filterValue)) {
                            filteredNotebooks.add(notebook);
                        }
                        break;
                    case "price":
                        if (notebook.getPrice() <= (double) filterValue) {
                            filteredNotebooks.add(notebook);
                        }
                        break;
                }
            }
        }
        return filteredNotebooks;
    }
}

