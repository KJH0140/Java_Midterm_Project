public class ScientificCalculator extends AdvancedCalculator{

    @Override
    public int specificpercentage()
    {
        result = num1 * num2 / 100;
        return result;
    }

    @Override
    public double percentageof()
    {
        return (double) num2 / num1 * 100;
    }
}
