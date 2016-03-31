package com.estsoft.mysite.web.action.user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.estsoft.web.WebUtil;
import com.estsoft.web.action.Action;

public class ModifyFormAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		HttpSession session = request.getSession();
//		UserVo authUser = session.getAttribute( "");
//		
//		UserVo userVo = dao.get( userVo.getNo() );
//		
//		request.setAttribute( "UserVo", userVo);
//		WebUtil.forward(request, response, "/WEB-INF/views/user/modifyform.jsp");
	}

}
