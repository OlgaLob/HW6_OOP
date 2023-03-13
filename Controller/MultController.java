package HWs.HW5.Calc.Controller;
import HWs.HW5.Calc.Model.MultModel;
import HWs.HW5.Calc.View.View;
/**Класс управления умножением*/
public class MultController implements I_Controller {
    /**Сущность, которая взаимодействует с пользователем*/
    View view;
    /**Модель умножения*/
    MultModel multModel;

    public MultController(View view, MultModel multModel) {
        this.view = view;
        this.multModel = multModel;
    }
    /**Переопределение интерфейсного метода*/
    @Override
    public void doIt(){
        int a = view.getValue();
        int b = view.getValue();
        multModel.setX(a);
        multModel.setY(b);
        int result = multModel.result();
        view.print(result, "Произведение: ");
    }
}
