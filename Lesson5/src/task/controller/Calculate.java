package task.controller;

import task.config.LoggerConfig;
import task.model.RationalExample;
import task.service.Solve;
import task.service.SolveImpl;
import task.view.Menu;

import java.io.IOException;

/**
 * Class linking model and view
 */
public class Calculate {
    public Solve solve = new SolveImpl();

    public void start() {
        Menu menu = new Menu();
        try {
            LoggerConfig.config();
        } catch (IOException e) {
            menu.showMessage("Error", "Problem with logging");
        }

        String action;
        do {
            action = menu.showMenu();
            if (action.equals("0")) {
                return;
            }
            RationalExample example = new RationalExample(solve.checkOperation(action));
            Number[] values = menu.getValues();
            example.setVariableA(values[0]);
            example.setVariableB(values[1]);
            try {
                menu.showMessage("Result", solve.solve(example));
            } catch (NullPointerException e) {
                menu.showMessage("Error", "Incorrect data. Please, input values again");
            }
        } while (true);
    }
}
