/*
 * Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.carbon.security.jaas.util;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * This class holds the constants used by the security module.
 */
public class CarbonSecurityConstants {

    public static final String CARBON_HOME = "carbon.home";

    public static final String HTTP_AUTHORIZATION_PREFIX_BEARER = "Bearer";
    public static final String HTTP_AUTHORIZATION_PREFIX_BASIC = "Basic";

    public static final String USERNAME_PASSWORD_LOGIN_MODULE = "USERNAME_PASSWORD_LM";
    public static final String JWT_LOGIN_MODULE = "JWT_LM";
    public static final String SAML_LOGIN_MODULE = "SAML_LM";

    public static Path getCarbonHomeDirectory() {
        return Paths.get(System.getProperty(CARBON_HOME));
    }

    private CarbonSecurityConstants() {

    }
}
