package org.example.structural.adapter.defaultInterface;


import org.example.structural.adapter.classBased.Sort;

public class Client {
    public static void main(String[] args) {
        Sort sort;  //针对抽象目标接口编程
        sort = (Sort) XMLUtil.getBean(); //读取配置文件，反射生成对象
        int scores[] = {84,76,50,69,90,91,88,96}; //定义成绩数组

        System.out.println("成绩排序结果：");
        sort.sort(scores);

        //遍历输出成绩
        for(int i : scores) {
            System.out.print(i + ",");
        }
        System.out.println();
    }
}
