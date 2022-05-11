package com.jesperapps.api.User.repository;

import com.jesperapps.api.User.model.*;
import org.springframework.data.jpa.repository.*;

public interface UserRepository extends JpaRepository<User, Long> {
}
