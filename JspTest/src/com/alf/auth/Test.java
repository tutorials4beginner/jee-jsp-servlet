package com.alf.auth;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Test extends HttpServlet {
	private static final long serialVersionUID = 1L;
	int n = 5;
	int res = 1;

	void show() {

	}

    public Test() {
        super();
    }

    protected void service(HttpServletRequest request, HttpServletResponse response)
    		throws ServletException, IOException {
    	int num = 5;
		for (int i = 1; i <= 5; i++) {
			res *= i;
		}
    }
	
}
