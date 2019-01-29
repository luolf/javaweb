package org.spring.intercept;

import com.alibaba.fastjson.JSON;
import org.spring.beans.bo.ResponseBaseVo;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: luolifeng
 * Date: 2019-01-28
 * Time: 14:42
 */
@ControllerAdvice
public class MyResponseBodyAdvice implements ResponseBodyAdvice {
    @Override
    public boolean supports(MethodParameter methodParameter, Class aClass) {
        return true;
    }

    @Override
    public Object beforeBodyWrite(Object o, MethodParameter methodParameter, MediaType mediaType, Class aClass, ServerHttpRequest serverHttpRequest, ServerHttpResponse serverHttpResponse) {



        ResponseBaseVo<Object> rp=new ResponseBaseVo<>();
        rp.setBody(o);
        rp.setVersion("1.0");
        System.out.printf("url=%s,body=%s , result=%s \n",serverHttpRequest.getURI().toString(), JSON.toJSONString(o),JSON.toJSONString(rp));
        return rp;
    }
}
