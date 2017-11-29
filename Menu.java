package test;

/**
 * @author Oleg
 */

import java.text.SimpleDateFormat;
import java.util.*;

public class Menu {

    /**
     * @param args the command line arguments
     */
    private List<String> costs = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.mainMenu();
    }

    private void mainMenu() {
        int chosenItem;
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        //System.out.println(sdf.format(calendar.getTime()));

        System.out.println("1: Добавить Расход \n" +
                "2: Поиск Расходов \n" +
                "3: Добавить Доход \n" +
                "0: Выход \n" +
                "Введите номер пункта меню:");

        choosenItem = sc.nextInt();
        switch (chosenItem) {
            case 1:
                addCost();
                break;
            case 2:
                searchCost();
                break;
            case 3:
                addIncome();
                break;
            case 0:
                System.out.print("Good Bye");
                System.exit(0);
            default:
                System.out.println("Неверное число");
                mainMenu();
        }
    }

    private void addIncome() {
        System.out.println(" Ваш Доход: ");

        System.out.println("------------");
        mainMenu();
    }

    private void addCost() {
        System.out.println(" Ваш Расход: ");

        System.out.println("------------");
        mainMenu();
    }

    private void searchCost() {
        System.out.println("Расходы: ");

        System.out.println("------------");
        mainMenu();
    }
}
