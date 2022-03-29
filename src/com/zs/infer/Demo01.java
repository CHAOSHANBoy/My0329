package com.zs.infer;

/**
 * @ClsaaName:
 * @Auther:zs
 * @Date2021/11/23 11:05
 * Description:jdk8 新特性 增加了static 修饰普通方法 和default 修饰普通方法
 *                      之前是只能公开抽象方法
 */
public interface Demo01 {

    static void rum(){
        System.out.println("静态static在 接口中 去修饰普通方法");
    }
}
