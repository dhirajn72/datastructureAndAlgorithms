package test;

/**
 * @author Dhiraj
 * @date 15/06/19
 */
enum Roles {
    USER(ActionType.READ, ActionType.WRITE),
    ADMIN(ActionType.READ, ActionType.WRITE, ActionType.DELETE),
    GUEST(ActionType.READ);

    Roles(ActionType delete) {
    }

    Roles(ActionType read, ActionType write) {
    }

    Roles(ActionType read, ActionType write, ActionType delete) {
    }
}
