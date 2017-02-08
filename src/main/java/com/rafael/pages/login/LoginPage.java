package com.rafael.pages.login;

import org.apache.wicket.spring.injection.annot.SpringBean;

import com.rafael.dao.person.PersonDao;
import com.rafael.pages.template.Template;


public class LoginPage extends Template {

	private static final long serialVersionUID = 1L;

	@SpringBean
	private PersonDao personDao;
	
	public LoginPage() {
		super();
		personDao.play();
		getMenuPanel().setVisible(true);
	}

}
