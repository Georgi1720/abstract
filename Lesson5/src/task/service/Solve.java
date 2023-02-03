package task.service;

import task.model.RationalExample;
import task.model.enums.OperationType;

/**
 * Interface for actions with expressions
 */
public interface Solve {

    String solve(RationalExample example);

    OperationType checkOperation(String operation);
}
