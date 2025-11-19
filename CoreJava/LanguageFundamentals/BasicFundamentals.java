/*
A name in Java Program is called as Identifier.
It can be used for the identification purpose. 
It can be a method name, variable name, class name, label name.
So a name in Java Program is defined as Identifier.
*/
package CoreJava.LanguageFundamentals;

public class BasicFundamentals {
    public static void main(String[] args) {
        int num = 10;
    }
}

/*
 * In the above code there are Identifier such as 'BasicFundamentals', 'main',
 * 'String', 'args', 'num' and so on...
 * 
 * //Rules for defining Java Identifiers:
 * 1. The only allowed characters in java identifiers are 'a to z', 'A to Z', '0
 * to 9', '$' and '_'.
 * If we are using any other character, we will get compile time error.
 * e.g. total_number is correct, total# is incorrect.
 * 2. Identifiers can't start with digit.
 * e.g. total123 is correct, 123total is incorrect.
 * 3.Java Identifiers are case sensitive as Java itself is treated as Case
 * Sensitive Programming language.
 * e.g. 'number', 'Number' and 'NUMBER', this can be differentiated with respect
 * to the case.
 * 4. There is no length limit for java identifiers.
 * Recommended is to use short identifiers and not too lengthy.
 * 5. Reserved words can't be used as Identifier.
 * e.g. int x = 10; //correct
 * int if = 20; //incorrect
 * 6. All pre-definied java class names and interface names we can use as
 * identifiers.
 * e.g. int String = 88; //correct
 * int Runnable = 99; //correct
 * Note:
 */
