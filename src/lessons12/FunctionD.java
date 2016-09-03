package lessons12;

import java.util.function.Function;

/**
 * Created by Denni on 04.09.2016.
 */
public class FunctionD implements Function<Integer, Integer> {
    @Override
    public Integer apply(Integer integer) {
        return integer +  5/*<ConstantsDDD.ADD_SALARY_CONST*/;
    }
}
