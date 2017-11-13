package web;

import javafx.scene.input.DataFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by Zhao Qing on 2017/11/13.
 */
@Controller
public class HomeController {

    @RequestMapping(value = "/home")
    public String home(){
        System.out.println("hello");
        return "home";
    }

    @RequestMapping(value = "/hello")
    @ResponseBody
    public String hello(){
        Date now = Calendar.getInstance().getTime();
        return "<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "    <tilte>spring demo</tilte>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <h1>hello</h1>\n" +
                "<div style=\"color:#00FF00\">time:" + now + "</div>" +
                "</body>\n" +
                "</html>";
    }
}
