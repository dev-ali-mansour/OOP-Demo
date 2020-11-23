/**
 * OOP Android Application developed by: Ali Mansour
 * Copyright © 2020 YAT Learning Solutions. All Rights Reserved.
 * This file may not be redistributed in whole or significant part.
 * ----------------- OOP IS FREE SOFTWARE ------------------
 * https://www.alimansour.dev   |   dev.ali.mansour@gmail.com
 */

public interface Authentication {

    public boolean login(String userName, String passowrd);

    public void register(String firstName, String lastName, String userName, String password);

    public void resetPassword(int userId, String newPassword);

    public void activateEmail(String email);
}
