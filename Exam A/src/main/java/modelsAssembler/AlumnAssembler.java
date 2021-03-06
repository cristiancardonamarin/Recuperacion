package modelsAssembler;

import javax.servlet.http.HttpServletRequest;

import models.Alumn;

public class AlumnAssembler {
	public static Alumn assemblerUserFrom(HttpServletRequest req) {
		Alumn user = new Alumn();
		String name = req.getParameter("name");
		Integer age = Integer.parseInt(req.getParameter("age"));
		String fct = req.getParameter("fct");
		Integer enterprise = Integer.parseInt(req.getParameter("enterprise"));

		user.setName(name);
		user.setAge(age);
		user.setFct(goingToFct(fct));
		user.setEnterprise(enterprise);
		return user;
	}

	public static boolean goingToFct(String value) {
		if (value == "si")
			return true;
		else if (value == "no")
			return false;
		else
			return false;
	}
}
