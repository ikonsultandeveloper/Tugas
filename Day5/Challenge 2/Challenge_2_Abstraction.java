import java.util.*;
import java.io.IOException;

class Control {
    public void Main() throws IOException, InterruptedException {
        //new ProcessBuilder("cmd", "/c", "Control").inheritIO().start().waitFor();
    }
}

abstract class ModelCalculator
{
    public abstract void Msg(String message);
    public Integer selectedControl;

    public void pagerBetisAtas()
    {
        System.out.println("++++++++++++++++++++CALCULATOR++++++++++++++++++++");
    }

    public void pagerBetisBawah()
    {
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
    }

    public void pagerBetisTengah()
    {
        System.out.println("--------------------------------------------------");
    }
}

class CalcControl extends ModelCalculator
{
    @Override
    public void Msg(String message){
        System.out.println(message);
    }

    public Integer getSelectedControl(){
        return this.selectedControl;
    }

    public void setSelectedControl(Integer sc){
        this.selectedControl = sc;
    }

    public void interfaceControl(){
        this.pagerBetisAtas();
        this.Msg("1: Open calculator");
        this.Msg("99: Exit");
        this.pagerBetisTengah();
        System.out.print("Pilihan anda: ");
        
        // return this.listenInputan();
    }
}

class OperationControl extends ModelCalculator{

    @Override
    public void Msg(String message){
        System.out.println(message);
    }

    public Integer getSelectedOPControl(){
        return this.selectedControl;
    }

    public void setSelectedOPControl(Integer sp){
        this.selectedControl = sp;
    }

    public void interfaceControl(){
        this.pagerBetisAtas();
        this.Msg("Please enter calculation operation:");
        this.Msg("1: ADD");
        this.Msg("2: SUBSTRACT value");
        this.Msg("3: MULTIPLY value");
        this.Msg("4: DIVIDE value");
        this.Msg("99: Exit");
        this.pagerBetisTengah();
        System.out.print("Pilihan anda: ");

        // return this.listenInputan();
    }
}

class ValueControl extends ModelCalculator{
    private Integer value1;
    private Integer value2;
    private Float result;

    @Override
    public void Msg(String message){
        System.out.println(message);
    }

    public Integer getVal1(){
        return this.value1;
    }

    public void setVal1(Integer v){
        this.value1 = v;
    }

    public Integer getVal2(){
        return this.value2;
    }

    public void setVal2(Integer v){
        this.value2 = v;
    }

    public Float getVal3(){
        return this.result;
    }

    public void setVal3(Float v){
        this.result = v;
    }

    public void interfaceControlVal1(){
        this.pagerBetisAtas();
        this.Msg("Please 1st and 2nd value below:");
        System.out.print("Value 1: ");
    }

    public void interfaceControlVal2(){
        System.out.print("Value 2: ");
    }

    public Float operationMath(Integer selectedControl){
        switch(selectedControl){
            case 1: // ADD
                Float addition = (float) (this.getVal1() + this.getVal2());
                this.setVal3(addition);
                break;
            case 2: // SUBSTRACT
                Float substraction = (float) (this.getVal1() - this.getVal2());
                this.setVal3(substraction);
                break;
            case 3: // MULTIPLY
                Float multi = (float) (this.getVal1() * this.getVal2());
                this.setVal3(multi);
                break;
            case 4: // DIVISION
                Float division = (float) (this.getVal1() / this.getVal2());
                this.setVal3(division);
                break;
            default:
                Float zero = (float) 0;
                this.setVal3(zero);

        }
        return this.getVal3();
    }
}

public class Challenge_2_Abstraction {
    public static void main(String[] args)
    {
        CalcControl cc = new CalcControl();
        Control Control = new Control();
        cc.interfaceControl();

        Scanner scannerControl = new Scanner(System.in);
        Integer pilihanControl = scannerControl.nextInt();

        cc.setSelectedControl(pilihanControl);
        cc.pagerBetisBawah();

        if(cc.getSelectedControl() == 1)
        {
            try
            {
                Control.Main();
            }
            catch (IOException e) 
            {
                e.printStackTrace();
            } catch (InterruptedException e) 
            {
                e.printStackTrace();
            }
            OperationControl oc = new OperationControl();
            oc.interfaceControl();

            pilihanControl = scannerControl.nextInt();

            oc.setSelectedOPControl(pilihanControl);
            oc.pagerBetisBawah();

            if(oc.getSelectedOPControl() != 99){
                try {
                    Control.Main();
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                ValueControl vc = new ValueControl();

                vc.interfaceControlVal1();
                Integer v1 = scannerControl.nextInt();
                vc.setVal1(v1);
                vc.interfaceControlVal2();
                Integer v2 = scannerControl.nextInt();
                vc.setVal2(v2);
                vc.pagerBetisTengah();
                
                Float hasil = vc.operationMath(oc.getSelectedOPControl());
                System.out.println("Hasil: " + hasil);
                vc.pagerBetisBawah();
            }
            else
            {
                scannerControl.close();
                return;
            }

            scannerControl.close();
        }
        else
        {
            scannerControl.close();
            try {
                Control.Main();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return;
        }
    }
}