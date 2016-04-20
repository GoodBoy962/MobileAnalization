package com.salats.utils;

import com.salats.model.User;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 * Created by aleksandrpliskin on 20.04.16.
 */
public class SecurityUtils {

    public static User getCurrentUser() {
        return ((User) SecurityContextHolder.getContext().getAuthentication().getPrincipal());
    }

}
