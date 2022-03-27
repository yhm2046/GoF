package com.example.designpatterns

/**
 * 2022.3.27    Sunday
 * 简单工程类，加减乘除类
 */
class OperationAdd : Operation() {
    override fun GetResult(): Int {
        var resule = 0
        resule = _numberA + _numberB
        return resule
    }
}