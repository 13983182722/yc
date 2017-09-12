package com.yc.controller.interceptor;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.yc.pojo.ActiveUser;
import com.yc.pojo.SysPermission;
import com.yc.utils.ResourcesUtil;

public class PermissionInterceptor implements HandlerInterceptor {

	// 在进入controller方法之前执行
	// 使用场景：比如身份认证校验拦截，用户权限拦截，如果拦截不放行，controller方法不再执行
	// 进入action方法前要执行
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		// TODO Auto-generated method stub
		// 用户访问地址：
		String url = request.getRequestURI();

		// 校验用户访问是否是公开资源地址(无需认证即可访问)
		List<String> open_urls = ResourcesUtil.gekeyList("publicURL");
		// 用户访问的url
		for (String open_url : open_urls) {
			if (url.indexOf(open_url) >= 0) {
				// 如果访问的是公开 地址则放行
				return true;
			}
		}
		//从 session获取用户公共访问地址（认证通过无需分配权限即可访问）
		List<String> common_urls = ResourcesUtil.gekeyList("commonURL");
		// 用户访问的url
		for (String common_url : common_urls) {
			if (url.indexOf(common_url) >= 0) {
				// 如果访问的是公共地址则放行
				return true;
			}
		}
		// 从session获取用户权限信息

		HttpSession session = request.getSession();

		ActiveUser activeUser = (ActiveUser) session.getAttribute("activeUser");

		// 取出session中权限url
		// 获取用户操作权限
		List<SysPermission> permission_list = activeUser.getPermissions();
		// 校验用户访问地址是否在用户权限范围内
		for (SysPermission sysPermission : permission_list) {
			String permission_url = sysPermission.getUrl();
			if (url.contains(permission_url)) {
				return true;
			}
		}

		// 跳转到页面
		request.getRequestDispatcher("/WEB-INF/views/refuse.jsp").forward(
				request, response);
		return false;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		
	}
}
