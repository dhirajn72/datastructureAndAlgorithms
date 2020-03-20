============================================
Author: Dhiraj Kumar
Date:  15/06/19
============================================

To run the application, place it in your working directory and use IDE to run it. Command line is also fine.


ROLES:
    USER
    GUEST
    ADMIN

Note: GUEST has only view access, USER has view and modify access and ADMIN has view,modify and delete access.


Features Implemented:

1) Add User
2) Assign roles to user
3) Access resources based on the roles
4) Revoke roles from user
5) After revoking the access user not allowed to access the resource
6) Deleting resources based on roles
7) Modifying resources based on roles.



Java files:

Main class:
    RoleBasedAuthSystem.java

Others:
    ActionType.java
    Resource.java
    Roles.java
    User.java




