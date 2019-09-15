package com.wordguesser.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

@Controller
public class FileUploadController {
    private   static  final String UPLOAD_DIRECTORY = "src/main/resources/uploads/";
    private  static final Logger LOG= Logger.getLogger( FileUploadController.class.getName() );

    @GetMapping("/")
    public  String uploadPage() {
        return  "uploadView";
    }

    @PostMapping("/upload")
    public  String singleFileUpload(@RequestParam("file") MultipartFile file,
                                    RedirectAttributes redirectAttributes){
        if (file.isEmpty()){
            redirectAttributes.addFlashAttribute("message", "Please select a file to upload");
            return "redirect:uploadStatus";
        }

        try {
            byte[] bytes = file.getBytes();
            Path path = Paths.get(UPLOAD_DIRECTORY+file.getOriginalFilename());
            Files.write(path,bytes);

            redirectAttributes.addFlashAttribute("message",
                    "You successfully uploaded '" + file.getOriginalFilename() + "'");


        } catch (IOException e) {
            LOG.log(Level.SEVERE ,e.getMessage(),e);
        }
        return "redirect:/uploadStatus";
    }

    @GetMapping("/uploadStatus")
    public String uploadStatus() {
        return "uploadStatus";
    }

}
