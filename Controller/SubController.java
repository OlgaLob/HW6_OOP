package HWs.HW5.Calc.Controller;
import HWs.HW5.Calc.Model.SubIModel;
import HWs.HW5.Calc.View.View;
/**Класс управления вычитанием*/
public class SubController implements I_Controller{
    /**Сущность, которая взаимодействует с пользователем*/
    View view;
    /**Модель вычитания*/
    SubIModel subIModel;

    public SubController(View view, SubIModel subIModel) {
        this.view = view;
        this.subIModel = subIModel;
    }
    /**Переопределение интерфейсного метода*/
    @Override
    public void doIt(){
        int a = view.getValue();
        int b = view.getValue();
        subIModel.setX(a);
        subIModel.setY(b);
        int result = subIModel.result();
        view.print(result, "Разность: ");
    }
}
