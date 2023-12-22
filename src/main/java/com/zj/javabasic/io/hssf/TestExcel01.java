package com.zj.javabasic.io.hssf;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddress;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


/**
 * @projectName: Java_Basic
 * @package: com.zj.javabasic.io.hssf
 * @className: TestExcel01
 * @author: By zhangjun
 * @description: TODO
 * @date: 2023/12/19 13:45
 * @version: 1.0
 */
public class TestExcel01 {
    public static void main(String[] args) throws IOException {
        try( HSSFWorkbook workbook = new HSSFWorkbook()) {
            // 定义excel表格
            HSSFCellStyle style = workbook.createCellStyle();
            HSSFSheet sheet = workbook.createSheet("周明细");
            CellRangeAddress regionx = new CellRangeAddress(0, 0, 0, 5);
            sheet.addMergedRegion(regionx);
            // 表头数据
            List<String> title = new ArrayList<String>();
            title.add("序号");
            title.add("部门");
            title.add("小组");
            title.add("小组II");
            title.add("事务"); // 3行
            title.add("具体事项"); // 5行
            // 第一行 标题
            HSSFRow row0 = sheet.createRow(0);
            HSSFCell cell_00 = row0.createCell(0);
            cell_00.setCellValue("周计划");
            cell_00.setCellStyle(style);

            // 第二行 表头设置
            HSSFRow row1 = sheet.createRow(1);
            for (int i = 0; i < title.size(); i++) {
                String s = title.get(i);
                HSSFCell cell = row1.createCell(i);
                cell.setCellValue(s);
            }
            // 表行数据 第三行开头
            List<ExcelObject> dataList = createData();
            int rowNum = 2;
            for (int i = 0; i < dataList.size(); i++) {
                // 创建行
                ExcelObject excelObject = dataList.get(i);
                Integer rowNumTaskDeatil = excelObject.getTaskDeatil().size();
                for (int j = 0; j < rowNumTaskDeatil; j++) {
                    HSSFRow row = sheet.createRow(rowNum);
                    // 填充列数据
                    HSSFCell cell0 = row.createCell(0);
                    HSSFCell cell1 = row.createCell(1);
                    HSSFCell cell2 = row.createCell(2);
                    HSSFCell cell3 = row.createCell(3);
                    HSSFCell cellTAsk4 = row.createCell(4);
                    HSSFCell cellTAskDetail5 = row.createCell(5);
                    if (j == 0) {
                        cell0.setCellValue(excelObject.getNum());
                        cell1.setCellValue(excelObject.getDepartmentName());
                        cell2.setCellValue(excelObject.getGroupName());
                        cell3.setCellValue(excelObject.getSubGroupName());
                    }
                    //事务设置  创建多行用于合并使用
                    if (j < excelObject.getTask().size()) {
                        cellTAsk4.setCellValue(excelObject.getTask().get(j));
                    }
                    // 设置事项明细
                    cellTAskDetail5.setCellValue(excelObject.getTaskDeatil().get(j));
                    rowNum = rowNum + 1;
                }
                // 合并 序号
                CellRangeAddress region01 = new CellRangeAddress(i * 5 + 2, i * 5 + 6, 0, 0);
                sheet.addMergedRegion(region01);
                // 合并 部门
                CellRangeAddress region02 = new CellRangeAddress(i * 5 + 2, i * 5 + 6, 1, 1);
                sheet.addMergedRegion(region02);
                // 合并 小组
                CellRangeAddress region03 = new CellRangeAddress(i * 5 + 2, i * 5 + 6, 2, 2);
                sheet.addMergedRegion(region03);
                // 合并 小组2
                CellRangeAddress region04 = new CellRangeAddress(i * 5 + 2, i * 5 + 6, 3, 3);
                sheet.addMergedRegion(region04);

                // 合并事务
                CellRangeAddress region05 = new CellRangeAddress(i * 5 + 4, i * 5 + 6, 4, 4);
                sheet.addMergedRegion(region05);
            }
            // 文件输出
            String fileName = "D:\\java\\test\\test-" + System.currentTimeMillis() + ".xls";
            File file = new File(fileName);
            FileOutputStream fout = new FileOutputStream(file);
            workbook.write(fout);
            fout.close();
            System.out.println("导出完成fileName=" + fileName);
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    /**
     * 模拟数据 10行
     *
     * @return
     */
    private static List<ExcelObject> createData() {
        List<ExcelObject> dataList = new ArrayList<ExcelObject>();
        for (int i = 0; i < 10; i++) {
            int num = i + 1;
            ExcelObject rowList = new ExcelObject();
            rowList.setNum(num);
            rowList.setDepartmentName("部门-" + num);
            rowList.setGroupName("小组-" + num);
            rowList.setSubGroupName("小组II-" + num);
            rowList.setTask(createData03(num));
            rowList.setTaskDeatil(createData05(num));
            dataList.add(rowList);
        }
        return dataList;
    }

    /**
     * 创建三个子项,用于事务
     */
    private static List<String> createData03(Integer num) {
        List<String> list = new ArrayList<String>(3);
        for (int i = 1; i <= 3; i++) {
            list.add(num + "-事务子项-" + i);
        }
        return list;
    }

    /**
     * 创建5个子项,用于具体事项
     */
    private static List<String> createData05(Integer num) {
        List<String> list = new ArrayList<String>(3);
        for (int i = 1; i <= 5; i++) {
            list.add(num + "-具体事子项-" + i);
        }
        return list;

    }
}
