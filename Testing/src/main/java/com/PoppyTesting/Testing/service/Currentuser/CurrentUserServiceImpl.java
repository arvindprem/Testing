package com.PoppyTesting.Testing.service.Currentuser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.PoppyTesting.Testing.Model.CurrentUser;
import com.PoppyTesting.Testing.Model.Role;
@Service
public class CurrentUserServiceImpl implements CurrentUserService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CurrentUserDetailsService.class);

    @Override
    public boolean canAccessUser(CurrentUser currentUser, String userId) {
        LOGGER.debug("Checking if user={} has access to user={}", currentUser, userId);
        return currentUser != null
                && (currentUser.getRole().equals(Role.ADMIN.name()) || currentUser.getId().equals(userId));
    }

}