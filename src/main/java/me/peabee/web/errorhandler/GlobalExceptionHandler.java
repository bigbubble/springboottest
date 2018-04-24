package me.peabee.web.errorhandler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by pengbo on 18-4-24.
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    public ModelAndView defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception {
        ModelAndView mv = new ModelAndView();
        mv.addObject("e", e);
        mv.addObject("url", req.getRequestURL());
        mv.setViewName("error");
        return mv;
    }


//    @ExceptionHandler(value = Exception.class)
//    public ErrorInfo<String> jsonErrorHandler(HttpServletRequest req, Exception e) throws Exception {
//        ErrorInfo<String> r = new ErrorInfo<>();
//        r.setMessage(e.getMessage());
//        r.setCode(ErrorInfo.ERROR);
//        r.setData("Some Data");
//        r.setUrl(req.getRequestURL().toString());
//        return r;
//    }
}
