package task.service;

import task.controller.Calculate;
import task.model.RationalExample;
import task.model.enums.OperationType;

import java.util.logging.Logger;


public class SolveImpl implements Solve {

    Logger logger = Logger.getLogger(Calculate.class.getName());
    public Operation<Number> operation = new RationalOperationImpl();

    @Override
    public String solve(RationalExample example) {
        if (example.getOperation().equals(OperationType.DIFFERENCE)) {
            String difference = operation.difference(example).toString();
            logger.info("Difference: " + example + " Result: " + difference);
            return difference;
        }
        if (example.getOperation().equals(OperationType.SUMMARIZE)) {
            String sum = operation.sum(example).toString();
            logger.info("Sum: " + example + " Result: " + sum);
            return sum;
        }
        if (example.getOperation().equals(OperationType.MULTIPLY)) {
            String multiply = operation.multiply(example).toString();
            logger.info("Multiply: " + example + " Result: " + multiply);
            return multiply;
        }
        if (example.getOperation().equals(OperationType.DIVIDE)) {
            String divide = operation.divide(example).toString();
            logger.info("Divide: " + example + " Result: " + divide);
            return divide;
        }
        logger.warning("Failed to calculate value");
        return "Failed to calculate value";
    }

    @Override
    public OperationType checkOperation(String operation) {
        if (Integer.parseInt(operation)==1) {
            return OperationType.DIVIDE;
        } else if ((Integer.parseInt(operation)==2)) {
            return OperationType.SUMMARIZE;
        } else if ((Integer.parseInt(operation)==3)) {
            return OperationType.DIFFERENCE;
        } else if ((Integer.parseInt(operation)==4)) {
            return OperationType.MULTIPLY;
        } else {
            return OperationType.SUMMARIZE;
        }
    }
}
