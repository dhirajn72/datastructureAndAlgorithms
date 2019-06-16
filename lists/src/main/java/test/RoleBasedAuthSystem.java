package test;

import java.util.*;

/**
 * @author Dhiraj
 * @date 15/06/19
 */
public class RoleBasedAuthSystem {
    public static void main(String[] args) {
        Map<String, Set<Roles>> userRolesMap = new HashMap<>();
        Map<Roles, Set<ActionType>> rolesToActionMap = new HashMap<>();

        boolean flag = true;
        while (flag) {
            makeChoice();
            int choice = getChoiceFromUser();
            switch (choice) {
                case 1:
                    _addUserAndAssignRoles(userRolesMap);
                    break;
                case 2:
                    _revokeRoles(userRolesMap);
                    break;
                case 3:
                    System.out.println("Resources are protected by roles: ");
                    System.out.println("Please enter your username to access the resources: ");
                    String username = getInputFromUser();
                    if (userRolesMap.get(username) != null) {
                        _adminAccess(userRolesMap, username);
                    } else {
                        System.out.println(username + " does not exists in our system !");
                    }
                    break;
                case 4:
                    flag = false;
            }
        }
        System.out.println("Thank you ! Bye bye !");
    }

    public static void _adminAccess(Map<String, Set<Roles>> userRolesMap, String username) {
        Set<Roles> roles = userRolesMap.get(username);
        System.out.println(username + " has below roles.");
        System.out.println(roles);
        if (roles.contains(Roles.ADMIN)) {
            System.out.println("You have all the roles to READ,WRITE,DELETE resources");
            System.out.println("Resources are book list:");
            _viewResource();
            boolean actionChoiceFlag = true;
            do {
                System.out.println("You're allowed for below operations:");
                System.out.println("1. Add");
                System.out.println("2. Delete");
                System.out.println("3. View");
                System.out.println("4. Exit");
                int actionChoice = getChoiceFromUser();
                switch (actionChoice) {
                    case 1:
                        _modifyResource();
                        break;
                    case 2:
                        System.out.println("Enter book id to delete");
                        int deleteId = getChoiceFromUser();
                        System.out.println(Resource.bookList.remove(deleteId) + " deleted successfully !");
                        break;
                    case 3:
                        _viewResource();
                        break;
                    case 4:
                        actionChoiceFlag = false;
                }
            } while (actionChoiceFlag);
        } else if (roles.contains(Roles.USER)) {
            _userAccess();
        } else if (roles.contains(Roles.GUEST)) {
            _guestAccess();
        }
    }

    public static void _modifyResource() {
        System.out.println("Enter book name:");
        String bookName = getInputFromUser();
        int maxId = Resource.bookList.size();
        Resource.bookList.put(maxId, bookName);
        System.out.println(bookName + " added successfully !");
        return;
    }

    public static void _userAccess() {
        System.out.println("You have the roles to READ,WRITE resources");
        System.out.println("Resources are book list:");
        _viewResource();
        boolean actionChoiceFlag = true;
        do {
            System.out.println("You're allowed for below operations:");
            System.out.println("1. Add");
            System.out.println("2. View");
            System.out.println("3. Exit");
            int actionChoice = getChoiceFromUser();
            switch (actionChoice) {
                case 1:
                    _modifyResource();
                case 2:
                    _viewResource();
                    break;
                case 3:
                    actionChoiceFlag = false;
            }
        } while (actionChoiceFlag);
    }

    public static void _viewResource() {
        Resource.bookList.forEach((key, value) -> System.out.println(key + ":" + value));
    }

    public static void _guestAccess() {
        System.out.println("You have the roles to only READ resources");
        System.out.println("Resources are book list:");
        _viewResource();
        boolean actionChoiceFlag = true;
        do {
            System.out.println("You're allowed for below operations:");
            System.out.println("1. View");
            System.out.println("2. Exit");
            int actionChoice = getChoiceFromUser();
            switch (actionChoice) {
                case 1:
                    _viewResource();
                    break;
                case 2:
                    actionChoiceFlag = false;
            }
        } while (actionChoiceFlag);
    }

