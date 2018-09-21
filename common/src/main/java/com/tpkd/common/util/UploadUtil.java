package com.tpkd.common.util;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;
import java.io.File;
import java.io.IOException;

@Component
public class UploadUtil {
    public  String  getUrl(MultipartFile file,String path) throws IOException {
        String fileName = file.getOriginalFilename();
        File targetFile = new File(path);
        if (!targetFile.exists()) {
            targetFile.mkdirs();
        }
        file.transferTo(new File(targetFile, fileName));
        String filePath = path + "/" + fileName;
        return filePath;
    }
}
