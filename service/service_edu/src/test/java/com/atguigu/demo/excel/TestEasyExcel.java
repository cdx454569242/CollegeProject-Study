package com.atguigu.demo.excel;

import com.alibaba.excel.EasyExcel;

import java.util.ArrayList;
import java.util.List;

public class TestEasyExcel {
    public static void main(String[] args) {

//        String filename = "C:\\Users\\Administrator\\Desktop\\testWrite.xlsx";
//        EasyExcel.write(filename,ExcelDemoData.class).sheet("学生列表").doWrite(getDemo());

        String filename = "C:\\Users\\Administrator\\Desktop\\test.xlsx";
        EasyExcel.read(filename,ExcelDemoData.class,new ExcelListener()).sheet().doRead();
    }

    private static List<ExcelDemoData> getDemo(){
        List<ExcelDemoData> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            ExcelDemoData data = new ExcelDemoData();
            data.setSno(i);
            data.setSname("name " + i);
            list.add(data);
        }
        return list;

    }
}
