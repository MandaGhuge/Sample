package com.emsrestapi;

import java.util.*;

class EmployeeUnSupportedFieldPatchException extends RuntimeException {
	
	public EmployeeUnSupportedFieldPatchException(Set<String> keys)
	{
		 super("Field " + keys.toString() + " update is not allow.");
	}

}
