import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<String> products = new ArrayList<>();

        Scanner scaner = new Scanner(System.in);


        while (true) {
            System.out.println("Выберите необходимую операцию");
            System.out.println("1.Добавить товар к покупкам");
            System.out.println("2.Показать добавленные товары");
            System.out.println("3.Удалить товар");
            System.out.println("Передумали? введите end что бы завершить");

            String input = scaner.nextLine();
            if ("end".equals(input)) {
                break;
            }
            int operation = Integer.parseInt(input);


            switch (operation) {
                case 1:
                    System.out.println("Введите наименование товара который хотите добавить");
                    products.add(scaner.nextLine());

                    System.out.println("Итого покупок в списке:" + products.size());
                    break;

                case 2:
                    for (int i = 0; i < products.size(); i++) {
                        System.out.println((i + 1) + "." + products.get(i));
                    }
                    break;

                case 3:
                    System.out.println("Введите номер или название товара для удаления");
                    String delete = scaner.nextLine();
                    try {

                        int x = Integer.parseInt(delete) - 1;
                        System.out.println("Покупка: " + (x + 1) + " удалена");
                        products.remove(x);

                    } catch (NumberFormatException e) {
                        System.out.println("Покупка: " + delete + " удалена");

                    } finally {
                        products.remove(delete);
                    }


                    break;
                case 4:
                    System.out.println("Введите название товара для поиска");
                    String queryLower = scaner.nextLine().toLowerCase();

                    for (int i = 0; i < products.size(); i++) {
                        String itemLower = products.get(i).toLowerCase();

                        if (itemLower.contains(queryLower)) {
                            System.out.println((i + 1) + "." + products.get(i));
                            continue;
                        } else {
                            System.out.println("Такой товар не найден");


                        }
                        break;


                    }


            }


        }


    }


}












