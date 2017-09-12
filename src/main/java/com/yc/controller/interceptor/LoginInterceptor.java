package com.yc.controller.interceptor;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.yc.pojo.ActiveUser;
import com.yc.utils.ResourcesUtil;

public class LoginInterceptor implements HandlerInterceptor {
	
	// 在进入controller方法之前执行
	// 使用场景：比如身份认证校验拦截，用户权限拦截，如果拦截不放行，controller方法不再执行
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		
		// 校验用户访问是否是公开资源地址(无需认证即可访问)
		List<String> open_urls = ResourcesUtil.gekeyList("publicURL");
		
		// 用户访问的url
		String url = request.getRequestURI();
		for (String open_url : open_urls) {
			System.out.println(open_url);
			if (url.indexOf(open_url) >= 0) {
				// 如果访问的是公开 地址则放行
				return true;
			}
		}

		// 校验用户身份是否认证通过
		HttpSession session = request.getSession();
		ActiveUser activeUser = (ActiveUser) session.getAttribute("activeUser");
		if (activeUser != null) {
			// 用户已经登陆认证，放行
			return true;
		}
		// 跳转到登陆页面
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request,
				response);
		return false;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		
	}


}
