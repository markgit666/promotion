package com.yinxt.promotion;

import lombok.extern.slf4j.Slf4j;

import java.io.*;

@Slf4j
public class FileTest {

    public void decryptFile() {
        File file = new File("/Users/yinxiaotian/文件/第五章(1).pdf");
        InputStream inputStream = null;
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        OutputStream outputStream = null;
        try {
            inputStream = new FileInputStream(file);
            bufferedInputStream = new BufferedInputStream(inputStream);
            File targetFile = new File("/Users/yinxiaotian/文件/第五章.doc");
            outputStream = new FileOutputStream(targetFile);
            bufferedOutputStream = new BufferedOutputStream(outputStream);
            byte[] bytes = new byte[bufferedInputStream.available()];
            int length = bufferedInputStream.read(bytes);
            while (length != -1) {
                bufferedOutputStream.write(bytes, 0, length);
                length = bufferedInputStream.read(bytes);
            }
            bufferedOutputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                inputStream.close();
                outputStream.close();
                bufferedInputStream.close();
                bufferedOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    public void testSubstring() {
        String fileNo = "IMG201910300055";
        log.info("截取fileNo:{}", fileNo.substring(3, 11));
    }

    public void testReplace() {
        String content = "<p>【量表小助手】尊敬的用户您好，您的验证码为code，如非本人操作，请检查账号安全，该验证码将在10分钟后失效，谢谢！</p>";
        content = content.replace("code", "123456");
        log.info("content:{}", content);
    }

}
