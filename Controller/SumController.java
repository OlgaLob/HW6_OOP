package HWs.HW5.Calc.Controller;

import HWs.HW5.Calc.Model.SumIModel;
import HWs.HW5.Calc.View.View;
/**Класс управления сложением*/
public class SumController implements I_Controller{
    /**Сущность, которая взаимодействует с пользователем*/
    View view;
    /**Модель сложения*/
    SumIModel sumIModel;

    public SumController(View view, SumIModel sumIModel) {
        this.view = view;
        this.sumIModel = sumIModel;
    }
    /**Переопределение интерфейсного метода*/
    @Override
    public void doIt(){
        int a = view.getValue();
        int b = view.getValue();
        sumIModel.setX(a);
        sumIModel.setY(b);
        int result = sumIModel.result();
        view.print(result, "Сумма: ");
    }
}
