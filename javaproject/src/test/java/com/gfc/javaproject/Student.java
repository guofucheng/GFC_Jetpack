package com.gfc.javaproject;

/**
 * @Description: java类作用描述
 * @Author: Mark Guo
 * @CreateDate: 2021/8/23 9:50
 * @UpdateUser:
 * @UpdateDate: 2021/8/23 9:50
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class Student <T>{

    private T score;

    public T getScore() {
        return score;
    }

    public void setScore(T score) {
        this.score = score;
    }



}
