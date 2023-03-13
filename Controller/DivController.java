package HWs.HW5.Calc.Controller;
import HWs.HW5.Calc.Model.DivIModel;
import HWs.HW5.Calc.View.View;
/** Класс управления делением*/
public class DivController implements I_Controller{
    /**Сущность, которая взаимодействует с пользователем*/
    View view;
    /**Модель деления*/
    DivIModel divIModel;

    public DivController(View view, DivIModel divIModel) {
        this.view = view;
        this.divIModel = divIModel;
    }
    /**Переопределение интерфейсного метода*/
    @Override
    public void doIt(){
        int a = view.getValue();
        int b = view.getValueDiv();
        divIModel.setX(a);
        divIModel.setY(b);
        int result = divIModel.result();
        view.print(result, "Частное: ");
    }
}
