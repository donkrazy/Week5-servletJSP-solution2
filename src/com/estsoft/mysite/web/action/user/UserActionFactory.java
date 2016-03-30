package com.estsoft.mysite.web.action.user;

import com.estsoft.web.action.Action;
import com.estsoft.web.action.ActionFactory;

public class UserActionFactory extends ActionFactory {

	@Override
	public Action getAction(String actionName) {
		Action action = null;
		if( "joinform".equals( actionName ) ) {
			action = new JoinFormAction();	
		} else {
			action = new DefaultAction();
		}
		return action;
	}

}