    public static void _addUserAndAssignRoles(Map<String, Set<Roles>> userRolesMap) {
        System.out.println("Enter Name");
        User user = new User();
        user.setUsername(getInputFromUser());
        boolean isDone = true;
        System.out.println("Choose roles one at a time to assign to: " + user.getUsername());
        boolean moreRoles = true;
        do {
            for (Roles roles : Roles.values())
                System.out.println(roles.ordinal() + ":" + roles);
            _printMessageToConsole(Roles.values().length + ":Exit", "Make your choice:");
            int rolesChoice = getChoiceFromUser();
            switch (rolesChoice) {
                case 0:
                    assignRoleToUser(userRolesMap, user, Roles.USER);
                    break;
                case 1:
                    assignRoleToUser(userRolesMap, user, Roles.ADMIN);
                    break;
                case 2:
                    assignRoleToUser(userRolesMap, user, Roles.GUEST);
                    break;
                default:
                    break;
            }
            _printMessageToConsole("Assign more roles to : " + user.getUsername() + " ?", "1. Yes\n2. No");
            int moreRolesChoice = getChoiceFromUser();
            if (moreRolesChoice == 2) moreRoles = false;
        } while (moreRoles);
    }

    public static void _revokeRoles(Map<String, Set<Roles>> userRolesMap) {
        System.out.println("Please enter username you wish to revoke roles:");
        String username = getInputFromUser();
        if (userRolesMap.get(username) != null) {
            System.out.println(username + " has below roles :");
            System.out.println(userRolesMap.get(username));
            System.out.println("Please make choice to revoke roles:");
            for (Roles roles : Roles.values())
                System.out.println(roles.ordinal() + ":" + roles);
            int revokeChoice = getChoiceFromUser();
            boolean revokeMoreRoles = true;
            do {
                switch (revokeChoice) {
                    case 0:
                        revokeRoles(userRolesMap, username, Roles.USER);
                        break;
                    case 1:
                        revokeRoles(userRolesMap, username, Roles.ADMIN);
                        break;
                    case 2:
                        revokeRoles(userRolesMap, username, Roles.GUEST);
                        break;
                    default:
                        break;
                }
                if (userRolesMap.get(username).size() != 0) {
                    _printMessageToConsole("Revoke more roles from : " + username + " ?", "1. Yes\n2. No");
                    int moreRolesChoice = getChoiceFromUser();
                    if (moreRolesChoice == 2) revokeMoreRoles = false;
                } else {
                    System.out.println("Revoked all the roles from :" + username);
                    revokeMoreRoles = false;
                }
            } while (revokeMoreRoles);
        } else {
            System.out.println("Entered username does not exists in our system.");
        }
    }

    public static void _printMessageToConsole(String x, String x2) {
        System.out.println(x);
        System.out.println(x2);
    }

    public static void revokeRoles(Map<String, Set<Roles>> userRolesMap, String username, Roles role) {
        if (userRolesMap.get(username).contains(role)) {
            userRolesMap.get(username).remove(role);
            System.out.println("Revoked role" + role + " from :" + username);
        } else {
            System.out.println(username + " does not have  role:" + role);
        }
    }

    private static void assignRoleToUser(Map<String, Set<Roles>> userRolesMap, User user, Roles role) {
        if (userRolesMap.get(user.getUsername()) == null) {
            Set<Roles> roles = getRoles();
            roles.add(role);
            user.setRoles(roles);
            userRolesMap.put(user.getUsername(), user.getRoles());
            printMessageOnConsole(user);
        } else {
            if (userRolesMap.get(user.getUsername()).contains(role)) {
                System.out.println(user.getUsername() + " already has Role : " + role);
            } else {
                user.getRoles().add(role);
                printMessageOnConsole(user);
            }
        }
    }

    public static void printMessageOnConsole(User user) {
        System.out.println("Assigned " + user.getRoles() + " to " + user.getUsername());
    }

    public static Set<Roles> getRoles() {
        return new HashSet<>();
    }

    public static void makeChoice() {
        System.out.println("Please make a choice:");
        System.out.println("1. Register a user");
        System.out.println("2. Revoke Role from user");
        System.out.println("3. Access resources");
        System.out.println("4. Exit system");
    }

    private static int getChoiceFromUser() {
        return new Scanner(System.in).nextInt();
    }

    private static String getInputFromUser() {
        return new Scanner(System.in).next();
    }
}

