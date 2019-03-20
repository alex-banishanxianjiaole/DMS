package com.app.legend.dms.utils;

import android.content.Context;

import java.io.File;
import java.io.FileNotFoundException;

public class FileUtil {

//    public static void createFile(Context context,String name){
//
//        File file=new File(context.getFilesDir(),name);
//        if (!file.exists()){
//
//            try {
//                context.openFileOutput(name,Context.MODE_PRIVATE);
//            } catch (FileNotFoundException e) {
//                e.printStackTrace();
//            }
//        }
//
//    }

    public static void createFile(Context context,String name,boolean isF){

        File file=new File(context.getFilesDir(),name);

        if (isF){
            try {
                context.openFileOutput(name,Context.MODE_PRIVATE);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }else if (!file.exists()){

            try {
                context.openFileOutput(name,Context.MODE_PRIVATE);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

    }
    public static void downloadFile(Context context){
        NetUtil.Download("https://github.com/liuzhushaonian/DMS/releases/download/0.1-beta/comic",context);

    }

    public static void downloadFileByOne(Context context){
        NetUtil.downloadFileByOne("https://github.com/liuzhushaonian/DMS/releases/download/0.1-beta/comic",context);

    }


    /**
     * 删除文件
     */
    public static void deleteFile(Context context,String name){

        File file=new File(context.getFilesDir(),name);
        if (file.exists()){

           file.delete();
        }

    }

}