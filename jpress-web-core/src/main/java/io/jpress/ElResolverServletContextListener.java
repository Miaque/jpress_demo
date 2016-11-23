package io.jpress;

import com.jfinal.plugin.activerecord.ModelRecordElResolver;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.jsp.JspApplicationContext;
import javax.servlet.jsp.JspFactory;

public class ElResolverServletContextListener implements ServletContextListener {

    public void contextInitialized(ServletContextEvent sce) {
        ServletContext sc = sce.getServletContext();
        JspApplicationContext jac = JspFactory.getDefaultFactory().getJspApplicationContext(sc);
        jac.addELResolver(new ModelRecordElResolver());
    }

    public void contextDestroyed(ServletContextEvent sce) {
    }
}