package ning.zhou.study.springcloud.eureka;

import lombok.SneakyThrows;
import ning.zhou.study.springcloud.eureka.feignuploadconsumer.EurekaFeignUploadConsumer;
import ning.zhou.study.springcloud.eureka.feignuploadconsumer.service.UploadService;
import org.apache.commons.fileupload.disk.DiskFileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.io.IOUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @author 周宁
 * @Date 2019-06-02 10:30
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = EurekaFeignUploadConsumer.class)
public class FeignUploadConsumerTest {

    @Autowired
    private UploadService uploadService;

    @Test
    @SneakyThrows
    public void testHandleFileUpload(){
        File file = new File("upload.txt");

        DiskFileItem fileItem = (DiskFileItem) new DiskFileItemFactory().createItem("file",MediaType
        .TEXT_PLAIN_VALUE,true,file.getName());
        try (InputStream input = new FileInputStream(file); OutputStream os = fileItem.getOutputStream()) {
            IOUtils.copy(input, os);
        } catch (Exception e) {
            throw new IllegalArgumentException("Invalid file: " + e, e);
        }

        MultipartFile multi = new CommonsMultipartFile(fileItem);

        System.out.println(uploadService.handlFile(multi));
    }


}
