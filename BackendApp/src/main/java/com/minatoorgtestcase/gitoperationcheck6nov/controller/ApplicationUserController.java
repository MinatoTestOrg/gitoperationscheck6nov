package com.minatoorgtestcase.gitoperationcheck6nov.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.slf4j.ext.XLogger;
import org.slf4j.ext.XLoggerFactory;
import com.vs.rappit.base.factory.InstanceFactory;
import com.minatoorgtestcase.gitoperationcheck6nov.base.controller.ApplicationUserBaseController;
import com.minatoorgtestcase.gitoperationcheck6nov.service.IApplicationUserService;
import com.minatoorgtestcase.gitoperationcheck6nov.service.ApplicationUserService;
import com.minatoorgtestcase.gitoperationcheck6nov.model.ApplicationUser;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
@RestController
@RequestMapping(path = "/rest/applicationusers/", produces = "application/json")
public class ApplicationUserController extends ApplicationUserBaseController<IApplicationUserService<ApplicationUser>, ApplicationUser> {

	public ApplicationUserController(ApplicationUserService applicationUserService) {
		super(applicationUserService);
	}
	
		
	
	
}
