package com.cz.zenofdesign.part4.chapter34.invokerandchainofresponsibility;

/**
 * @ClassName: FileManager
 * @date: 2019/7/16  15:05
 * @author: guohao
 * @Description: 文件管理类
 */
public class FileManager {

    /**
     * ls命令
     * @param path
     * @return
     */
    public static String ls(String path){
        return "file1\nfile2\nfile3\nfile4";
    }

    /**
     * ls_l命令
     * @param path
     * @return
     */
    public static String ls_l(String path){
        String str = "drw-rw-rw root system 1024 2009-8-20 10:23 file1\n";
        str = str + "drw-rw-rw root system 1024 2009-8-20 10:23 file2\n";
        str = str + "drw-rw-rw root system 1024 2009-8-20 10:23 file3\n";
        return str;
    }

    /**
     * ls_a命令
     * @param path
     * @return
     */
    public static String ls_a(String path){
        String str = ".\n..\nfile1\nfile2\nfile3";
        return str;
    }

}
