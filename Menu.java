package test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author Oleg
 */
import java.text.SimpleDateFormat;
import java.util.*;
public class Menu {

    /**
     * @param args the command line arguments
     */
    private List<String> Costs = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);
    
 
    public static void main(String[] args){
        Menu menu = new Menu();
        menu.mainMenu();
        
        
    }
 
    private void mainMenu(){
        int var;
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        //System.out.println(sdf.format(calendar.getTime()));
        System.out.println("1: Добавить Расход \n" +
                "2: Поиск Расходов \n" +
                "3: Добавить Доход \n"+
                "0: Выход \n" +
                "Введите номер пункта меню:");
        var = sc.nextInt();
        if (var == 1){
            addCost();
        }else if (var == 2){
            searchCost();
        }else if (var == 3){
            addIncome();
        }else if (var == 0){
            System.out.print("Good Bye");
            System.exit(0);
        }else if (var >= 4){
            System.out.println("Неверное число");
            mainMenu();
        }
    }
    private void addIncome(){
        
        System.out.println(" Ваш Доход: ");
        
        System.out.println("------------");
        mainMenu();
    }
 
    private void addCost() {
        System.out.println(" Ваш Расход: ");
        
        System.out.println("------------");
        mainMenu();
    }
 
    private void searchCost(){
        System.out.println("Расходы: ");
        
        System.out.println("------------");
        mainMenu();
    }
}
