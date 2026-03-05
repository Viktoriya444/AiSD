public class Zad_11 {

    public static int evaluate(String expression, int a, int b) {
        Stack stack = new Stack();
        String[] tokens = expression.split(" ");

        for (String elem : tokens) {
            if (elem.equals("+") || elem.equals("-") || elem.equals("*")) {
                StackNode op2 = stack.remove();
                StackNode op1 = stack.remove();

                if (op1 == null || op2 == null) {
                    throw new IllegalArgumentException("Ошибка: для выполнения операции '" + elem + "' требуется два операнда, но обнаружена их нехватка");
                }

                int result;
                switch (elem) {
                    case "+":
                        result = op1.getValue() + op2.getValue();
                        break;
                    case "-":
                        result = op1.getValue() - op2.getValue();
                        break;
                    case "*":
                        result = op1.getValue() * op2.getValue();
                        break;
                    default:
                        throw new IllegalArgumentException("Ошибка: операция '" + elem + "' не поддерживается калькулятором");
                }

                stack.add(new StackNode(result));

            } else {
                int value;
                switch (elem) {
                    case "A":
                        value = a;
                        break;
                    case "B":
                        value = b;
                        break;
                    default:
                        throw new IllegalArgumentException("Ошибка: значение '" + elem + "' не является допустимым операндом");
                }

                stack.add(new StackNode(value));
            }
        }

        if (stack.getSize() != 1) {
            throw new IllegalArgumentException("Ошибка в выражении: после вычислений в стеке осталось " +
                    stack.getSize() + " элементов (ожидался 1 элемент)");
        }

        return stack.remove().getValue();
    }
}
