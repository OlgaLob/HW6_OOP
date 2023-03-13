package HWs.HW5.Calc.Model;
/**Класс целочисленного деления*/
public class DivIModel extends CalcModel{
    public DivIModel(){
    }
    /**Переопределение интерфейсных методов*/
    @Override
    public int result(){
        return x/y;
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
