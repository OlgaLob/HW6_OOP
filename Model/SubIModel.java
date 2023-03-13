package HWs.HW5.Calc.Model;
/**Класс вычитания */
public class SubIModel extends CalcModel{
    public SubIModel(){
    }

    /**Переопределение интерфейсных методов*/
    @Override
    public int result(){
        return x - y;
    }

    @Override
    public void setX(int value){
        super.x = value;
    }
    @Override
    public void setY(int value){
        super.y = value;
    }
}
