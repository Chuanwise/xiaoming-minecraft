package com.chuanwise.xiaoming.minecraft.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Objects;

/**
 * 使用 MD5 加密数据的工具类
 * @author Chuanwise
 */
public class MD5Utils {
    final MessageDigest MD5;
    public static final MD5Utils INSTANCE = new MD5Utils();

    {
        MessageDigest MD;
        try {
            MD = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            MD = null;
            System.exit(-1);
        }
        MD5 = MD;
    }

    public byte[] getMD5(byte[] inputs) {
        if (Objects.nonNull(MD5)) {
            return MD5.digest(inputs);
        } else {
            return inputs;
        }
    }

    public byte[] getMD5(String inputs) {
        return getMD5(inputs.getBytes());
    }
}
