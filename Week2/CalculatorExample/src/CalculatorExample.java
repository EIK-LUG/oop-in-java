
class Calculator {

    /**
     * Gets the priority scope out of an expression.
     *
     * Example:
     *
     *      "6/7*5-8" <- getPriorityScope( "(2+3+(6/7*5-8))" )
     *
     * @param expression Any expression with basic operations and scopes
     * @return The priority scope
     */
    private String getPriorityScope(String expression) {
        return "";
    }

    /**
     * Gets the priority simple expression out of an expression with no scopes.
     *
     * Example:
     *
     *      "6/7" <- getPrioritySimpleExpression( "6/7*5-8" )
     *
     * @param noScopeExpression An expression with no scopes
     * @return A simple expression
     */
    private String getPrioritySimpleExpression(String noScopeExpression) {
        return "";
    }

    /**
     * Calculates the value of a simple expression.
     *
     * Example:
     *
     *      "0.86" <- calculateSimpleExpression( "6/7" )
     *
     * @param simpleExpression Just one calculation expression
     * @return The answer in String form
     */
    private String calculateSimpleExpression(String simpleExpression) {
        return "";
    }

    /**
     * Replaces an evaluated simple expressions answer into the original expression
     *
     * Example:
     *
     *      "(2+3+(0.86*5-8))" <- replaceExpressionWithAnswer( "(2+3+(6/7*5-8))" , "6/7" , "0.86")
     *
     * @param originalExpression The original expression
     * @param simpleExpression The simple expression that was calculated
     * @param simpleExpressionAnswer The result of the simple expression that was calculated
     * @return The original expression with the simple expression replaced with the result of the simple expression
     */
    private String replaceExpressionWithAnswer(String originalExpression, String simpleExpression, String simpleExpressionAnswer) {
        return "";
    }

    /**
     * Check if this expression is the answer. Is is just a number with nothing left to calculate.
     *
     * Example:
     *
     *      false <- isAnswer( "(2+3+(0.86*5-8))" )
     *      true  <- isAnswer( "1.29" )
     *
     * @param expression Some expression
     * @return Is it a single number
     */
    private boolean isAnswer(String expression) {
        return false;
    }

    /**
     * Take an arbitrary expression consisting of basic operations (+,-,*,/) and scopes ( "()" ).
     *
     * Algorithm:
     *
     *      1) Evaluate the highest priority simple expression
     *          1.1) Get the highest priority scope
     *          1.2) Get the highest priority simple expression in that scope
     *          1.3) Evaluate that simple expression
     *      2) Replace that expression with its answer
     *      3) Do again with the updated expression until there is nothing left to calculate.
     *
     * Example:
     *
     *      calculate( "(2+3+(6/7*5-8))" ) -> "1.29"
     *
     * @param originalExpression Arbitrary expression
     * @return The answer to the expression
     */
    public String calculate(String originalExpression) {

        /*
        * 1. originalExpression = "(2+3+(6/7*5-8))"
        * 2. originalExpression = "(2+3+(0.86*5-8))"
        * 3. originalExpression = "(2+3+(4.3-8))"
        * 4. originalExpression = "(2+3+(-3.7))"
        * 5. originalExpression = "(5+(-3.7))"
        * 6. originalExpression = "1.3" Answer!
        * */


        // If there is nothing to calculate, return the answer.
        if (isAnswer(originalExpression)) {
            return originalExpression;
        }

        String priorityScope = getPriorityScope(originalExpression);

        String prioritySimpleExpression = getPrioritySimpleExpression(priorityScope);

        String simpleExpressionAnswer = calculateSimpleExpression(prioritySimpleExpression);

        String updatedOriginalExpression = replaceExpressionWithAnswer(originalExpression, prioritySimpleExpression, simpleExpressionAnswer);

        //Do the same process again with a slightly simplified expression
        return calculate(updatedOriginalExpression);

    }

}

public class CalculatorExample {

    public static void main(String[] args) {

        //Test here

        Calculator calc = new Calculator();

        System.out.println(calc.calculate("2+3/3*4"));

    }

}