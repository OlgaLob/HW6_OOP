package HWs.HW5.Calc;
import HWs.HW5.Calc.Controller.DivController;
import HWs.HW5.Calc.Controller.MultController;
import HWs.HW5.Calc.Controller.SubController;
import HWs.HW5.Calc.Controller.SumController;
import HWs.HW5.Calc.Model.DivIModel;
import HWs.HW5.Calc.Model.MultModel;
import HWs.HW5.Calc.Model.SubIModel;
import HWs.HW5.Calc.Model.SumIModel;
import HWs.HW5.Calc.View.View;
import HWs.HW5.Calc.View.Menu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        View v = new View();
        Presenter p = new Presenter(new SumController(v, new SumIModel()),
                new SubController(v, new SubIModel()),
                new DivController(v, new DivIModel()),
                new MultController(v, new MultModel()),
                scanner, new Menu(scanner));
        p.start();
    }
}
