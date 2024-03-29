package org.test.memsource.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * POJO representing JSON for the token request from the Memsource API.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TokenRequest implements Serializable {

    private String userName;

    private String password;
}
