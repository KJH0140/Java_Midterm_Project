public class Calculator
{
    int num1;
    int num2;
    int result;

    public void setNumbers(int num1, int num2)
    {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int add()
    {
        result = num1 + num2 + 1;
        return result;
    }

    public int subtract()
    {
        result = num1 - num2;
        return result;
    }

    public int multiply()
    {
        return 0;
    }

    public int divide()
    {
        return 0;
    }

    public void displayResult(String operator)
    {
        System.out.println(num1 + " " + operator + " " + num2 + " " + "=" + " " + result);
    }

    public void displayResultforSpecificPercentage(String operator)
    {
        System.out.println(num1 + "의 " + num2 + operator + "는 " + result + "입니다.");
    }

    public void displayResultforPercentageof(String operator)
    {
        ScientificCalculator sci = new ScientificCalculator();
        sci.num1 = this.num1;
        sci.num2 = this.num2;
        double result = sci.percentageof();
        System.out.println(num2 + "는 " + num1 + "의 " + result + operator + "입니다.");
    }
}