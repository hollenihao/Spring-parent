package com.controller;


import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.InputStreamSource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.net.URLConnection;
import java.net.URLEncoder;

@Controller
public class FileController {
    public static final String FILE_DIRECTORY = "/D";

    /**
     *上传文件
     */
    @PostMapping("/upload")
    public String upload(MultipartFile multipartFile){
        //得到上传文件的名字，一般要改名
       String filename =  multipartFile.getOriginalFilename();
       //上传保存的路径——Fileseparate是保存的路径+上传的名
        String path =FILE_DIRECTORY + File.separator + filename;
        //放进File（文件）规范字符串换成文件格式
        File file = new File(path);

        try {
            multipartFile.transferTo(file);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "ok";
    }

    @PostMapping("/download")
    public ResponseEntity<InputStreamSource> download(String filename) throws UnsupportedEncodingException, FileNotFoundException {
        //将下载路径和下载文件名
        String fullPath = FILE_DIRECTORY + File.separator + filename;

        //需要将字符串换成文件格式
        File file = new File(fullPath);
        //guessContTypeFromName这个方法是依据文件名得到媒体类型也就是mimel类型
        //比如image/jpeg,application/json
        String mediaType = URLConnection.guessContentTypeFromName(filename);
        if (mediaType == null){
            //识别不了的交给它， 一般用来表示下载二进制数据
            mediaType = MediaType.APPLICATION_ATOM_XML_VALUE;
        }
        System.out.println("mediaType = " + mediaType);
        HttpHeaders respHeaders = new HttpHeaders();
        /**
         * HttpHeaders：http标题
         * setContentType：设置内容类型
         * parseMediaType：解析媒体类型
         *
         */
        respHeaders.setContentType(MediaType.parseMediaType(mediaType));
        /**
        setcontdispositionformData：设置内容处置表数据
            attachment:附件意思，叫浏览器弹出窗口：另存为
        inline是直接在浏览器下载
            需要编码URL处理，否则另存为对话框不能显示中文
         */
        respHeaders.setContentDispositionFormData("attachment",
                URLEncoder.encode(filename,"UTF-8"));
        //下载：将文件转成输入资源流，是以流形式下载，二进制
        InputStreamResource inputStreamResource = new InputStreamResource(new
                FileInputStream(file));
        //ResponseEntity:响应实体类
        return new ResponseEntity<>(inputStreamResource,respHeaders, HttpStatus.OK);
    }
}
