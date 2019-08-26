package com.org.enums;

public enum AppUserActionsEnum {

	Settings("Settings"), Password("Password"), Sessions("Sessions"), Logout("Log out");
	String val;

	private AppUserActionsEnum(String val) {
		this.val = val;
	}

	public String getVal() {
		return val;
	}

}
