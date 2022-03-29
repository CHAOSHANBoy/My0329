package com.zs.Default;

import java.util.zip.DeflaterOutputStream;

public interface Demo01 {
    default void rum(){
        System.out.println("在接口中 用默认修饰符 去修饰普通方法");
    }
}
