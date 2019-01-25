package org.spring.intercept;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: luolifeng
 * Date: 2019-01-25
 * Time: 14:12
 */
public class MyInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse, Object o) throws Exception {
        System.out.printf("object=%s\n",o );

        System.out.printf("getServerName=%s\n",httpServletRequest.getServerName() );
        return true;
    }

    @Override
    public void postHandle(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        System.out.println("往"+modelAndView.getViewName()+"跳转 ");
       Object country= modelAndView.getModel().get("country");
        System.out.println("country 的值 "+country);
        String word = "空值";
        if(country!=null) {
            word=country.toString();
        }
        String newWord = word.replace("国", "**");
        modelAndView.getModel().put("myName", newWord);
        httpServletRequest.setAttribute("myName", newWord);
        System.out.println("postHandle");
    }

    @Override
    public void afterCompletion(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        System.out.println("afterCompletion:可以记录异常");
    }
}
