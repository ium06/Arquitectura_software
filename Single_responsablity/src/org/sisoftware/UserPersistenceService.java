package org.sisoftware;

public class UserPersistenceService {

    private Store store = new Store();

    private UserValidator validator = new UserValidator();

    public String saveUser(User user){
        if (validator.isValidUser(user)) {
            store.store(user);
            return "SUCCESS";
        }
        return "ERROR";
    }

}
