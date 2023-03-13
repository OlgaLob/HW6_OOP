package HWs.HW5.Calc;
import HWs.HW5.Calc.Controller.DivController;
import HWs.HW5.Calc.Controller.MultController;
import HWs.HW5.Calc.Controller.SubController;
import HWs.HW5.Calc.Controller.SumController;
import HWs.HW5.Calc.View.Menu;

import java.util.Scanner;
/**Класс, запускающий действие в зависимости от выбора пользователя*/
public class Presenter {
    SumController sumController;
    SubController subController;
    DivController divController;
    MultController multController;
    Menu menu;
    Scanner scanner;

    public Presenter(SumController sumController, SubController subController,
                     DivController divController, MultController multController,
                     Scanner scanner, Menu menu) {
        this.sumController = sumController;
        this.subController = subController;
        this.divController = divController;
        this.multController = multController;
        this.menu = menu;
        this.scanner = scanner;
    }
    /**Метод запускает работу с калькулятором*/
    public void start(){
        while (true){
            switch (menu.selectFunction()){
                case "1" ->
                    sumController.doIt();
                case "2" ->
                    subController.doIt();
                case "3" ->
                    divController.doIt();
                case "4" ->
                    multController.doIt();
                case "0" ->
                    System.exit(0);
                default -> System.out.println("Неверный ввод");
            }
        }
    }
}
