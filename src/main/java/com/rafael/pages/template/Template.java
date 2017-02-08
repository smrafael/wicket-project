package com.rafael.pages.template;

import org.apache.wicket.Component;
import org.apache.wicket.markup.html.WebPage;

import com.rafael.pages.template.panels.FooterPanel;
import com.rafael.pages.template.panels.HeaderPanel;
import com.rafael.pages.template.panels.MenuPanel;

public class Template extends WebPage {

	private static final long serialVersionUID = 1L;
	
	private Component headerPanel;
	private Component footerPanel;
	private Component menuPanel;
	
	public Template() {
		
		add(headerPanel = new HeaderPanel("headerPanel"));
		add(footerPanel = new FooterPanel("footerPanel"));
		add(menuPanel = new MenuPanel("menuPanel"));
		
	}

	public Component getHeaderPanel() {
		return headerPanel;
	}

	public void setHeaderPanel(Component headerPanel) {
		this.headerPanel = headerPanel;
	}

	public Component getFooterPanel() {
		return footerPanel;
	}

	public void setFooterPanel(Component footerPanel) {
		this.footerPanel = footerPanel;
	}

	public Component getMenuPanel() {
		return menuPanel;
	}

	public void setMenuPanel(Component menuPanel) {
		this.menuPanel = menuPanel;
	}
	
}
