package org.brightworks.friflow.admin.service;

import org.brightworks.friflow.admin.dto.UserAccountDTO;

import java.util.Optional;

/**
 * Created by kyel on 8/14/2016.
 */
public interface UserService {

    UserAccountDTO findById(Long id);

    UserAccountDTO save(UserAccountDTO dto) throws Exception;

    Optional<String> createToken(String username, String password);
}
