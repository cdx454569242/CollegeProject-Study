package com.atguigu.demo.excel;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;

public class ExcelListener extends AnalysisEventListener<ExcelDemoData> {
    @Override
    public void invoke(ExcelDemoData excelDemoData, AnalysisContext analysisContext) {
        System.out.println("****" + excelDemoData);
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {

    }
}
