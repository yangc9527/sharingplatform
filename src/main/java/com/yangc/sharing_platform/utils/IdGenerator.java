package com.yangc.sharing_platform.utils;

import java.util.UUID;

/**
 * 长ID生成器
 */
public final class IdGenerator {

    /**
     * 生成用户长ID
     *
     * @return 用户长ID
     */
    public static String generateUserId() {

        return UUID.randomUUID().toString().replaceAll("-", "");
    }


}
