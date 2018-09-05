package com.PoppyTesting.Testing.service.Currentuser;

import com.PoppyTesting.Testing.Model.CurrentUser;

public interface CurrentUserService {

    boolean canAccessUser(CurrentUser currentUser, String userId);

}
