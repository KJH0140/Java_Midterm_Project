public class Main
{
    public static void main(String[] args)
    {
        Calculator calc_add = new Calculator();
        calc_add.setNumbers(5, 3);
        calc_add.add();
        calc_add.displayResult("+");

        Calculator calc_sub = new Calculator();
        calc_sub.setNumbers(5, 3);
        calc_sub.subtract();
        calc_sub.displayResult("-");

        Calculator calc_mul = new AdvancedCalculator();
        calc_mul.setNumbers(5, 3);
        calc_mul.multiply();
        calc_mul.displayResult("*");

        Calculator calc_div = new AdvancedCalculator();
        calc_div.setNumbers(10, 2);
        calc_div.divide();
        calc_div.displayResult("/");

        AdvancedCalculator calc_sp = new ScientificCalculator();
        calc_sp.setNumbers(200, 5);
        calc_sp.specificpercentage();
        calc_sp.displayResultforSpecificPercentage("%");

        AdvancedCalculator calc_po = new ScientificCalculator();
        calc_po.setNumbers(200, 5);
        calc_po.percentageof();
        calc_po.displayResultforPercentageof("%");
    }
}
