package HWs.HW5.Calc.Model;

/**Класс умножения*/
public class MultModel extends CalcModel{
    public MultModel(){
    }

    /**Переопределение интерфейсных методов*/
    @Override
    public int result(){
        return x*y;
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
