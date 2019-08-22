package cci;

/**
 * @author Dhiraj
 * @date 03/07/19
 */
public class FullStackException extends RuntimeException {
    public FullStackException(String stack_is_full) {
        super(stack_is_full);
    }
}
