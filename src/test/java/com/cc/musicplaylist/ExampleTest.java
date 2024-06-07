package com.cc.musicplaylist;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ExampleTest {
    /**
     * 定义：用于在所有测试方法之前执行一次的静态方法。这个方法通常用于进行一次性的全局初始化操作，例如设置全局配置、初始化共享资源等。
     * 要求：该方法必须是静态的（即使用 static 关键字）。
     * 执行时机：在所有测试方法之前执行一次，并且仅执行一次
     */
    @BeforeAll  // @BeforeAll 注解，意味着它会在所有测试方法执行之前运行一次。你可以在这个方法中进行一些全局的初始化操作，例如配置浏览器大小和添加日志监听器等。
    public static void setUpAll() {
        // 这个方法会在所有测试方法执行之前运行
        System.out.println("Before all tests");
    }

    /**
     * 定义：用于在每个测试方法执行之前运行的方法。这个方法通常用于每个测试前的初始化操作，例如设置测试环境、重置状态等。
     * 要求：方法不需要是静态的。
     * 执行时机：在每个测试方法之前执行，并且在每个测试方法之前都会执行一次
     */
    @BeforeEach //  @BeforeEach 注解，意味着它会在每个测试方法执行之前运行一次。在这里，你可以进行每个测试之前的初始化操作，例如配置浏览器选项和打开特定的 URL。
    public void setUp() {
        // 这个方法会在每个测试方法执行之前运行
        System.out.println("Before each test");
    }

    @Test
    public void test1() {
        System.out.println("Test 1");
        // 因为你在测试方法 test1 中直接调用了 test2 方法，而不是让 JUnit 框架来执行 test2 方法。这种情况下，Junit 并不会在调用 test2 前再次执行 @BeforeEach 方法。
        // 确保每个测试方法由 JUnit 框架独立执行，而不是在一个测试方法中手动调用另一个测试方法。
        test2();
    }

    @Test
    public void test2() {
        System.out.println("Test 2");
    }

}
