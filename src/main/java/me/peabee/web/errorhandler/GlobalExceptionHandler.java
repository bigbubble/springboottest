package me.peabee.web.errorhandler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.NoHandlerFoundException;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by pengbo on 18-4-24.
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Object defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception {

        if (isJSONResult(req)) {
            ErrorInfo<String> r = new ErrorInfo<>();
            r.setMessage(e.getMessage());
            r.setCode(ErrorInfo.ERROR);
            r.setData("Some Data");
            r.setUrl(req.getRequestURL().toString());
            return r;
        } else {
            ModelAndView mv = new ModelAndView();
            mv.addObject("e", e);
            mv.addObject("url", req.getRequestURL());
            mv.setViewName("error");
            return mv;
        }
    }


    @ResponseBody
    @ExceptionHandler(value = NoHandlerFoundException.class)
    public Object pageNoFoundHandler(HttpServletRequest req, Exception e) throws Exception {
        if (isJSONResult(req)) {
            ErrorInfo<String> r = new ErrorInfo<>();
            r.setMessage(e.getMessage());
            r.setCode(ErrorInfo.ERROR);
            r.setData("Some Data");
            r.setUrl(req.getRequestURL().toString());
            return r;
        } else {
            ModelAndView mv = new ModelAndView();
            mv.addObject("e", e);
            mv.addObject("url", req.getRequestURL());
            mv.setViewName("error");
            return mv;
        }
    }

    /**
     * 返回数据类型是否时JSON
     *
     * @param request
     * @return
     */
    private boolean isJSONResult(HttpServletRequest request) {
        //TODO
        if (request.getRequestURL().toString().contains("subject")) return true; //test code
        return false;
    }
}
