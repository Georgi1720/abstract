package service;

import task1.model.RationalExample;
import task1.model.enums.OperationType;

/**
 * Interface for actions with expressions
 */
public interface Solve {

    String solve(RationalExample example);

    OperationType checkOperation(String operation);
}
