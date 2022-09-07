package com.saeyan.controller.action;



public class ActionFactory {
	private static ActionFactory instance = new ActionFactory();
	
	private ActionFactory() {
		super();
	}
		
	public static ActionFactory getInstance() {
		return instance;
	}

	public Action getAction(String command) {
		Action action = null;
		System.out.println("ActionFactory : "+ command);
		
		if(command.equals("employee_list")) {
			action = new EmployeeListAction();
		} else if(command.equals("employee_write_form")) {
			action = new EmployeeFormAction(); 
		}else if(command.equals("employee_write")) {
			action = new EmployeeWriteAction();
		}else if(command.equals("employee_view")) {
			action = new EmployeeViewAction();
		}else if(command.equals("employee_updateform")) {
			action = new EmployeeUpdateFormAction();
		}else if (command.equals("employee_update")) {
			action = new EmployeeUpdateAction();
		}else if (command.equals("employee_delete")) {
			action = new EmployeeDeleteAction();
		}else if(command.equals("employee_check_pass_form")) {
			action = new EmployeeCheckPassFormAction();
		}else if(command.equals("employee_check_pass")) {
			action = new EmployeeCheckPassAction();
		}
		
		return action;
	}
		
}
