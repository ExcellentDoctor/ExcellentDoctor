package com.tpkd.common.util;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;
import java.io.File;
import java.io.IOException;

/**
 * @author jyk
 */
@Component
public class UploadUtil {

    public final static String TypeFail = "typeFail";

    public  String  getUrl(MultipartFile file,String path) throws IOException {
        String fileName = file.getOriginalFilename();
        File targetFile = new File(path);
        String suffer=fileName.substring(fileName.indexOf(".")+1);
        if(suffer.equals("jpg")||suffer.equals("jpeg")) {
            if (!targetFile.exists()) {
                targetFile.mkdirs();
            }
            file.transferTo(new File(targetFile, fileName));
            String filePath = path + "/" + fileName;
            return filePath;
        }
        return TypeFail;
    }
}
